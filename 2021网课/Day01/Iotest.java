import java.io.*;
class Iotest
{
public static void main(String args[])throws Exception
{
/*	//�ַ��������(OutputStreamWriter)��Ӧ��
  FileOutputStream fos=new FileOutputStream("b.text");
  OutputStreamWriter osw=new OutputStreamWriter(fos);
  osw.write("study");
  osw.flush();
  osw.close();
  //�ַ���������(InputStreamReader)��Ӧ��
  FileInputStream fis=new FileInputStream("b.text");
  InputStreamReader isr=new InputStreamReader(fis);
  System.out.println(isr.read());
  char[] ch=new char[10];  
  System.out.println(isr.read(ch,0,5));
  System.out.println(ch);
  System.out.println(new String(ch));
  isr.close();*/
 
 //��������֪ʶ���д����Ҫ��һ���ַ���д��һ���ļ���Ȼ���ٴ�������һ���ļ��С�
 
 	//��׼���루System.in�������(System.out);ͨ�����̶��뵥���ַ�������ʾ  
  //	System.out.println(System.in.read());
 // ʹ��System.in.read()�Ӽ��̶���һ���ַ�������һ���ļ��У����鿴��������ռ�����ֽڡ�
  // FileOutputStream fos=new FileOutputStream("b.text");
  // fos.write(System.in.read());
    
   //�ַ���������(InputStreamReader)���ַ�������������(BufferedReader)��Ӧ��
   
  //ͨ�����̶���һ����Ϣ��ͬʱ�������ĳ�ļ�����ʾ
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
