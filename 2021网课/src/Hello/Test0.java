package Hello;

import java.util.Arrays;

public class Test0
{
	public int[] sortedSquares(int[] nums)
	{
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			arr[i] = nums[i] * nums[i];
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args)
	{
		Test0 t = new Test0();
		int[] nums = new int[] {-4,-1,0,3,10};
		int[] arr = t.sortedSquares(nums);
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
	}
}
