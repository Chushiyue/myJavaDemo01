package no13;

public class SelectSort
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] brr = new int[] { 1, 5, 3, 0, 23, 54, 32, 21, 33, 4 };
		SelectSort s = new SelectSort();
		int[] crr = s.mySort(brr);
		for (int i = 0; i < crr.length; i++)
		{
			System.out.println(crr[i]);
		}
	}

	private int[] mySort(int[] arr)
	{

		for (int j = 0; j < arr.length - 1; j++)
		{
			int flag = j;
			for (int i = j; i < arr.length - 1; i++)
			{
				if (arr[flag] > arr[i + 1])
				{
//					arr[i - 1] = arr[i - 1] ^ arr[i];
//					arr[i] = arr[i - 1] ^ arr[i];
//					arr[i - 1] = arr[i - 1] ^ arr[i];
					flag = i + 1;
					System.out.println("min = " + arr[flag] + "\nindex = " + (i));
				}
			}
			if (j != flag)
			{

				arr[j] = arr[j] ^ arr[flag];
				arr[flag] = arr[j] ^ arr[flag];
				arr[j] = arr[j] ^ arr[flag];

			}
			System.out.println();
		}
		return arr;
	}

}
