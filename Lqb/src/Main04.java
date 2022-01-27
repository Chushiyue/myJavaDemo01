import java.util.Scanner;
public class Main04
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		byte[] b = str.getBytes();
		int l = 0;
		int r = 0;
		for (int i = 0; i < b.length; i++)
		{
			if (b[i] == '(')
				l++;
			if (b[i] == ')')
				r++;
		}

		System.out.println("left = " + l + " right = " + r);

		int num = l - r;
		if (num == 0)
		{
			System.out.println(0);
		}
		if (num < 0)
		{
		}
	}
}