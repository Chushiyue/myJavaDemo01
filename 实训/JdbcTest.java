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
			System.out.println("���ݿ��������ӳɹ�");
		}
		catch(Exception e) {
			System.out.println("���ݿ���������ʧ��");
		}
		try {
			conn = (Connection)DriverManager.
			getConnection("jdbc:mysql://localhost:3306/zn?useSSL=false&serverTimezone=UTC",
			"root", 
			"123456");
			System.out.println("���ݿ����ӳɹ�");
		}
		catch(SQLException se) {
			System.out.println("���ݿ�����ʧ��");
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
			System.out.println(rs.getString("name") + "\t����:\t" + rs.getString("passwd"));
		}
	}
}


class GuiTest
{
	private Frame f = new Frame("�û���¼");
	private Button b1 = new Button("��¼");
	private Button b2 = new Button("ע��");
	private TextField t1 = new TextField(40);
	private TextField t2 = new TextField(40);
	private Dialog d = new Dialog(f, "��ʾ", true);
	public void win()
	{
		f.addWindowListener(new WinListener());
		d.addWindowListener(new WinListener());
		// ���ֹ�����
		f.setLayout(new BorderLayout(5, 10));
		// �����м���ı������
		Panel p = new Panel();
		p.setLayout(new BorderLayout(5, 10));
		p.add(t1, BorderLayout.NORTH);
		p.add(t2, BorderLayout.SOUTH);
		t2.setEchoChar('*');
		// ����f��
		f.add(p);
		// �����±ߵİ�ť
		Panel pa = new Panel();
		pa.setLayout(new BorderLayout(10, 10));
		// ע����Ի���
		d.setBounds(20, 30, 200, 300);
		d.add(new Label("�Ƿ�ע���˺ţ�"));
		// �Ի���������ť
		Button db1 = new Button("��");
		Button db2 = new Button("��");
		Panel db = new Panel();
		db.setLayout(new BorderLayout());
		db.add(db1, BorderLayout.WEST);
		db.add(db2, BorderLayout.EAST);
		d.add(db, BorderLayout.SOUTH);
		
		pa.add(b1, BorderLayout.WEST);
		pa.add(b2, BorderLayout.EAST);
		// ����f��
		f.add(pa, BorderLayout.SOUTH);
		// ���ô��ڴ�СΪ���
		f.pack();
		f.setVisible(true);
		// Ϊ��ť��������
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
				System.out.println(t1.getText() + "\tע��ɹ�!!");
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