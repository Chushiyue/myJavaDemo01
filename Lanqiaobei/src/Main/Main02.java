package Main;

import java.util.Scanner;

public class Main02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a + b + c;
        
        System.out.println(d);
        sc.close();
	}
}