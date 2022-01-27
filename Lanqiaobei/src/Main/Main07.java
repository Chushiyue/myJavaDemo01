package Main;

public class Main07
{
	public static void main(String[] args)
	{
		int count = 0;
		for(int i = 3; i < 2021; i++)
		{
			System.out.println("i = " + i);
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count++;
					System.out.println("count:" + count);
					break;
				}
			}
		}
	}
}