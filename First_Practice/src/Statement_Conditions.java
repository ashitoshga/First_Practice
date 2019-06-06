
public class Statement_Conditions {

	public static void main(String[] args) {
		int a=2, b=4, c=0, d=8, e=10;
		if ((a<b)&&(a<c)&&(a<d)&&(a<e))
		{
			System.out.println("A is Smallest Number");
		}
		else if ((b<a)&&(b<c)&&(b<d)&&(b<e))
		{
			System.out.println("B is Smallest Number");
		}
		if ((c<b)&&(c<a)&&(c<d)&&(c<e))
		{
			System.out.println("C is Smallest Number");
		}
		else if ((d<a)&&(d<c)&&(d<b)&&(d<e))
		{
			System.out.println("D is Smallest Number");
		}
		else if ((e<a)&&(e<c)&&(e<b)&&(e<d))
		{
			System.out.println("E is Smallest Number");
		}
			
	}

}
