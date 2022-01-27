package no13;
public class Main5
{
	public static void main(String[] args)
	{
		int c = 0b01100010_00100001_01000100_01000101;
		System.out.println(Integer.toBinaryString(m(c)));
	}
	private static int m(int i)
	{		 
		// 0b10100010_00100001_01000100_01000101
		// 0b10010001_00010010_10001000_10001010
		int c = 0b10101010_10101010_10101010_10101010;
		int d = 0b01010101_01010101_01010101_01010101;
		     // 0b10100010_00100001_01000100_01000101
		
		int cc = (c & i) >>> 1;
		int dd = (d & i) << 1;
		int ans = cc ^ dd;
		return ans;
	}
}