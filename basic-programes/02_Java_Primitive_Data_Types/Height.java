import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double height=sc.nextInt();
		System.out.println("Inches-"+(height/2.54));
		System.out.println("Feets-"+(height/2.54/12));
	}
}