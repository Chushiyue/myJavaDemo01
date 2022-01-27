import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
标题：兴趣小组

为丰富同学们的业余文化生活，某高校学生会创办了3个兴趣小组
（以下称A组，B组，C组）。
每个小组的学生名单分别在【A.txt】,【B.txt】和【C.txt】中。
每个文件中存储的是学生的学号。

由于工作需要，我们现在想知道：
    既参加了A组，又参加了B组，但是没有参加C组的同学一共有多少人？

请你统计该数字并通过浏览器提交答案。

注意：答案是一个整数，不要提交任何多余的内容。

--------------------

笨笨有话说：
    哇塞！数字好多啊！一眼望过去就能发现相同的，好像没什么指望。
不过，可以排序啊，要是每个文件都是有序的，那就好多了。

歪歪有话说：
    排什么序啊，这么几行数字对计算机不是太轻松了吗？
    我看着需求怎么和中学学过的集合很像啊.....

*/
public class _02兴趣小组 {
  public static void main(String[] args) throws IOException {
    int ans=0;
    Set<String> A = new HashSet<String>();
    Set<String> B = new HashSet<String>();
    Set<String> C = new HashSet<String>();
    read(A,"/Users/zhengwei/workspace/lanqiaobei2019/src/2017_Java_C/A.txt");
    read(B,"/Users/zhengwei/workspace/lanqiaobei2019/src/2017_Java_C/B.txt");
    read(C,"/Users/zhengwei/workspace/lanqiaobei2019/src/2017_Java_C/C.txt");
    // System.out.println(A.size());
    // System.out.println(B.size());
    // System.out.println(C.size());
    for (String a:A) {
      if (B.contains(a)&&!C.contains(a))
        ans++;
    }
    System.out.println(ans);
  }

  private static void read(Set<String> set, String path) throws IOException {
    BufferedReader reader=new BufferedReader(new FileReader(path));
    String line="";
    while(true){
      line=reader.readLine();
      if (line==null)break;
      String[] split = line.split(",");//按照逗号分隔
      for (String s:split) {
        String trim = s.trim();
        if (trim.length()>0)
          set.add(trim);//去除空格加入set
      }
    }
    reader.close();
  }
}
