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
        //���û��super���ã�Ĭ�ϵ��ø����޲����Ĺ�����
        super(0.0);
    }
}