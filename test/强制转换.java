class Shape
{
    public void draw()
    {
        System.out.println("在平面上绘制图形");
    }
}
class Circle extends Shape
{
    public void round()
    {
        System.out.println("绕着圆形走一圈");
    }
}
class Rect extends Shape
{
    public void info()
    {
        System.out.println("我是一个矩形");
    }
}

public class 强制转换
{
    public static void main(String[] args)
    {
        Shape s1 = new Rect();
        Circle c = (Circle)s1;
        System.out.println(c);
    }
}