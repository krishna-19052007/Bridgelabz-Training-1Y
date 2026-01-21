import java.util.Scanner;
public class Demojava
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int feet=sc.nextInt();
		System.out.println("Yards-"+(feet/3));
		System.out.println("Miles-"+(feet/3/1760));
	}
}