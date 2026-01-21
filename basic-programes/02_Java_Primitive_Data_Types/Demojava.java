import java.util.Scanner;
public class Demojava
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=1;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(i==0||j==0)
				{
					b=1;
				}
				else
				{
					b*=(i-j+1)/j;
				}
				System.out.print(b);
			}
			System.out.println();
		}
	}
}