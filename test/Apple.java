class Fruit
{
    double weight;
    public Fruit(double weight)
    {
        this.weight = weight;
    }
}
public class Apple extends Fruit
{
    public Apple()
    {
        //如果没有super调用，默认调用父类无参数的构造器
        super(0.0);
    }
}