public class calculate
{
	public static void main (String[] arg)
	{
		System.out.println("Calculate...");
		//int first = Integer.valueOf(arg[0]);
		//int second = Integer.valueOf(arg[1]);
		
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double sum = first+second;
		System.out.println("sum="+sum);
		double riznu = first-second;
		System.out.println("Riznu="+riznu);
		double mn = first*second;
		System.out.println("Mnozennja="+mn);
		double dil = first/second;
		System.out.println("Dilennja="+dil);
		
	}
}