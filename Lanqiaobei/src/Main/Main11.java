package Main;

import java.util.*;
public class Main11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		Long count = 0L;
		
		
		for(Integer i = 1; i <= n; i++)
		{
			char[] cn = i.toString().toCharArray();
			for(int j = 0 ; j < i.toString().length(); j++)
			{
				if(cn[j] == '1')
					count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}