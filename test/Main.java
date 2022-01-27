import jdk.tools.jlink.resources.plugins;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
// import java.util.*;
// class Main
// {
// 	public static void main(String[] args)
// 	{
//         Scanner scan = new Scanner(System.in);
//         int a1 = scan.nextInt();
//         int a2 = scan.nextInt();
//         String mark = scan.next();
//         int b1 = scan.nextInt();
//         int b2 = scan.nextInt();
//         String plus = "+";
//         String x = "*";
//         String jian = "-";
//         String chu = "/";
//         if(mark.equals(plus))
//         {
//             int shibu = a1 + b1;
//             int xubu = a2 + b2;
//             if(xubu > 0)
//             {
//                 System.out.println(shibu + "+" + xubu + "i");
//             }
//             if(xubu == 0)
//             {
//                 System.out.println(shibu);
//             }
//             if(xubu < 0)
//             {
//                 System.out.println(shibu + "" + xubu + "i");
//             }
//         }
//         if(mark.equals(x))
//         {
//             int shibu = (a1 * b1) + (-1 * a2 * b2);
//             int xubu = (a1 * b2) + (a2 * b1);
//             if(xubu > 0)
//             {
//                 System.out.println(shibu + "+" + xubu + "i");
//             }
//             if(xubu == 0)
//             {
//                 System.out.println(shibu);
//             }
//             if(xubu < 0)
//             {
//                 System.out.println(shibu + "" + xubu + "i");
//             }
//         }
//         if(mark.equals(jian))
//         {
//             int shibu = a1 - b1;
//             int xubu = a2 - b2;
//             if(xubu > 0)
//             {
//                 System.out.println(shibu + "+" + xubu + "i");
//             }
//             if(xubu == 0)
//             {
//                 System.out.println(shibu);
//             }
//             if(xubu < 0)
//             {
//                 System.out.println(shibu + "" + xubu + "i");
//             }
//         }
//         if(mark.equals(chu))
//         {
//             if(b1 == 0 && b2 == 0)
//             {
//                 System.out.println("error");
//             }
//             else if(b1 == 0)
//             {
//                 int shibu = a2 / b2;
//                 int xubu = -(a1 / b2);
//                 if(xubu > 0)
//                 {
//                     System.out.println(shibu + "+" + xubu + "i");
//                 }
//                 if(xubu == 0)
//                 {
//                     System.out.println(shibu);
//                 }
//                 if(xubu < 0)
//                 {
//                     System.out.println(shibu + "" + xubu + "i");
//                 }
//             }
//             else
//             {
//                 int fenmu = b1 * b1 + b2 * b2;
//                 int fenzishi = (a1 * b1) + (a2 * b2);
//                 int fenzixu = -(a1 * b2) + (a2 * b1);
//                 double shibu = fenzishi * 1.0 / fenmu;
//                 double xubu = fenzixu * 1.0 / fenmu;
//                 if(xubu > 0)
//                 {
//                     System.out.println(shibu + "+" + xubu + "i");
//                 }
//                 if(xubu == 0)
//                 {
//                     System.out.println(shibu);
//                 }
//                 if(xubu < 0)
//                 {
//                     System.out.println(shibu + "" + xubu + "i");
//                 }
//             }
//         }
//     }
// }
//  6  -3i       / 3i
//  6i -3        / 3
//
import java.time.*;
import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;
public class Main
{
    public static void main(String[] args)
    {
        String a = "Zau is a good man.";
        StringBuilder builder = new StringBuilder();
        builder.append(a);
        builder.append("\nZhaoNing is a good man,too!!");
        builder.insert(9, "dddddddddddd");
        builder.delete(9, 21);
        String goodMan = builder.toString();
        Scanner in = new Scanner(Path.of("D:\\good.txt"),StandardCharsets.UTF_8);
        
    }
}