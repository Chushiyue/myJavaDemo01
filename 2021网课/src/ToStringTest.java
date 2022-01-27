class Apple
{
	private String color;
	private double weight;
	//�ṩ�в����Ĺ�����
	public Apple(String color, double weight)
	{
		this.color = color;
		this.weight = weight;
	}
	//�ṩcolor��weight��setter��getter����
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
			System.out.println("û������ƻ������");
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
		return "һ��ƻ������ɫ��" + color
				+ "�������ǣ�" + weight;
	}
}

public class ToStringTest
{
	public static void main(String[] args)
	{
		var a = new Apple("ʺɫ��", 5.89);
		System.out.println(a);
		var bbb = a.getColor();
		System.out.println(bbb);
	}
}