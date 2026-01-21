public class Main
{
	public static void main(String[] args)
	{
		int radius=6378;
		int miles=radius*1.6;
		double pi=Math.PI();
		System.out.println("Volume in Kilometers-"+("Kilometers"+4/3*pi*radius*radius*radius));
		System.out.println("Volume in Miles-"+("Miles-"+4/3*pi*miles*miles*miles));
	}
}