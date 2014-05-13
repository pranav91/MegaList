

import java.util.Scanner;

public class NextPrime {
	static String choice = "yes";
	
	public static boolean isPrime(int i){
		
		
		for(int j=2;j<=i/2;j++){
			if(i%j==0){
				return false;
			}
			
		}
		return true;
		
	}
	
	public static int primeCalc(int n){
		
		for(int i=n+1;i<=n+1000;i++){
			if(isPrime(i)){
				return i;
			}
		}
		return 0;
	}
	public static void nextPrime(int n){
			
			
			System.out.println("Current prime is.."+n);
			Scanner s = new Scanner(System.in);
			System.out.println("Do you want to calculate the next prime number?");
			choice = s.nextLine();
			
			if(choice.equalsIgnoreCase("yes")){
				int x = primeCalc(n);
			System.out.println("The next prime number is.."+x);
			nextPrime(x);
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nextPrime(2);

	}

}
