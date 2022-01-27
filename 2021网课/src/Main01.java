import java.math.*;
import java.util.*;
public class Main01
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double r = sc.nextDouble();
		BigDecimal r_1 = new BigDecimal(r);
		int n = sc.nextInt();
		System.out.printf("%f",r_1.pow(n));
		
		sc.close();
	}

}
