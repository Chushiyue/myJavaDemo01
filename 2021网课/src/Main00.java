import java.util.Scanner;
public class Main00
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		int i = 0;
		boolean flag = true;
		while (i < arr.length - 1 && flag)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (j == arr.length - 1)
				{
					flag = false;
					break;
				}
				if (arr[i] == arr[j])
					break;
//				else if (i == arr.length-1 && j == arr.length)
//					System.out.print(arr[j]);
				else
					continue;
			}
			i++;
		}
		System.out.println(arr[i - 1]);
		sc.close();
	}

}
