package Hello;

public class Test1
{
	public void rotate(int[] nums, int k)
	{
		int[] arr = new int[nums.length];
		for (int i = 0; i < k; i++)
			arr[(i + k) % nums.length] = nums[i];
		nums = arr.clone();
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}
	public static void main(String[] args)
	{
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		Test1 t = new Test1();
		t.rotate(arr, 3);
		
	}

}
