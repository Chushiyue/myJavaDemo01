package Main;

//import java.util.*;
public class Main06
{
	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i = 1; i < 2021; i++)
		{
			System.out.println("i = " + i);
			char[] year = (i +"").toCharArray();
			for(int j = 0; j < year.length; j++)
			{
				if(year[j] == '2')
				{
					count++;
					System.out.println("count:" + count);
					break;
				}
			}
		}
	}
}