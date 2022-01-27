class Apple
{
	private String color;
	private double weight;
	//提供有参数的构造器
	public Apple(String color, double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	//提供color、weight的setter和getter方法
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setWeight(double weight)
	{
		if (weight <= 0 || weight > 10)
		{
			System.out.println("没这样的苹果！！");
			return;
		}
		this.weight = weight;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public String toString()
	{
		return "一个苹果，颜色是" + color
				+ "，重量是：" + weight;
	}
}

public class ToStringTest
{
	public static void main(String[] args)
	{
		var a = new Apple("屎色绿", 5.89);
		System.out.println(a);
		var bbb = a.getColor();
		System.out.println(bbb);
	}
}