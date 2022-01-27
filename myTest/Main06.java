import java.util.Scanner;
public class Main06
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the dividend:");
		int a = sc.nextInt();
		System.out.println("Please enter the divisor:");
		boolean w = true;
		while(w)
		{
			int b = sc.nextInt();
			if(b == 0)
			{
				System.out.println("Error: divisor can not be zero! Please enter a new divisor:");
			}
			else
			{
				int c = a / b;
				System.out.println(c);
				w = false;
			}
		}
	}
}