/*
标题: 组素数

    素数就是不能再进行等分的数。比如：2 3 5 7 11 等。
    9 = 3 * 3 说明它可以3等分，因而不是素数。

    我们国家在1949年建国。如果只给你 1 9 4 9 这4个数字卡片，可以随意摆放它们的先后顺序（但卡片不能倒着摆放啊，我们不是在脑筋急转弯！），
    那么，你能组成多少个4位的素数呢？

    比如：1949，4919 都符合要求。


    请你提交：能组成的4位素数的个数，不要罗列这些素数!!

    注意：不要提交解答过程，或其它的辅助说明文字。*/

import java.util.HashSet;
import java.util.Set;

//素数判定、素数生成（筛法）、质因数分解
//有重复元素的全排列+检查
public class _02组素数 {

  /**
   * 处理从k开始的排列
   * @param arr
   * @param k
   */
  static void f(int[] arr, int k) {
    if (k == 4)//前面都已确定
      check(arr);

    for (int i = k; i < 4; i++) {
      //交换
      int t = arr[k];
      arr[k] = arr[i];
      arr[i] = t;

      f(arr, k + 1);

      t = arr[k];
      arr[k] = arr[i];
      arr[i] = t;
    }
  }

  static Set<Integer> set = new HashSet<Integer>();

  private static void check(int[] arr) {
    int x = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
    boolean flag = true;
    for (int i = 2; i <= Math.sqrt(x); i++) {
      if (x % i == 0) {
        flag = false;
        System.out.println(x+" false");
        break;
      }
    }
    if (flag) {
      set.add(x);
      System.out.println(x+" true");
    }
  }

  public static void main(String[] args) {
    int[] arr = {1, 4, 9, 9};
    f(arr, 0);
    System.out.println(set.size());
  }
}
