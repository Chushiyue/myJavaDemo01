import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class JdbcTest
{
	public static Connection getConn()
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("数据库驱动连接成功");
		}
		catch(Exception e) {
			System.out.println("数据库驱动连接失败");
		}
		try {
			conn = (Connection)DriverManager.
			getConnection("jdbc:mysql://localhost:3306/zn?useSSL=false&serverTimezone=UTC",
			"root", 
			"123456");
			System.out.println("数据库连接成功");
		}
		catch(SQLException se) {
			System.out.println("数据库连接失败");
		}
		return conn;
	}
	public static void main(String[] args) throws Exception
	{
		Connection conn = getConn();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM zn_table");
		GuiTest g = new GuiTest();
		g.win();
		while(rs.next()) {
			System.out.println(rs.getString("name") + "\t密码:\t" + rs.getString("passwd"));
		}
	}
}


class GuiTest
{
	private Frame f = new Frame("用户登录");
	private Button b1 = new Button("登录");
	private Button b2 = new Button("注册");
	private TextField t1 = new TextField(40);
	private TextField t2 = new TextField(40);
	private Dialog d = new Dialog(f, "提示", true);
	public void win()
	{
		f.addWindowListener(new WinListener());
		d.addWindowListener(new WinListener());
		// 布局管理器
		f.setLayout(new BorderLayout(5, 10));
		// 放于中间的文本框组件
		Panel p = new Panel();
		p.setLayout(new BorderLayout(5, 10));
		p.add(t1, BorderLayout.NORTH);
		p.add(t2, BorderLayout.SOUTH);
		t2.setEchoChar('*');
		// 加入f中
		f.add(p);
		// 放于下边的按钮
		Panel pa = new Panel();
		pa.setLayout(new BorderLayout(10, 10));
		// 注册键对话框
		d.setBounds(20, 30, 200, 300);
		d.add(new Label("是否注册账号？"));
		// 对话框两个按钮
		Button db1 = new Button("是");
		Button db2 = new Button("否");
		Panel db = new Panel();
		db.setLayout(new BorderLayout());
		db.add(db1, BorderLayout.WEST);
		db.add(db2, BorderLayout.EAST);
		d.add(db, BorderLayout.SOUTH);
		
		pa.add(b1, BorderLayout.WEST);
		pa.add(b2, BorderLayout.EAST);
		// 加入f中
		f.add(pa, BorderLayout.SOUTH);
		// 设置窗口大小为最佳
		f.pack();
		f.setVisible(true);
		// 为按钮创建监听
		b2.addActionListener(e ->d.setVisible(true));
		db1.addActionListener(new ButtonListenerB2());
		db2.addActionListener(e ->d.setVisible(false));
	}
	class WinListener implements WindowListener
	{
		public void windowActivated(WindowEvent e)
		{
		}
		public void windowClosed(WindowEvent e)
		{
		}
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
		public void windowDeactivated(WindowEvent e)
		{
		}
		public void windowDeiconified(WindowEvent e)
		{
		}
		public void windowIconified(WindowEvent e)
		{
		}
		public void windowOpened(WindowEvent e)
		{
		}
	}
	class ButtonListenerB2 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (t1.getText().length() != 0 && t2.getText().length() != 0)
			{
				Connection conn = JdbcTest.getConn();
				int i = 0;
				String sql = "INSERT INTO zn_table (name,passwd) VALUES(?,?)";
				PreparedStatement ptmt;
				try {
					ptmt = conn.prepareStatement(sql);
					ptmt.setString(1, t1.getText());
					ptmt.setString(2, t2.getText());
					i = ptmt.executeUpdate();
					ptmt.close();
					conn.close();
				}
				catch(SQLException se) {
					se.printStackTrace();
				}
				System.out.println(t1.getText() + "\t注册成功!!");
				t1.setText("");
				t2.setText("");
				d.setVisible(false);
				return;
			}
			if (t1.getText().length() != 0 && t2.getText().length() == 0)
			{
				t1.setText("");
				d.setVisible(false);
				return;
			}
			if (t1.getText().length() == 0 && t2.getText().length() != 0)
			{
				t2.setText("");
				d.setVisible(false);
				return;
			}
			if (t1.getText().length() == 0 && t2.getText().length() == 0)
			{
				d.setVisible(false);
				return;
			}
		}
	}
}