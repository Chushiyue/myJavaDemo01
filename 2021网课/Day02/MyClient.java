import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

// import java.awt.Label;

public class MyClient
{
	private Frame f = new Frame("�Ի�С����");
	private Button send = new Button("����");
	private Button quit = new Button("�˳�");
	private TextField tf = new TextField(40);
	private TextArea ta = new TextArea(10, 40);
	public void init()
	{
		// Ϊ������Ӵ����¼�������
		f.addWindowListener(new MyListener());

		// ע���¼�������
		quit.addActionListener(new QuitListener());
		send.addActionListener(new SendListener());
		tf.addActionListener(new SendListener());
		

		// ����Panel����
		Panel b = new Panel();
		Panel a = new Panel();
		f.setLayout(new BorderLayout(20, 5));
		b.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
		a.setLayout(new BorderLayout(20, 5));
		// ��Panel������������
		f.add(new Label("��ã���ӭ��������������������!!"), BorderLayout.NORTH);
		a.add(ta, BorderLayout.NORTH);
		a.add(tf, BorderLayout.SOUTH);
		b.add(send);
		b.add(quit);
		f.add(a);
		// ��Panel������ӵ�Frame������
		f.add(b, BorderLayout.SOUTH);
		// ���ô��ڵĴ�С��λ��
		f.pack();
		// ��������ʾ������Frame����Ĭ��Ϊ����״̬��
		f.setVisible(true);
	}


	// ʵ��һ�����ڼ�������
	class MyListener implements WindowListener
	{
		public void windowDeactivated(WindowEvent e)
		{
			System.out.print("����ʧȥ���㣡\n");
		}
		public void windowDeiconified(WindowEvent e)
		{
			System.out.print("���ڱ��ָ���\n");
		}
		public void windowIconified(WindowEvent e)
		{
			System.out.print("���ڱ���С����\n");
		}
		public void windowActivated(WindowEvent e)
		{
			System.out.print("���ڱ����\n");
		}
		public void windowClosed(WindowEvent e)
		{
			System.out.print("���ڱ��ɹ��رգ�\n");
		}
		public void windowClosing(WindowEvent e)
		{
			System.out.print("���ڱ��ɹ��رգ�\n");
			System.exit(0);
		}
		public void windowOpened(WindowEvent e)
		{
			ta.append("С����ʼ���� (����������Ʒ)��\n��������2\n");
		}
	}

	// �����¼�Quit��������
	class QuitListener implements ActionListener
	{
		// ���涨��ķ��������¼���������������Ӧ�ض����¼�
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("������\"�˳�\"��ť");
			System.exit(0);
		}
	}

	// �����¼�Send��������
	class SendListener implements ActionListener
	{
		// ���涨��ķ��������¼���������������Ӧ�ض����¼�
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("������\"����\"��ť");
			ta.append("����2:\t" + tf.getText() + '\n');

			// ͨ������������Ϣ
			try
			{
				ServerSocket serverSocket = new ServerSocket(7777);
				byte[] arr = new byte[1024];
				Socket socket = serverSocket.accept();
				InputStream inputStream = socket.getInputStream();
				String message = new Scanner(inputStream).next();
				ta.append("����1:\t" + message + '\n');
			}
			catch (Exception ea)
			{
				ea.printStackTrace();
			}
			
			tf.setText("");
		}
	}

	public static void main(String[] args)
	{
		new MyClient().init();
	}
}