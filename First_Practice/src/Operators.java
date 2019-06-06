public class Operators {
	 int a;
	 int b;
	
	public static void main(String[] args) {
		 int c;
			Operators test = new Operators();
		Operators test1 = new Operators();
		//Operators test2 = new Operators();
		
		test.a=10;
		test1.b=20;
		//test2.c;
				
		System.out.println(test.a==test1.b);
		System.out.println(test.a>=test1.b);
		System.out.println(test.a<=test1.b);
		System.out.println(test.a!=test1.b);
		
		//public static ArithmeticOperations{
		
		System.out.println(c=test.a+test1.b);
		System.out.println(c=test.a-test1.b);
		System.out.println(c+=test.a);
		System.out.println(c=test.a*test1.b);
		System.out.println(c=test.a/test1.b);
		System.out.println(c=test.a%test1.b);
		System.out.println(test.a++);
		System.out.println(++test.a);		
		//}
		
		
		

	}

}
