import java.util.Scanner;

public class ChangeReturn {
	static int i = 0;
	static String[] denom = {"1000Re","500Re","100Re","50Re","20Re","10Re","5Re","2Re","1Re","50p"};
	static int[] val={1000,500,100,50,20,10,5,2,1};
	public static void printer(int value,double balance)
	{
		System.out.println(""+denom[i]+" = "+value);
		
		balance = balance%val[i];
		i=i+1;
		changeCalc(balance);
	}
	
	public static void changeCalc(double balance)
	{
		
		if(balance>0.5)
		{
		int value = (int) (balance/val[i]);
		
		printer(value,balance);
		
		}
		else
		{
			System.out.println("End of Calculation");
		}
		
	}
	
	public static void calc(double amount,double given)
	{
		if(given>=amount)
		{
		double balance = given - amount;
		changeCalc(balance);
		}
		else
		{
			System.out.println("Insufficient funds provided..");
		}
	}
	
	public static void start(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the bill amount..\n");
		double amount = s.nextDouble();
		System.out.println("Enter the amount given..\n");
		double given = s.nextDouble();
		calc(amount,given);
	}

	public static void main(String[] args) {
		
		start();
		// TODO Auto-generated method stub

	}

}
