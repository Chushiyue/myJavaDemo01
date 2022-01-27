/**
 * 
 */
package Main;

/**
 * @author ZhaoNing
 *
 */
import java.math.*;
import java.util.*;
public class Main10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BigInteger num = BigInteger.valueOf(1);
		BigInteger[] a = new BigInteger[sc.nextInt()];
		for(int i = 0; i < a.length; i++)
		{
			a[i] = BigInteger.valueOf(i+ 1);
			num = num.multiply(a[i]);
		}
		while(num.mod(BigInteger.TEN) == BigInteger.ZERO)
		{
			num = num.divide(BigInteger.TEN);
		}
		num = num.mod(BigInteger.TEN);
		System.out.println(num);
		sc.close();
	}
}