import java.util.Arrays;

public class Main08
{
	public static void main(String[] args)
	{
		var a = new int[] {3, 4, 5, 6};
		var a2 = new int[] {4, 5, 6, 7};
		System.out.println("a数组和a2数组是否相等："
				+ Arrays.equals(a, a2));
		var b = Arrays.copyOf(a, 6);
		System.out.println("a数组和a数组是否相等："
				+ Arrays.equals(a, a));
		String ss = "Hello, thank you, are you ok.";
		int[] s = new int[] {1, 3, 2, 9, 3, 4, 98, 324, 21};
		System.out.println("Wook");
	}
}