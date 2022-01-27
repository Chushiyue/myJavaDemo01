public class Item
{
	// 封装所有field用private修饰
	private String code;
	private String name;
	private double price;

	// 无参构造器
	public Item()
	{
		this.code = "0";
		this.name = "空";
		this.price = 0;
	}
	// 初始化全部成员变量的构造器
	public Item(String code, String name, double price)
	{
		this.code = code;
		this.name = name;
		this.price = price;
	}

	// code的setter和getter方法
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getCode()
	{
		return this.code;
	}
	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	// price的setter和getter方法
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj != null && obj.getClass() == Item.class)
		{
			Item item = (Item)obj;
			// 只要两个Item的code相等，即可认为是相同的商品
			return this.code.equals(item.getCode());
		}
		return false;
	}

	public int HashCode()
	{
		return this.code.hashCode();
	}
}
