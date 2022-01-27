package Hello;
import java.net.*;
import java.io.*;

class Test00
{
	public static void main(String args[])
	{
		Socket sc;
		sc=null;
		byte[] arr=new byte[1024];
		String inputString=null;
		try
		{
		  InputStreamReader stdin=new InputStreamReader(System.in);
          BufferedReader bufin=new BufferedReader(stdin);
	       inputString=bufin.readLine();
	       
		   sc=new Socket("127.0.0.1",7777);
		   OutputStream os=sc.getOutputStream();
		   os.write(inputString.getBytes());
		    
		   InputStream is=sc.getInputStream();
		   int len=is.read(arr);
		   String message=new String(arr,0,len);
		   System.out.println("from server:"+message);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally{
			try{
				sc.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}