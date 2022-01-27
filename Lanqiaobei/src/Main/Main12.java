package Main;

import java.util.*;
public class Main12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Character ch = str.charAt(0);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		if(ch == '+')
			c = a + b;
		else if(ch == '-')
			c = a - b;
		else if(ch == '*')
			c = a * b;
		else if(ch == '/')
			c = a / b;
		System.out.println(c);
		sc.close();
	}
}