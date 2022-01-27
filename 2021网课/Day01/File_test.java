import java.io.*;
 class File_test{   
    public static void main(String args[])throws Exception
    {//相对路径下
   // File f=new File("a.text");
   //创建文件
  //  f.createNewFile();
  //创建目录
  //    f.mkdir();
  //绝对路径下
   //   File f=new File("F:\\田java API资料\\基本输入输出（IO）\\iotest\\1\\1.text");
    //   f.createNewFile();
    //不依赖于平台的分隔符：File.separator
    //表示当前目录的根目录：
   // File fdir=new File(File.separator);
    //使用不依赖于平台的分隔符创建文件
   // String strdir="田java API资料"+File.separator+"基本输入输出（IO）"+File.separator+"iotest"+File.separator+"1"+File.separator+"1.text";
  //  File f=new File(fdir,strdir);
    //f.createNewFile();
    //删除文件
    // f.delete();
    /*列举某个目录下的所有文件及子目录list()
     File fdir=new File(File.separator);
     String strdir="田java API资料"+File.separator+"基本输入输出（IO）"+File.separator+"iotest";
     File f=new File(fdir,strdir);     
     String[] names=f.list();
     for(int i=0;i<names.length;i++)
      System.out.println(names[i]);*/
   /*   //文件过滤器String[] list(FilenameFilter filter)  FilenameFilter是一个接口  
     File fdir=new File(File.separator);
     String strdir="田java API资料"+File.separator+"基本输入输出（IO）"+File.separator+"iotest";
     File f=new File(fdir,strdir); 
     //String[] list(FilenameFilter filter)会针对目录中的每一个文件，调用accept(File dir,String name)判断该文件是否应该包含在文件列表当中,为真则包含进来，否则不列举
     //接口的方法使用内部类来实现    
     String[] names=f.list(new FilenameFilter()
      {
        public boolean accept(File dir,String name)//list()调用accept()时会将文件名传递给name
        {
         return name.indexOf(".java")!=-1; //indexOf(String s)查找串中是否存在给定的子串，若存在则返回序号，否则返回-1
        }
      });
     for(int i=0;i<names.length;i++)
      System.out.println(names[i]);*/
      
   /*    File fdir=new File(File.separator);
     String strdir="田java API资料"+File.separator+"基本输入输出（IO）"+File.separator+"iotest";
     File f=new File(fdir,strdir); 
      ImpFf imf=new ImpFf();
      String[] names=f.list(imf);
      for(int i=0;i<names.length;i++)
      System.out.println(names[i]);*/
     }
  
}

/*class ImpFf implements FilenameFilter
{
   public boolean accept(File dir,String name)//list()调用accept()时会将文件名传递给name
        {
         return name.indexOf(".java")!=-1; //indexOf(String s)查找串中是否存在给定的子串，若存在则返回序号，否则返回-1
        }
     
}*/