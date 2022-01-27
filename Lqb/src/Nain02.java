import java.util.Scanner;
public class Nain02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		sc.close();
		int num = 0;
		for (int i = 1; i <= N; i++)
		{
			if (i % 2 == 0)
				if (i % A == A - 1)
					num++;
		}
		System.out.print(num);
	}
}