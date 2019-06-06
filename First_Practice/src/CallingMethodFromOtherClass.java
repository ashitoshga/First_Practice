
public class CallingMethodFromOtherClass {

	public static void main(String[] args) {
		// programe to call method from another class TempFunction
		TempFunction T=new TempFunction();
		//object of class
		int test = T.Summation(100, 200);
		System.out.println(test);

	}

}
