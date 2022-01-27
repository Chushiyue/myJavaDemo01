package src;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		int max = 0;
		int min = 0;
		int ans = arr[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++)
		{
			ans += arr[i];
			
			if (arr[i] < arr[i + 1])
				max = i + 1;
			else if (arr[i] > arr[i + 1])
				min = i + 1;
			else
				continue;
		}
		System.out.println(arr[max]);
		System.out.println(arr[min]);
		
		
		sc.close();
	}

}
