
import java.net.*;
import java.io.*;

public class Client_1
{

	public static void main(String[] args) throws Exception
	{
		// ��������ȡ��������
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		String inputString = bufin.readLine();

		Socket socketClient = new Socket(InetAddress.getLocalHost().getHostAddress(), 7777);
		OutputStream outputStream = socketClient.getOutputStream();
		outputStream.write(inputString.getBytes());
		
		
	}

}
