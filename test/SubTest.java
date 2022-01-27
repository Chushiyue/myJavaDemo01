class Base
{
    int age = 123;
    public void foo(String name)
    {
        System.out.println("执行foo方法，传入的参数为：" + name);

    }
}
class Sub extends Base
{
    public void foo(String name)
    {
        System.out.println("执行重写foo方法，传入的参数为：" + name);
        
    }
    int age = 300;
    public void test()
    {
        int age = 2;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
        super.foo("zhaoning is a handsome boy!!!");
        foo("zhaoning is a handsome boy!!!");
    }
}

public class SubTest
{
    public static void main(String[] args)
    {
        Sub s = new Sub();
        s.test();
    }
}
