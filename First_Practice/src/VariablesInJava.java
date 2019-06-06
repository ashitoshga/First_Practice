
public class VariablesInJava {

	public static int StaticVariable = 1;
	//this is static instance variable can be accessed by just putting var name in print cmd
	public int NonStaticVariable = 1000;
	//this is non-static/class instance var u need to use object of class to access in print cmd
	public static void main(String[] args) {
	//this is main method which doesn't return any value
		
	int LocalVariable = 100;
	//this is local var can be accessed directly in print cmd
	
	VariablesInJava test = new VariablesInJava();
		//this is object of class 
	VariablesInJava test1 = new VariablesInJava();
	VariablesInJava test2 = new VariablesInJava();
	VariablesInJava test3 = new VariablesInJava();
	//u can create multiple objects of same class
	
	System.out.println(StaticVariable);
	System.out.println(test.NonStaticVariable);
	 
	System.out.println(test1.NonStaticVariable);
	System.out.println(test2.NonStaticVariable);
	System.out.println(test3.NonStaticVariable);
	
	System.out.println(LocalVariable);
			
	}

}
