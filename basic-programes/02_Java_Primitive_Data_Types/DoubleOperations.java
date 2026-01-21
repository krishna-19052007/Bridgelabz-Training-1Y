import java.util.Scanner;
public class Demojava
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		System.out.println("Int Operations-"+(a+b*c)+","+(a*b+c)+","+(c+a/b)+","+(a%b+c));
	}
}