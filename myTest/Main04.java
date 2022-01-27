import java.util.Arrays;
import java.util.Scanner;
public class Main04
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("even");
		}
		else if(n % 2 == 1)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("erorr");
		}
	}
}