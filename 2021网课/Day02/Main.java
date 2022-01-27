import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char a = 'A';
		if (n < m)
		{
			for (int i = 0; i < n; i++)
			{
				for (int k = i; k > -1; k--)
					System.out.print((char)(a + k));
				for (int j = 0; j < m - i - 1; j++)
					System.out.print((char)(a + j + 1));
				System.out.println();
			}
		}
		else
		{
			for (int i = 0; i < m; i++)
			{
				for (int k = i; k > -1; k--)
					System.out.print((char)(a + k));
				for (int j = 0; j < m - i - 1; j++)
					System.out.print((char)(a + j + 1));
				System.out.println();
			}
			for (int i = m; m < n; m++)
			{
				for (int k = 0; k < i; k++)
					System.out.print((char)(a + m - k));
				System.out.println();
			}
			
		}
	}
}

/*
ABCD
BABC
CBAB
DCBA
EDCB
FEDC
*/