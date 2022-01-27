import java.util.Scanner;
public class Main07n
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[] arr = new int[1000000];
		arr[1] = 1;
		arr[2] = 1;
		for (int i = 3; i <= n; i++)
		{
			arr[i] = (arr[i - 2] + arr[i - 1]) % 10007;
		}
		System.out.println(arr[n]);
	}
}