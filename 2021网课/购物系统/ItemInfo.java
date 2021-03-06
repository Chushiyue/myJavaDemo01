public class ItemInfo
{
	// 购买的商品
	private Item item;
	// 购买商品的数量
	private int n;

	// 无参数的构造器
	public ItemInfo()
	{
	}
	// 初始化所有成员变量的构造器
	public ItemInfo(Item item, int n)
	{
		this.item = item;
		this.n = n;
	}
	// item的setter和getter方法
	public void setItem(Item item)
	{
		this.item = item;
	}
	public Item getItem()
	{
		return this.item;
	}
	// int的setter和getter方法
	public void setN(int n)
	{
		this.n = n;
	}
	public int getN()
	{
		return this.n;
	}
}
