import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
标题：图形排版

    小明需要在一篇文档中加入 N 张图片，其中第 i 张图片的宽度是 Wi，高度是 Hi。
假设纸张的宽度是 M，小明使用的文档编辑工具会用以下方式对图片进行自动排版：

    1. 该工具会按照图片顺序，在宽度 M 以内，将尽可能多的图片排在一行。该行的高度是行内最高的图片的高度。例如在 M=10 的纸张上依次打印 3x4, 2x2, 3x3 三张图片，则效果如下图所示，这一行高度为4。(分割线以上为列标尺，分割线以下为排版区域；数字组成的矩形为第x张图片占用的版面)

0123456789
----------
111
111  333
11122333
11122333

    2. 如果当前行剩余宽度大于0，并且小于下一张图片，则下一张图片会按比例缩放到宽度为当前行剩余宽度(高度向上取整)，然后放入当前行。例如再放入一张4x9的图片，由于剩余宽度是2，这张图片会被压缩到2x5，再被放入第一行的末尾。此时该行高度为5：

0123456789
----------
        44
111     44
111  33344
1112233344
1112233344

    3. 如果当前行剩余宽度为0，该工具会从下一行开始继续对剩余的图片进行排版，直到所有图片都处理完毕。此时所有行的总高度和就是这 N 张图片的排版高度。例如再放入11x1, 5x5, 3x4 的图片后，效果如下图所示，总高度为11：

0123456789
----------
        44
111     44
111  33344
1112233344
1112233344
5555555555
66666
66666777
66666777
66666777
66666777

    现在由于排版高度过高，图片的先后顺序也不能改变，小明只好从 N 张图片中选择一张删除掉以降低总高度。他希望剩余N-1张图片按原顺序的排版高度最低，你能求出最低高度是多少么？

输入：
第一行包含两个整数 M 和 N，分别表示纸张宽度和图片的数量。
接下来 N 行，每行2个整数Wi, Hi，表示第 i 个图大小为 Wi*Hi。

对于30%的数据，满足1<=N<=1000
对于100%的数据，满足1<=N<=100000，1<=M, Wi, Hi<=100

输出：
一个整数，表示在删除掉某一张图片之后，排版高度最少能是多少。

样例输入：
4 3
2 2
2 3
2 2

样例输出：
2

另一个示例，
样例输入：
2 10
4 4
4 3
1 3
4 5
2 1
2 3
5 4
5 3
1 5
2 4

样例输出：
17

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 2000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
不要使用package语句。不要使用jdk1.7及以上版本的特性。
主类的名字必须是：Main，否则按无效代码处理。


*/
public class _10图形排版 {

  static int M, N;
  static int[] f;

  private static class pic {
    int w, h;

  }

  static pic[] pics;

  static private class line {
    int w, h;//已经使用的宽度，当前的高度

    line() {
      w = 0;
      h = 0;
    }

    line(int _w, int _h) {
      w = _w;
      h = _h;
    }

    void add(pic p) {
      /*====这里是引用传递，不能改变_p的内容===*/
      int ww = p.w;
      int hh = p.h;
      if (w + ww > M) {//对图片进行压缩
        hh = (int) (Math.ceil(1.0 * hh * (M - w) / ww));
        ww = M - w;
      }
      // return new line(w + _p.w, Math.max(h, _p.h));
      this.w = w + ww;
      this.h = Math.max(h, hh);
    }

    boolean full() {
      return w == M;
    }

    void clr() {
      w = 0;
      h = 0;
    }
  }


  //在已有的line的基础上，从第k张图开始插入，最终能得到的整体高度
  static int push_till_full(line a, int k) {
    for (; k <= N && !a.full(); ++k) {//在行未满的情况下，添加图片
      a.add(pics[k]);
    }
    if (k <= N)
      return a.h + f[k];
    else
      return a.h;
  }

  public static void main(String[] args) throws FileNotFoundException {
    System.setIn(new FileInputStream(new File("/Users/zhengwei/workspace/lanqiaobei2019/src/2017_Java_C/data10/in8.txt")));

    Scanner sc = new Scanner(System.in);
    M = sc.nextInt();
    N = sc.nextInt();

    f = new int[N + 1];
    pics = new pic[N + 1];

    for (int i = 1; i <= N; ++i) {
      pics[i] = new pic();
      pics[i].w = sc.nextInt();
      pics[i].h = sc.nextInt();
    }

    for (int i = N; i >= 1; --i) {
      f[i] = push_till_full(new line(0, 0), i);//f[i]的含义，i 号图片及其后的图片另起一行插入得到的高度
    }

    line a = new line();//一开始没有宽度和高度,要填充的行
    int ans = Integer.MAX_VALUE;
    // System.out.println((int)1e7);
    int per = 0;//记录之前完整行累计的高度
    for (int i = 1; i <= N; ++i) {
      if (i == 96) {
        i = 96;
      }
      //不要第i张pic
      int new_h = 0;
      //如果现在起新行，可以直接利用f
      if (a.w == 0 && a.h == 0&&i<=N-1)
        new_h = per + f[i + 1];
      else {//如果不是新行，则将a的状态进行拷贝，尝试从i+1张图往后放得出一个新的高度
        int i1 = push_till_full(new line(a.w, a.h), i + 1);
        new_h = per + i1;//历史上完整行的高度是per，从i+1张图插入得出的整体高度由函数计算出
      }

      ans = Math.min(ans, new_h);//用第i+1张图填入a这个line
      a.add(pics[i]);//将第i张图放入，作为下次迭代的line
      if (a.full()) {//行已经填满，要重置line，并且结算一个整行的高度
        per += a.h;
        a.clr();//开启一个新行,空行
      }
    }
    System.out.println(ans);
  }
}
