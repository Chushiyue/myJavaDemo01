import java.util.Scanner;
import java.math.BigInteger;
public class Main05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();

		BigInteger big1 = new BigInteger(num1);
		BigInteger big2 = new BigInteger(num2);

		BigInteger a = big1.multiply(big2);
		System.out.println(a.toString());
	}
}