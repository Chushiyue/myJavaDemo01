import java.io.FileOutputStream;

public class FileOutputStreamTest01
{
	public static void main(String[] args)throws Exception
	{
		FileOutputStream f = new FileOutputStream("zn.txt");
		f.write("赵宁".getBytes());
		f.write(37);
		f.close();
	}
}
