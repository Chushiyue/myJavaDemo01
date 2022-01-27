import java.util.Scanner;

public class Main03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int bot = 0;
		int top = 0;
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++)
		{
			if(arr[top] < arr[i + 1])
				top = i + 1;
			else if (arr[bot] > arr[i + 1])
				bot = i + 1;
			sum += arr[i];
		}
		sum += arr[arr.length - 1];
		System.out.println(arr[top]);
		System.out.println(arr[bot]);
		System.out.println(sum);
	}
}