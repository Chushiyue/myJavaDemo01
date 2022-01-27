package 构造器重载;

public class Dog
{
	private String name;
	private String color;
	private int age;
	
	//下面两个就是构造器重载
	public Dog(String name, String color)
	{
		this.name = "fk:" + name;
		this.color = color;
	}
	
	public Dog(String name, String color, int age)
	{
//		this.name = "fk:" + name;
//		this.color = color;
		//调用重载的构造器,到底调哪个,取决于传入的参数
//		this(name, color);
//		this(name, 20);
//		this("fkjava");
		this("fkit", "黄色");
		this.age = age;
	}
	
	//name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	//color的setter和getter方法
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return this.color;
	}
	
	//age的setter和getter方法
		public void setAge(int age)
		{
			this.age = age;
		}
		public int getAge()
		{
			return this.age;
		}
}
