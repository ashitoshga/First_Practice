
public class NumberTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=2;
		int results=1;
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<i; j++)
			{
				results =results*a;
			
				System.out.println(results);
			}
			a++;
		}

	}

}
