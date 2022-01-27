import java.util.*;

// 超市类
public class SuperMarket
{
	// 超市的仓库
	private Repository repo;
	private List<ItemInfo> infoList
		= new ArrayList<>();
	// 将Scanner定义为成员变量，方便各方法复用
	Scanner sc = new Scanner(System.in);
	private void printInfoList()
	{
		// 还没有购买商品
		if (infoList.isEmpty())
		{
			// 提示
			System.out.println("还没有购买商品！！");
			return;
		}
		else
		{
			System.out.printf("%-4s\t%-6s\t%-6s\t%-4s\t%-4s\n", "序号", "商品", "价格", "数量", "小计");
			
			// 根据下标来遍历List集合
			for (int i = 0; i < infoList.size(); i++)
			{
				ItemInfo info = infoList.get(i);

				System.out.printf("%-4d\t%-8s\t%-8.2f\t%-4d\t%-8.2f\n", i + 1, 
					info.getItem().getName(), 
					info.getItem().getPrice(), 
					info.getN(), 
					info.getItem().getPrice() * (double)info.getN());
			}
		}
	}
	public static void main(String[] args)
	{
		// 创建超市
		SuperMarket market = new SuperMarket();
		// 为超市分配仓库
		market.repo = new Repository();
		market.repo.addItem(new Item("1",  "疯狂Java讲义",		109.9));
		market.repo.addItem(new Item("2",  "疯狂Python讲义",	99.6));
		market.repo.addItem(new Item("3",  "疯狂XML讲义",		119.3));
		market.repo.addItem(new Item("4",  "苍老师全集",		299.5));
		market.repo.addItem(new Item("5",  "兰石化建校史",		59.8));
		market.repo.addItem(new Item("6",  "唐诗300首",			69.9));
		market.repo.addItem(new Item("7",  "华硕天选2",			7999));
		market.repo.addItem(new Item("8",  "葵花宝典",			9.9));
		market.repo.addItem(new Item("9",  "屠龙刀",			1999));
		market.repo.addItem(new Item("10", "电动车",			1299.8));
		System.out.println("---------------欢迎来到赵宁开发的超市系统----------------");
		System.out.println("价格表：");
		System.out.println("1\t" + "疯狂Java讲义：\t\t" + 109.9);
		System.out.println("2\t" + "疯狂Python讲义：\t" + 99.6);
		System.out.println("3\t" + "疯狂XML讲义：\t\t" + 119.3);
		System.out.println("4\t" + "苍老师全集：\t\t" + 299.5);
		System.out.println("5\t" + "兰石化建校史：\t\t" + 59.8);
		System.out.println("6\t" + "唐诗300首：\t\t" + 69.9);
		System.out.println("7\t" + "华硕天选2：\t\t" + 7999);
		System.out.println("8\t" + "葵花宝典：\t\t" + 9.9);
		System.out.println("9\t" + "屠龙刀：\t\t" + 1999);
		System.out.println("10\t" + "电动车：\t\t" + 1299.8);
		market.showCommand();
		while (true)
		{
			System.out.println("购买清单：");
			market.printInfoList();
			market.showCommand();
		}
	}

	private void showCommand()
	{
		while (true)
		{
			System.out.println("请输入操作字母，进入对应的操作菜单");
			System.out.println("添加(a) 修改(e) 删除(d) 支付(p) 退出(q)");

			String st = sc.nextLine();

			// 判断用户输入的字符
			switch (st)
			{
				case "a":
					add();
					break;
				case "e":
					update();
					break;
				case "d":
					delete();
					break;
				case "p":
					pay();
					break;
				case "q":
					System.exit(0);
				default:
					System.out.println("输入指令有误，请重新输入：");
					showCommand();
			}
			break;
		}
		

	}
	
	// 添加商品
	public void add()
	{
		Item item = null;
		while (true)
		{
			System.out.println("请输入要购买的商品编号：");
			String code = sc.nextLine();
			// 根据code查找仓库中的商品
			item = repo.findItem(code);
			if (item == null)
			{
				System.out.println("编号不存在！请重新输入商品编号：");
				continue; // 继续循环，用户输入错误
			}
			break;
		}
		System.out.println("请输入要购买的商品的数量：");
		String n = sc.nextLine();
		int num = Integer.parseInt(n);
		while (num <= 0)
		{
			System.out.println("输入错误，重新输入：");
			n = sc.nextLine();
			num = Integer.parseInt(n);
		}
		// 添加一条商品清单
		infoList.add(new ItemInfo(item, num));
	}

	// 更新商品数量
	public void update()
	{
		System.out.println("请输入要修改的商品序号：");
		// 商品序号
		String index = sc.nextLine();
		// 根据输入序号得到购物记录
		ItemInfo info = infoList.get(Integer.parseInt(index) - 1);
		System.out.println("请输入要修改商品的数量：");
		// 商品序号
		String num = sc.nextLine();

		info.setN(Integer.parseInt(num));
	}

	// 删除商品
	public void delete()
	{
		System.out.println("请输入要删除的商品序号：");
		// 商品序号
		String index = sc.nextLine();
		// 从购物清单中删除该购物记录
		infoList.remove(Integer.parseInt(index) - 1);
	}

	// 支付商品
	public void pay()
	{
		double sum = 0;	// 记录汇总信息
		for (ItemInfo ii : infoList)
		{
			sum += ii.getItem().getPrice() * ii.getN();
		}
		System.out.printf("您购买了%d个商品，需要支付：%20.2f元。\n", infoList.size(), sum);
		System.exit(0);
	}
}