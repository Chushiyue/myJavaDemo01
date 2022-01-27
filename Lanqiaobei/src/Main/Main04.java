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

// 请你找到最小的整数 XX 同时满足：
// XX是2019的整倍数；
// XX的每一位数字都是奇数。
// PASS