import java.io.File;
public class CreateFile
{
	public static void main(String[] args)throws Exception
	{
		File f = new File("b.doc");
		f.createNewFile();
	}
}
