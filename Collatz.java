//Collatz Conjecture


import java.util.Scanner;

public class Collatz {
	
	static int step=0; //initailize step count variable
	
	
	//To find if number is even or not
	public static boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	//Performs Collatz algorithm and increments step
	public static void collatz(int value)
	{
		if(value>1){
		if(isEven(value)){
			value = value/2;
		}
		else{
			value = (3*value)+1;
		}
		step = step+1;
		collatz(value);
		}
		else{
		
		System.out.println("Steps taken = "+step);
		}
	}
	
	//Gets input value from user
	public static void start(){
		System.out.println("Enter the starting value..");
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		collatz(value);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		start();
		// TODO Auto-generated method stub

	}

}
