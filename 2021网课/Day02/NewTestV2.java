import java.awt.*;
import java.awt.event.*;

public class NewTestV2
{
	private Frame f = new Frame("�Ի�С����");
	private Panel p = new Panel();
	private Button send = new Button("����");
	private Button quit = new Button("�˳�");
	private TextField tf = new TextField(30);
	public void init()
	{
		// ע���¼�������
		send.addActionListener(new sendListener());   // ��
		// ���ò��ֹ�����
		Panel pn = new Panel();
		pn.setLayout(null);
		send.setBounds(20, 30, 90, 30);
		pn.add(send);
		quit.setBounds(130, 30, 90, 30);
		pn.add(quit);
		pn.add(tf);
		p.add(pn, BorderLayout.NORTH);
		f.add(p);
		f.setBounds(400, 400, 240, 60);
		f.setVisible(true);
	}
	// �����¼���������
	class sendListener implements ActionListener   // ��
	{
		// ���涨��ķ��������¼���������������Ӧ�ض����¼�
		public void actionPerformed(ActionEvent e)      // ��
		{
			System.out.println("�û�������send��ť");
			tf.setText("");
		}
	}
	public static void main(String[] args)
	{
		new NewTestV2().init();
	}
}