import java.awt.Frame;
import java.awt.Panel;
import java.awt.*;

public class ScrollPaneTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		// ����ScrollPane����
		ScrollPane sp = new ScrollPane(
			ScrollPane.SCROLLBARS_ALWAYS);
		// ��ScrollPane����������������
		sp.add(new TextField(20));
		sp.add(new Button("������"));
		// ��ScrollPane������ӵ�Frame������
		f.add(sp);
		// ���ô��ڵĴ�С��λ��
		f.setBounds(30, 30, 250, 120);
		// ��������ʾ������Frame����Ĭ��Ϊ����״̬��
		f.setVisible(true);
	}
}