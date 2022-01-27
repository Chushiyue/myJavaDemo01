package Main;

import java.util.*;
public class Main09
{
	public static void main(String[] args)
	{
		Integer num = 1;
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			num *= i;
			while(num % 10 == 0)
			{
				num /= 10;
			}
				num %= 10;
//				System.out.println("n = " + i);
//				System.out.println("num:" + num);
		}
		System.out.println(num);
		sc.close();
	}
}