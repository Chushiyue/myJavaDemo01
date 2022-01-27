import java.io.*;
class Iotest
{
public static void main(String args[])throws Exception
{
/*	//字符输出流类(OutputStreamWriter)的应用
  FileOutputStream fos=new FileOutputStream("b.text");
  OutputStreamWriter osw=new OutputStreamWriter(fos);
  osw.write("study");
  osw.flush();
  osw.close();
  //字符输入流类(InputStreamReader)的应用
  FileInputStream fis=new FileInputStream("b.text");
  InputStreamReader isr=new InputStreamReader(fis);
  System.out.println(isr.read());
  char[] ch=new char[10];  
  System.out.println(isr.read(ch,0,5));
  System.out.println(ch);
  System.out.println(new String(ch));
  isr.close();*/
 
 //利用上述知识点编写程序，要求将一个字符串写入一个文件，然后再传到另外一个文件中。
 
 	//标准输入（System.in）、输出(System.out);通过键盘读入单个字符，并显示  
  //	System.out.println(System.in.read());
 // 使用System.in.read()从键盘读入一个字符，存入一个文件中，并查看读入数据占几个字节。
  // FileOutputStream fos=new FileOutputStream("b.text");
  // fos.write(System.in.read());
    
   //字符输入流类(InputStreamReader)和字符缓冲输入流类(BufferedReader)的应用
   
  //通过键盘读入一行信息，同时将其存入某文件并显示
  	InputStreamReader isr1=new InputStreamReader(System.in);
  	BufferedReader br1=new BufferedReader(isr1);
  	
  	FileOutputStream fos1=new FileOutputStream("b.text");
  	OutputStreamWriter osw1=new OutputStreamWriter(fos1);
  	BufferedWriter bw1=new BufferedWriter(osw1);
  	
  	String rl;
  	rl=br1.readLine();  	
  	System.out.println(rl);
  	
  	bw1.write(rl);
  	bw1.close();
  	br1.close();
  
 }

}
