import java.util.Scanner;
public class Main06
{
	static final double PI = Math.PI;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.printf("%.7f", PI * r * r);
	}
}