import java.util.*;

public class LeetCode01
{
	public static void main(String[] args)
	{
		int[] nums = {3, 2, 2, 3};
		System.out.println(new Solution().removeElement(nums, 3));
	}
}
class Solution
{
    public int removeElement(int[] nums, int val)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		int a = 0;
        for (int i = 0; i < nums.length; i++)
        {
			if (nums[i] != val)
			{
				a++;
				arr.add(nums[i]);
			}
        }
		for (int i : arr)
		{
			System.out.println(i);
		}
		return a;
    }
}