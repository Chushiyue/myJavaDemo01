import java.util.*;
class Main01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String n = "";
		for(int i = 0; i < s.length(); i++)
		{
			char m = s.charAt(i);
			int mInt = (int)(m);
			if(mInt >= 65 && mInt <= 90)
			{
				mInt = mInt + 32;
				m = (char)(mInt);
			}
			else if(mInt >= 97 && mInt <= 122)
			{
				mInt = mInt - 32;
				m = (char)(mInt);
			}
			n = n + m;
		}
		System.out.println(n);
	}
}