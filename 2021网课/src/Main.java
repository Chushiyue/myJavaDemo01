public class Main
{
	private String name;
	private int age;
	public void setName(String name)
	{
		if (name.length() > 10 || name.length() < 2)
		{
			System.out.println("请保证用户名在2到10个字符之间！！");
			return;
		}
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setAge(Integer age)
	{
		if (age < 0 || age > 120)
		{
			System.out.println("请设置符合格式的年龄！！");
			return;
		}
		this.age = age;
	}
	
	public Integer getAge()
	{
		return this.age;
	}
}