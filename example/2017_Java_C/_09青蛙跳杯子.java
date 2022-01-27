
import java.util.*;

/*
标题：青蛙跳杯子

    X星球的流行宠物是青蛙，一般有两种颜色：白色和黑色。
    X星球的居民喜欢把它们放在一排茶杯里，这样可以观察它们跳来跳去。
    如下图，有一排杯子，左边的一个是空着的，右边的杯子，每个里边有一只青蛙。

*WWWBBB

    其中，W字母表示白色青蛙，B表示黑色青蛙，*表示空杯子。

    X星的青蛙很有些癖好，它们只做3个动作之一：
    1. 跳到相邻的空杯子里。
    2. 隔着1只其它的青蛙（随便什么颜色）跳到空杯子里。
    3. 隔着2只其它的青蛙（随便什么颜色）跳到空杯子里。

    对于上图的局面，只要1步，就可跳成下图局面：

WWW*BBB

本题的任务就是已知初始局面，询问至少需要几步，才能跳成另一个目标局面。

输入为2行，2个串，表示初始局面和目标局面。
输出要求为一个整数，表示至少需要多少步的青蛙跳。

例如：
输入：
*WWBB
WWBB*

则程序应该输出：
2

再例如，
输入：
WWW*BBB
BBB*WWW

则程序应该输出：
10

我们约定，输入的串的长度不超过15

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
不要使用package语句。不要使用jdk1.7及以上版本的特性。
主类的名字必须是：Main，否则按无效代码处理。

----------------------------

笨笨有话说：
    我梦见自己是一棵大树，
    青蛙跳跃，
    我就发出新的枝条，
    春风拂动那第 5 层的新枝,
    哦，我已是枝繁叶茂。


*/
public class _09青蛙跳杯子 {

  private static StringBuilder start;
  private static StringBuilder target;
  static Set<String> allState = new HashSet<String>();

  /*1.封装一个持有状态和层次的类*/
  private static class StateAndLevel {
    StringBuilder state;
    int level;
    int pos;//*(空杯子)的位置

    public StateAndLevel(StringBuilder state, int level, int pos) {
      this.state = state;
      this.level = level;
      this.pos = pos;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    start = new StringBuilder(sc.nextLine());
    target = new StringBuilder(sc.nextLine());

    bfs();

  }

  private static void bfs() {
    /*2.将初始状态加入队列*/
    Queue<StateAndLevel> q = new LinkedList<StateAndLevel>();
    q.add(new StateAndLevel(start, 0, start.indexOf("*")));
    allState.add(start.toString());

    /*3.不停弹出队首，一步演化成相邻状态，加入队列（判重）*/
    while (!q.isEmpty()) {
      StateAndLevel front = q.poll();
      StringBuilder state = front.state;
      int level = front.level;
      //和目标值做比对:SB比的是地址，要按内容比，就toString
      if (state.toString().equals(target.toString())) {
        System.out.println(level);
        break;
      }
      int pos = front.pos;
      //可以演化出若干个相邻状态
      for (int i = -3; i <= 3; i++) {
        if (i == 0) continue;
        if (pos + i >= 0 && pos + i < state.length()) {
          StringBuilder new_state = new StringBuilder(state);
          swap(new_state, pos, pos + i);//交换达新状态
          if (!allState.contains(new_state.toString())) {//判重
            q.add(new StateAndLevel(new_state, level + 1, pos + i));//放入队列
            allState.add(new_state.toString());//放入set
          }
        }
      }

    }
  }

  private static void swap(StringBuilder a, int i, int j) {
    char t = a.charAt(i);
    a.setCharAt(i, a.charAt(j));
    a.setCharAt(j, t);
  }
}
