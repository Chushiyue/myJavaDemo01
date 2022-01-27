import java.util.Scanner;

public class Main02
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
		int target = sc.nextInt();
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == target)
			{
				System.out.println(i + 1);
				break;
			}
			if (i == arr.length - 1 && arr[i] != target)
			{
				System.out.println(-1);
			}
		}

	}
}