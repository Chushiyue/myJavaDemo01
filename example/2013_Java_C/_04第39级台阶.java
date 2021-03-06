/*
题目标题: 第39级台阶

    小明刚刚看完电影《第39级台阶》，离开电影院的时候，他数了数礼堂前的台阶数，恰好是39级!

    站在台阶前，他突然又想着一个问题：

    如果我每一步只能迈上1个或2个台阶。先迈左脚，然后左右交替，最后一步是迈右脚，也就是说一共要走偶数步。
    那么，上完39级台阶，有多少种不同的上法呢？


    请你利用计算机的优势，帮助小明寻找答案。

要求提交的是一个整数。
注意：不要提交解答过程，或其它的辅助说明文字。
 */

// 同C语言B组第3题

//去掉一个条件：偶数步，只问只能迈上1个或2个台阶的条件下一共有多少种走法呢？
//f(n=39){return f(n-1)+f(n-2)}
public class _04第39级台阶 {
  public static void main(String[] args) {
    f(39, 0);
    System.out.println(ans);
  }

  static int ans;

  private static void f(int n, int steps) {
    if (n < 0) return;
    if (n == 0) {
      if (steps % 2 == 0) ans++;
      return;
    }
    f(n - 1, steps + 1);
    f(n - 2, steps + 1);
  }
}
