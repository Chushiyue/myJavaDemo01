package Hello;
import java.util.Scanner;

public class Main01
{
	public static void main(String[] args)
	{
	//	System.out.println("浣犺杈撳叆鍑犱釜鏁存暟杩涜鎺掑簭锛�");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++)
		{
	//		System.out.println("璇疯緭鍏ョ" + (i + 1) + "涓暣鏁帮細");
			arr[i] = sc.nextInt();
		}
		for (int i = arr.length - 1; i > 1; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					arr[j] = arr[j] ^ arr[j + 1];
					arr[j + 1] = arr[j] ^ arr[j + 1];
					arr[j] = arr[j] ^ arr[j + 1];
					a = a >> 3;
				}
			}
		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		sc.close();
		float f = 0.1f + 0.2f;
		System.out.println(f);
	}

}