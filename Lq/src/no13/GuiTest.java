package no13;

import java.io.FileWriter;
import java.io.IOException;

public class GuiTest
{

	public static void main(String[] args) throws IOException
	{
        FileWriter fw = new FileWriter("D:/poem.txt");
        fw.write("��ɪ - ������\r\n");
        fw.write("��ɪ�޶���ʮ�ң�һ��һ��˼���ꡣ\r\n");
        fw.write("ׯ�������Ժ��������۴����жž顣\r\n");
        fw.write("�׺����������ᣬ������ů�����̡�\r\n");
        fw.write("����ɴ���׷�䣬ֻ�ǵ�ʱ���Ȼ��\r\n");
        
        fw.close();
	}

}
