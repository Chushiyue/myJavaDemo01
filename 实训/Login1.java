import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Login1{
  JFrame frame=new JFrame("��¼");
  JLabel labPwd=new JLabel(" ��  ��");
  JPasswordField  txtPwd=new JPasswordField(14); 
  JButton btnLogin=new JButton(" ��   ¼ ");
  JButton btnCancel=new JButton(" ȡ  �� ");	
  JPanel p=new JPanel();
  JFrame frame1=new JFrame("չʾ����");
  JLabel labUser1=new JLabel(" �����˵ڶ�������");
   JButton btnCancel1=new JButton(" �Ķ���");
  JPanel p1=new JPanel();
  int i=3;	
  Login1()
  {
       p1.add(labUser1);     
       p1.add(btnCancel1);    
       frame1.getContentPane().add(p1);    
       labPwd.setIcon(new ImageIcon("G:/aa.gif"));
       btnLogin.setIcon(new ImageIcon("G:/aa.gif"));	
       btnCancel.setIcon(new ImageIcon("G:/aa.gif"));   
       txtPwd.setBorder(BorderFactory.createEtchedBorder());
 	   p.setBorder(BorderFactory.createTitledBorder("�û���¼����"));  
	   txtPwd.setToolTipText("�������¼����");   
       p.add(labPwd);
       p.add(txtPwd);
       p.add(btnLogin);
       p.add(btnCancel);    
       frame.getContentPane().add(p);     
       frame.setSize(250,160);
       frame.setVisible(true);
       frame.setResizable(false);  
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Dimension  d = Toolkit.getDefaultToolkit().getScreenSize();
       frame.setLocation((d.width-200)/2,(d.height-120)/2);
       frame1.setSize(250,160);   
       frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 }  
  class Bb implements ActionListener
  {
  	public void actionPerformed(ActionEvent e)
  	{ 
  	  String name=((JButton)e.getSource()).getText();
	  if(name.equals(" ��   ¼ "))
	     {	      
	     if(txtPwd.getText().equals("12345"))
	       {
	       	 frame.setVisible(false);
	       	 frame1.setVisible(true);	       	
	        } 	 
	      else    
	        {
	         i=i-1;
	         if(i>0)	        
	             {	             
	             txtPwd.setText("");	   
	             txtPwd.requestFocusInWindow();
	             }
	         else
	           System.exit(0);   
	         }
	      }
	  else
	    	 System.exit(0);
	   	
  	}
  }
  void init()
  {
  	Bb test=new Bb();
  	btnLogin.addActionListener(test);  	
  	btnCancel.addActionListener(test);
  }
  public static void main(String[] args){
 	Login1 l=new Login1();
 	l.init();
  }
 }