package no13;

import java.util.Scanner;

public class Main4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 10000; i < 1000000; i++)
		{
			String str = i + "";
			if (str.charAt(0) != str.charAt(str.length() - 1)
					|| str.charAt(1) != str.charAt(str.length() - 2)
					|| str.charAt(2) !=
					str.charAt(str.length() - 3))
				continue;
			else
			{
				int ans = 0;
				for (int k = 0; k < str.length(); k++)
				{
					ans += str.charAt(k);
				}
				ans = ans - 48 * str.length();
				if (ans != num)
					continue;
				else
					System.out.println(str);
			}
			
		}
	}
}