import java.math.BigDecimal;
import java.math.BigInteger;

/*
无穷分数

无穷的分数，有时会趋向于固定的数字。
请计算【图1.jpg】所示的无穷分数，要求四舍五入，精确到小数点后5位，小数位不足的补0。

请填写该浮点数，不能填写任何多余的内容。*/
public class _03无穷分数 {
  public static void main(String[] args) {


    BigDecimal fn= new BigDecimal(BigInteger.ONE);//1
    for (int i = 2000; i >=1 ; i--) {

      BigDecimal ii = new BigDecimal(BigInteger.valueOf(i));
      fn= ii.divide(fn.add(ii),6,BigDecimal.ROUND_HALF_UP);
    }
    System.out.println(fn.toPlainString());
  }
}
