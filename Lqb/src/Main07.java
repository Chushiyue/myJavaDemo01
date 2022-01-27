import java.util.Scanner;
public class Main07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n) % 10007);
	}

	public static int fib(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
}