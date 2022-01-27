package Main;

import java.util.Scanner;

public class Main03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		char[] alp = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		String str = "";
		int a1 = a % 26;
		int a2 = a % (26 * 26) / 26;
		int a3 = a % (26 * 26 * 26) / 26;
		str = str + alp[a3 - 1] + alp[a2 - 1] + alp[a1 - 1];
		
        sc.close();
        
        System.out.println(str);
        System.out.println(26*26*26*26*26*26*26);
	}
}