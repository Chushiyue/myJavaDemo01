class Shape
{
    public void draw()
    {
        System.out.println("��ƽ���ϻ���ͼ��");
    }
}
class Circle extends Shape
{
    public void round()
    {
        System.out.println("����Բ����һȦ");
    }
}
class Rect extends Shape
{
    public void info()
    {
        System.out.println("����һ������");
    }
}

public class ǿ��ת��
{
    public static void main(String[] args)
    {
        Shape s1 = new Rect();
        Circle c = (Circle)s1;
        System.out.println(c);
    }
}