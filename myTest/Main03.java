import java.util.*;
public class Main03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
			t = t + s.charAt(i);
		}
		System.out.println(t);
	}
}