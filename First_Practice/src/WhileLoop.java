
public class WhileLoop {

	public static void main(String[] args) {
		
		for (int a=0; a<=4; a++)
		{ 
			for(int i=0; i<=a; i++)
			{				
				System.out.print("* ");
			}
			for(int b=0; b<=4-a; b++)
			{
				System.out.print("o ");
			}
			System.out.println();
		}
		

	}

}
