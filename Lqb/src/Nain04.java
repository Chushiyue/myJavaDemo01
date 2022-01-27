import java.util.Scanner;
public class Nain04
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int num = 0;
		for (int i = 1; i <= N; i++)
		{
			if (Math.pow(Math.pow((double)i, 3), 0.5) == (int)Math.pow(Math.pow((double)i, 3), 0.5))
				num++;
		}
		System.out.println(num);
	}
}