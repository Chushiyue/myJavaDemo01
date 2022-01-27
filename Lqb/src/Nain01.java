import java.util.Scanner;
public class Nain01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		byte[] by = sc.next().getBytes();
		for (int i = 0; i < by.length; i++)
		{
			by[i] = (byte)(187 - by[i]);
		}
		for (int i = 0; i < by.length; i++)
		{
			System.out.print((char)by[i]);
		}
	}
}