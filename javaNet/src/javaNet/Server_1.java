
import java.net.*;
import java.io.*;

public class Server_1
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket serverSocket = new ServerSocket(7777);
		System.out.println("waiting......");
		byte[] arr = new byte[1024];
		
		Socket socketServer = serverSocket.accept();
		InputStream inputStream = socketServer.getInputStream();
		int len = inputStream.read(arr);
		String message = new String(arr, 0, len);
		
		
		System.out.println("from client:\n" + message);
	}
}