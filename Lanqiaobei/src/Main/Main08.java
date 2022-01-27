package Main;

import java.math.BigInteger;
public class Main08
{
	public static void main(String[] args)
	{
		BigInteger num = BigInteger.valueOf(1);
		BigInteger[] a = new BigInteger[100];
		long count = 0;
		for(int i = 0; i < a.length; i++)
		{
			a[i] = BigInteger.valueOf(i + 1);
			num = num.multiply(a[i]);
		}
		for(BigInteger i = new BigInteger("2"); num.compareTo(i.multiply(i)) > 0; i.add(new BigInteger("1")))
		{
			if(num.mod(i).equals(BigInteger.ZERO))
				count++;
		}
		System.out.println(num);
		System.out.println(count);
	}
}