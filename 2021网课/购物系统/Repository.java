import java.util.*;

public class Repository
{
	// LinkedHashSet不允许元素重复
	private Set<Item> items 
		= new LinkedHashSet<>();

	// 为仓库添加商品
	public void addItem(Item item)
	{
		items.add(item);
	}

	// 根据商品的code来查找商品
	public Item findItem(String code)
	{
		for (Item item : items)
		{
			// 该商品的code与被查找的code相等，说明找到
			if (item.getCode().equals(code))
			{
				return item;
			}
		}
		return null;
	}


}
