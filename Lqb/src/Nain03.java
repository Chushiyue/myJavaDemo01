import java.util.Scanner;
public class Nain03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int num = 0;
		int s = 0;
		for (int i = 5; i <= N; i++)
		{
			for (int j = 2; j < i; j++)
			{
				if (i % j == 0)
					s++;
				if (s == 2)
				{
					num++;
					break;
				}
			}
			s = 0;
		}
		System.out.print(num);
	}
}