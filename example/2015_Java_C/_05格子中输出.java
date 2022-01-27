/*
格子中输出

stringInGrid方法会在一个指定大小的格子中打印指定的字符串。
要求字符串在水平、垂直两个方向上都居中。
如果字符串太长，就截断。
如果不能恰好居中，可以稍稍偏左或者偏上一点。

下面的程序实现这个逻辑，请填写划线部分缺少的代码。

	public static void stringInGrid(int width, int height, String s)
	{
		if(s.length()>width-2) s = s.substring(0,width-2);
		System.out.print("+");
		for(int i=0;i<width-2;i++) System.out.print("-");
		System.out.println("+");

		for(int k=1; k<(height-1)/2;k++){
			System.out.print("|");
			for(int i=0;i<width-2;i++) System.out.print(" ");
			System.out.println("|");
		}

		System.out.print("|");

		String ff = _______________________________________________________;  //填空
		System.out.print(String.format(ff,"",s,""));

		System.out.println("|");

		for(int k=(height-1)/2+1; k<height-1; k++){
			System.out.print("|");
			for(int i=0;i<width-2;i++) System.out.print(" ");
			System.out.println("|");
		}

		System.out.print("+");
		for(int i=0;i<width-2;i++) System.out.print("-");
		System.out.println("+");
	}

对于题目中数据，应该输出：
+------------------+
|                  |
|     abcd1234     |
|                  |
|                  |
+------------------+

（如果出现对齐问题，参看【图1.jpg】）

*/
public class _05格子中输出 {
  public static void main(String[] args) {
    stringInGrid(20,6,"abcd1234");
  }
  public static void stringInGrid(int width, int height, String s)
  {
    if(s.length()>width-2) s = s.substring(0,width-2);
    System.out.print("+");
    for(int i=0;i<width-2;i++) System.out.print("-");
    System.out.println("+");

    for(int k=1; k<(height-1)/2;k++){
      System.out.print("|");
      for(int i=0;i<width-2;i++) System.out.print(" ");
      System.out.println("|");
    }

    System.out.print("|");

    // String ff = _______________________________________________________;  //填空
    String ff = "%" + (width - 2 - s.length()) / 2 + "s%s%" + (width - 2 - s.length() - (width - 2 - s.length()) / 2) + "s";  //填空
    System.out.print(String.format(ff,"",s,""));

    System.out.println("|");

    for(int k=(height-1)/2+1; k<height-1; k++){
      System.out.print("|");
      for(int i=0;i<width-2;i++) System.out.print(" ");
      System.out.println("|");
    }

    System.out.print("+");
    for(int i=0;i<width-2;i++) System.out.print("-");
    System.out.println("+");
  }
}
