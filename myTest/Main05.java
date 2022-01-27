import java.util.Scanner;
public class Main05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		S s = sc.next()
		int m = (int)(s);
		if(m >= 65 && m <= 90)
		{
			m = m + 32;
			s = (char)(m);
		}
		else if(m >= 97 && m <= 122)
		{
			m = m - 32;
			s = (char)(m);
		}
		System.out.println(s);
	}
}