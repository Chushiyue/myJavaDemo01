package Main;

import java.util.*;
public class Main01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("��Ҫ������ٸ������бȽϣ�");
		int N = sc.nextInt();
		int[] arr = new int[N];
		System.out.println("����������Щ���֣�");
		for(int i = 0; i < N; i++)
			arr[i] =sc.nextInt();
		System.out.println("��С��������Ϊ��");
		for(int i = 0; i < arr.length - 1; i++)
		{
			int minPos = i;
			
			for(int j = i + 1; j < arr.length; j++)
				minPos = arr[j] < arr[minPos] ? j : minPos;
			Main01.swap(arr, i, minPos);
		}
		Main01.printArr(arr);
		sc.close();
	}
	
	static void printArr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}