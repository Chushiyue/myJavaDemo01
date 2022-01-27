package src;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int max;
			if(x > y)
			{
				max = x;
			}
			else
			{
				max = y;
			}
			if(max < z)
			{
				max = z;
			}
			for(int i = max; i <= x * y * z; i++)
			{
				if(i % x == 0 && i % y == 0 && i % z == 0)
				{
					System.out.print(i);
					break;
				}
			}
		}
	}
}