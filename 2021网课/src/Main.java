public class Main
{
	private String name;
	private int age;
	public void setName(String name)
	{
		if (name.length() > 10 || name.length() < 2)
		{
			System.out.println("�뱣֤�û�����2��10���ַ�֮�䣡��");
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
			System.out.println("�����÷��ϸ�ʽ�����䣡��");
			return;
		}
		this.age = age;
	}
	
	public Integer getAge()
	{
		return this.age;
	}
}