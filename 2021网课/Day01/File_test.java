import java.io.*;
 class File_test{   
    public static void main(String args[])throws Exception
    {//���·����
   // File f=new File("a.text");
   //�����ļ�
  //  f.createNewFile();
  //����Ŀ¼
  //    f.mkdir();
  //����·����
   //   File f=new File("F:\\��java API����\\�������������IO��\\iotest\\1\\1.text");
    //   f.createNewFile();
    //��������ƽ̨�ķָ�����File.separator
    //��ʾ��ǰĿ¼�ĸ�Ŀ¼��
   // File fdir=new File(File.separator);
    //ʹ�ò�������ƽ̨�ķָ��������ļ�
   // String strdir="��java API����"+File.separator+"�������������IO��"+File.separator+"iotest"+File.separator+"1"+File.separator+"1.text";
  //  File f=new File(fdir,strdir);
    //f.createNewFile();
    //ɾ���ļ�
    // f.delete();
    /*�о�ĳ��Ŀ¼�µ������ļ�����Ŀ¼list()
     File fdir=new File(File.separator);
     String strdir="��java API����"+File.separator+"�������������IO��"+File.separator+"iotest";
     File f=new File(fdir,strdir);     
     String[] names=f.list();
     for(int i=0;i<names.length;i++)
      System.out.println(names[i]);*/
   /*   //�ļ�������String[] list(FilenameFilter filter)  FilenameFilter��һ���ӿ�  
     File fdir=new File(File.separator);
     String strdir="��java API����"+File.separator+"�������������IO��"+File.separator+"iotest";
     File f=new File(fdir,strdir); 
     //String[] list(FilenameFilter filter)�����Ŀ¼�е�ÿһ���ļ�������accept(File dir,String name)�жϸ��ļ��Ƿ�Ӧ�ð������ļ��б���,Ϊ������������������о�
     //�ӿڵķ���ʹ���ڲ�����ʵ��    
     String[] names=f.list(new FilenameFilter()
      {
        public boolean accept(File dir,String name)//list()����accept()ʱ�Ὣ�ļ������ݸ�name
        {
         return name.indexOf(".java")!=-1; //indexOf(String s)���Ҵ����Ƿ���ڸ������Ӵ����������򷵻���ţ����򷵻�-1
        }
      });
     for(int i=0;i<names.length;i++)
      System.out.println(names[i]);*/
      
   /*    File fdir=new File(File.separator);
     String strdir="��java API����"+File.separator+"�������������IO��"+File.separator+"iotest";
     File f=new File(fdir,strdir); 
      ImpFf imf=new ImpFf();
      String[] names=f.list(imf);
      for(int i=0;i<names.length;i++)
      System.out.println(names[i]);*/
     }
  
}

/*class ImpFf implements FilenameFilter
{
   public boolean accept(File dir,String name)//list()����accept()ʱ�Ὣ�ļ������ݸ�name
        {
         return name.indexOf(".java")!=-1; //indexOf(String s)���Ҵ����Ƿ���ڸ������Ӵ����������򷵻���ţ����򷵻�-1
        }
     
}*/