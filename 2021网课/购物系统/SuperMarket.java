import java.util.*;

// ������
public class SuperMarket
{
	// ���еĲֿ�
	private Repository repo;
	private List<ItemInfo> infoList
		= new ArrayList<>();
	// ��Scanner����Ϊ��Ա�������������������
	Scanner sc = new Scanner(System.in);
	private void printInfoList()
	{
		// ��û�й�����Ʒ
		if (infoList.isEmpty())
		{
			// ��ʾ
			System.out.println("��û�й�����Ʒ����");
			return;
		}
		else
		{
			System.out.printf("%-4s\t%-6s\t%-6s\t%-4s\t%-4s\n", "���", "��Ʒ", "�۸�", "����", "С��");
			
			// �����±�������List����
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
		// ��������
		SuperMarket market = new SuperMarket();
		// Ϊ���з���ֿ�
		market.repo = new Repository();
		market.repo.addItem(new Item("1",  "���Java����",		109.9));
		market.repo.addItem(new Item("2",  "���Python����",	99.6));
		market.repo.addItem(new Item("3",  "���XML����",		119.3));
		market.repo.addItem(new Item("4",  "����ʦȫ��",		299.5));
		market.repo.addItem(new Item("5",  "��ʯ����Уʷ",		59.8));
		market.repo.addItem(new Item("6",  "��ʫ300��",			69.9));
		market.repo.addItem(new Item("7",  "��˶��ѡ2",			7999));
		market.repo.addItem(new Item("8",  "��������",			9.9));
		market.repo.addItem(new Item("9",  "������",			1999));
		market.repo.addItem(new Item("10", "�綯��",			1299.8));
		System.out.println("---------------��ӭ�������������ĳ���ϵͳ----------------");
		System.out.println("�۸��");
		System.out.println("1\t" + "���Java���壺\t\t" + 109.9);
		System.out.println("2\t" + "���Python���壺\t" + 99.6);
		System.out.println("3\t" + "���XML���壺\t\t" + 119.3);
		System.out.println("4\t" + "����ʦȫ����\t\t" + 299.5);
		System.out.println("5\t" + "��ʯ����Уʷ��\t\t" + 59.8);
		System.out.println("6\t" + "��ʫ300�ף�\t\t" + 69.9);
		System.out.println("7\t" + "��˶��ѡ2��\t\t" + 7999);
		System.out.println("8\t" + "�������䣺\t\t" + 9.9);
		System.out.println("9\t" + "��������\t\t" + 1999);
		System.out.println("10\t" + "�綯����\t\t" + 1299.8);
		market.showCommand();
		while (true)
		{
			System.out.println("�����嵥��");
			market.printInfoList();
			market.showCommand();
		}
	}

	private void showCommand()
	{
		while (true)
		{
			System.out.println("�����������ĸ�������Ӧ�Ĳ����˵�");
			System.out.println("���(a) �޸�(e) ɾ��(d) ֧��(p) �˳�(q)");

			String st = sc.nextLine();

			// �ж��û�������ַ�
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
					System.out.println("����ָ���������������룺");
					showCommand();
			}
			break;
		}
		

	}
	
	// �����Ʒ
	public void add()
	{
		Item item = null;
		while (true)
		{
			System.out.println("������Ҫ�������Ʒ��ţ�");
			String code = sc.nextLine();
			// ����code���Ҳֿ��е���Ʒ
			item = repo.findItem(code);
			if (item == null)
			{
				System.out.println("��Ų����ڣ�������������Ʒ��ţ�");
				continue; // ����ѭ�����û��������
			}
			break;
		}
		System.out.println("������Ҫ�������Ʒ��������");
		String n = sc.nextLine();
		int num = Integer.parseInt(n);
		while (num <= 0)
		{
			System.out.println("��������������룺");
			n = sc.nextLine();
			num = Integer.parseInt(n);
		}
		// ���һ����Ʒ�嵥
		infoList.add(new ItemInfo(item, num));
	}

	// ������Ʒ����
	public void update()
	{
		System.out.println("������Ҫ�޸ĵ���Ʒ��ţ�");
		// ��Ʒ���
		String index = sc.nextLine();
		// ����������ŵõ������¼
		ItemInfo info = infoList.get(Integer.parseInt(index) - 1);
		System.out.println("������Ҫ�޸���Ʒ��������");
		// ��Ʒ���
		String num = sc.nextLine();

		info.setN(Integer.parseInt(num));
	}

	// ɾ����Ʒ
	public void delete()
	{
		System.out.println("������Ҫɾ������Ʒ��ţ�");
		// ��Ʒ���
		String index = sc.nextLine();
		// �ӹ����嵥��ɾ���ù����¼
		infoList.remove(Integer.parseInt(index) - 1);
	}

	// ֧����Ʒ
	public void pay()
	{
		double sum = 0;	// ��¼������Ϣ
		for (ItemInfo ii : infoList)
		{
			sum += ii.getItem().getPrice() * ii.getN();
		}
		System.out.printf("��������%d����Ʒ����Ҫ֧����%20.2fԪ��\n", infoList.size(), sum);
		System.exit(0);
	}
}