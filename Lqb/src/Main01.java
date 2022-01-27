import java.util.Scanner;

public class Main01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		byte[] b = str.getBytes();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		for (int i = 0; i < b.length; i++)
		{
			if (b[i] == 42)
			{
				sb.deleteCharAt(0);
			}
			else
				break;
		}
		System.out.println(sb);
	}
}