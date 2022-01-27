package 构造器重载;

public class DogTest
{
	public static void main(String[] args)
	{
		Dog d = new Dog("旺财", "灰色", 3);
		System.out.println(d.getName());
		System.out.println(d.getColor());
		System.out.println(d.getAge());
	}
}
