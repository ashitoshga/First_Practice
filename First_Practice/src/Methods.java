
public class Methods {

	public static void main(String[] args) {
		// to display multiplication of 2 numbers using methods\
		
		double test=multiplicationFunction(10, 5.5);
				
		System.out.println(test);
		String s= displayFunction("n1","n2");
		System.out.println(s);
	
			}
	public static double multiplicationFunction(int n1, double n2)
	{
		return n1*n2;
				
	}	
	public static String displayFunction(String n1, String n2)
	{
		System.out.println(n1+n2);
		return n1+n2;
		
	}

}
