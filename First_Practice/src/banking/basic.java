package banking;

import java.util.Scanner;

public class basic {
	int bal = 0; 
	
	public int deposit(int a)
	{
		int sum = this.bal + a;		
		return sum;
	}
	
	public int withdraw(int a)
	{
		int sub = this.bal - a;		
		return sub;
	}
	
	public void optiontype(String str)
	{
	//	case withdraw
		
	}

	public static void main(String[] args) {
		
		basic ba = new basic();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Transaction you would like to do");
		System.out.println("Deposit OR Withdraw");
		String str1 = sc.next();
		int a = sc.nextInt();
		if (str1.contentEquals("withdraw"))
		{
			ba.withdraw(a);
		}
		
		
		
		
		
		
	}

}
