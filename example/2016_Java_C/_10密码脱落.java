import java.util.Scanner;

/*
密码脱落

X星球的考古学家发现了一批古代留下来的密码。
这些密码是由A、B、C、D 四种植物的种子串成的序列。
仔细分析发现，这些密码串当初应该是前后对称的（也就是我们说的镜像串）。
由于年代久远，其中许多种子脱落了，因而可能会失去镜像的特征。

你的任务是：
给定一个现在看到的密码串，计算一下从当初的状态，它要至少脱落多少个种子，才可能会变成现在的样子。

输入一行，表示现在看到的密码串（长度不大于1000）
要求输出一个正整数，表示至少脱落了多少个种子。

例如，输入：
ABCBA
则程序应该输出：
0

再例如，输入：
ABDCDCBABC
则程序应该输出：
3

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 3000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。
*/
public class _10密码脱落 {
  static String s;

  static int lcs(String s1, String s2, int len) {
    int dp[][] = new int[len][len];
    for (int i = 0; i < len; ++i) {
      if (s1.charAt(i) == s2.charAt(0)) dp[0][i] = 1;
      else dp[0][i] = (i == 0 ? 0 : dp[0][i - 1]);
    }

    for (int j = 0; j < len; ++j) {
      if (s2.charAt(j) == s1.charAt(0)) dp[j][0] = 1;
      else dp[j][0] = (j == 0 ? 0 : dp[j - 1][0]);
    }

    for (int i = 1; i < len; ++i) {
      for (int j = 1; j < len; ++j) {
        if (s2.charAt(i) == s1.charAt(j)) dp[i][j] = dp[i - 1][j - 1] + 1;
        else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
      }
    }
    return dp[len - 1][len - 1];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      s = sc.nextLine();
      int len = s.length();
      int l = lcs(s, new StringBuilder(s).reverse().toString(), len);
      System.out.println(len - l);
    }
  }
}
