package Hello;

public class Test
{

	public int search(int[] nums, int target)
    {
		int bot = 0;
		int top = nums.length - 1;
		int mid = bot + ((top - bot) >> 1);
		while (bot < top)
		{
			mid = bot + ((top - bot) >> 1);
			int guess = nums[mid];
			if (guess == target)
				return mid;
			else if(guess > target)
				top = mid - 1;
			else
				bot = mid + 1;
		}
		return bot;
    }
	public static void main(String[] args)
	{
		Test t = new Test();
		int[] arr = new int[]{1, 5, 6, 9, 23, 89, 112, 234, 321, 334, 657, 888};
		int h = t.search(arr, 322);
		System.out.println(h);
	}
}
