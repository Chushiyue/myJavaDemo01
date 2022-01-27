import java.io.*;
import java.net.*;

public class Server
{
	public static void main(String args[])
	{
		ServerSocket ss;
		ss = null;
		byte[] arr = new byte[1024];
		String inputString = null;
		try {
			ss=new ServerSocket(7777);
			System.out.println("waiting......");
			
			Socket s1 = ss.accept();
			System.out.println("connect success");
		    InputStream is = s1.getInputStream();
		    int len = is.read(arr);
		    String message = new String(arr, 0, len);
		    System.out.println("from client:" + message);
		    
		    InputStreamReader stdin = new InputStreamReader(System.in);
		    BufferedReader bufin = new BufferedReader(stdin);
		    inputString = bufin.readLine();
		    OutputStream os = s1.getOutputStream();
		    os.write("hello".getBytes());
		    os.write(inputString.getBytes());
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
		finally {
			try {
				ss.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
