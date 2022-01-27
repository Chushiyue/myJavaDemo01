import java.awt.*;
import java.awt.event.*;

public class NewTestV2
{
	private Frame f = new Frame("对话小程序");
	private Panel p = new Panel();
	private Button send = new Button("发送");
	private Button quit = new Button("退出");
	private TextField tf = new TextField(30);
	public void init()
	{
		// 注册事件监听器
		send.addActionListener(new sendListener());   // ①
		// 设置布局管理器
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
	// 定义事件监听器类
	class sendListener implements ActionListener   // ②
	{
		// 下面定义的方法就是事件处理器，用于响应特定的事件
		public void actionPerformed(ActionEvent e)      // ③
		{
			System.out.println("用户单击了send按钮");
			tf.setText("");
		}
	}
	public static void main(String[] args)
	{
		new NewTestV2().init();
	}
}