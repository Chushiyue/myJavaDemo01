/*
平方怪圈

如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
对新产生的正整数再做同样的处理。

如此一来，你会发现，不管开始取的是什么数字，
最终如果不是落入1，就是落入同一个循环圈。

请写出这个循环圈中最大的那个数字。

请填写该最大数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。*/
public class _03平方怪圈 {


  static int extract(int start) {
    String str = start + "";//整数转字符串，i+""
    int ans = 0;
    for (int i = 0; i < str.length(); ++i) {
      ans += (str.charAt(i) - '0') * (str.charAt(i) - '0');
    }
    return ans;
  }

  public static void main(String[] args) {
    int start = 3;
    int cnt = 0;
    while (cnt < 1000) {
      System.out.println(start);
      start = extract(start);
      cnt++;
    }

  }
}
