package Lab7;

public class Lab7Q1
{
	public static void main (String args[])
	{
		to32bit(5.4);
		to8bit(6);
		toDouble("34.4");
		to32bit2('h');
		toChar(104);
	}
	public static void to32bit(double d)
	{
		int x = 0;
		x= (int)d;
		System.out.println(x);
	}
	public static void to8bit(int one)
	{
		byte x = 0;
		x= (byte)one;
		System.out.println(x);
	}
	public static void toDouble(String s1)
	{
		double x = 0;
		x= Double.parseDouble(s1);
		System.out.println(x);
	}
	public static void to32bit2(char c)
	{
		int y = 0;
		y= (int)c;
		System.out.println(y);
	}
	public static void toChar(int two)
	{
		char c = (char)two;
		System.out.println(c);
	}
}