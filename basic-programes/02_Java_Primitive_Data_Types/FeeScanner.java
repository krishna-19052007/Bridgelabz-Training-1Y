import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int fees=sc.nextInt();
		System.out.println("Discount-"+(fees/10));
		System.out.println("Final fee-"+(fees-(fees/10)));
	}
}