package Main;
public class Main04
{
	public static void main(String[] args)
	{
		int s = 2019;
		int ww = 0;
		for(int a = 1;; a++)
		{
			String c = (a * s) + "";
			char[] ch = c.toCharArray();
			for(char x : ch)
			{
				if((int)(x) % 2 == 0)
				{
					ww = 0;
					break;
				}
				else
					ww++;
			}
			if(ww == ch.length)
			{
				for(int i = 0; i < ch.length; i++)
					System.out.print(ch[i]);
				break;
			}
		}
	}
}

// �����ҵ���С������ XX ͬʱ���㣺
// XX��2019����������
// XX��ÿһλ���ֶ���������
// PASS