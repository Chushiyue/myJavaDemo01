public class LeetCode02
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
class Solution
{
    public int countCharacters(String[] words, String chars)
	{
		Map<Character, Integer> charsCnt = new Map<>();
		
		for (int i = 0; i < chars.length; i++)
		{
			charsCnt.put(chars.charAt[i], getOrDefault(chars.charAt[i], 0) + 1);
		}
		int ans = 0;
		for (String word : words)
		{
			Map<Character, Integer> wordCnt = new Map<>();
			for (int i = 0; i < word.length; i++)
			{
			}
		}
    }
}