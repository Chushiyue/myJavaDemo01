import java.io.File;

public class CreateDir
{
	public static void main(String[] args)throws Exception
	{
		File f = new File("D:\\Hello\\Hello\\Hello");
		f.mkdirs();
		f = new File("D:\\Hello\\Hello\\Hello\\Hello.txt");
		f.createNewFile();
	}
}
