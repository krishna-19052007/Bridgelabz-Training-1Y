import java.util.Scanner;
public class Demojava
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int unitPrice=sc.nextInt();
		int quantity=sc.nextInt();
		System.out.println("Total Price-"+(unitPrice*quantity));
	}
}