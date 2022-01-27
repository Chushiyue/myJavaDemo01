import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;

// import java.awt.Label;

public class MyClient
{
	private Frame f = new Frame("对话小程序");
	private Button send = new Button("发送");
	private Button quit = new Button("退出");
	private TextField tf = new TextField(40);
	private TextArea ta = new TextArea(10, 40);
	public void init()
	{
		// 为窗口添加窗口事件监听器
		f.addWindowListener(new MyListener());

		// 注册事件监听器
		quit.addActionListener(new QuitListener());
		send.addActionListener(new SendListener());
		tf.addActionListener(new SendListener());
		

		// 创建Panel容器
		Panel b = new Panel();
		Panel a = new Panel();
		f.setLayout(new BorderLayout(20, 5));
		b.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
		a.setLayout(new BorderLayout(20, 5));
		// 向Panel容器中添加组件
		f.add(new Label("你好，欢迎来到赵宁开发的聊天室!!"), BorderLayout.NORTH);
		a.add(ta, BorderLayout.NORTH);
		a.add(tf, BorderLayout.SOUTH);
		b.add(send);
		b.add(quit);
		f.add(a);
		// 将Panel容器添加到Frame窗口中
		f.add(b, BorderLayout.SOUTH);
		// 设置窗口的大小、位置
		f.pack();
		// 将窗口显示出来（Frame对象默认为隐藏状态）
		f.setVisible(true);
	}


	// 实现一个窗口监听器类
	class MyListener implements WindowListener
	{
		public void windowDeactivated(WindowEvent e)
		{
			System.out.print("窗口失去焦点！\n");
		}
		public void windowDeiconified(WindowEvent e)
		{
			System.out.print("窗口被恢复！\n");
		}
		public void windowIconified(WindowEvent e)
		{
			System.out.print("窗口被最小化！\n");
		}
		public void windowActivated(WindowEvent e)
		{
			System.out.print("窗口被激活！\n");
		}
		public void windowClosed(WindowEvent e)
		{
			System.out.print("窗口被成功关闭！\n");
		}
		public void windowClosing(WindowEvent e)
		{
			System.out.print("窗口被成功关闭！\n");
			System.exit(0);
		}
		public void windowOpened(WindowEvent e)
		{
			ta.append("小程序开始运行 (赵宁荣誉出品)！\n你是主机2\n");
		}
	}

	// 定义事件Quit监听器类
	class QuitListener implements ActionListener
	{
		// 下面定义的方法就是事件处理器，用于响应特定的事件
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("单击了\"退出\"按钮");
			System.exit(0);
		}
	}

	// 定义事件Send监听器类
	class SendListener implements ActionListener
	{
		// 下面定义的方法就是事件处理器，用于响应特定的事件
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("单击了\"发送\"按钮");
			ta.append("主机2:\t" + tf.getText() + '\n');

			// 通过局域网发消息
			try
			{
				ServerSocket serverSocket = new ServerSocket(7777);
				byte[] arr = new byte[1024];
				Socket socket = serverSocket.accept();
				InputStream inputStream = socket.getInputStream();
				String message = new Scanner(inputStream).next();
				ta.append("主机1:\t" + message + '\n');
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