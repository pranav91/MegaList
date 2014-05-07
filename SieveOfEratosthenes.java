package com.megalist.sieveoferatosthenes;

public class Sieve {
	static int n = 20;
	static int[] var = new int[n];
	static int[] mark=new int[n];
	
	public static int checkUnmarked(int p)
	{
		for(int i=p+1;i<n;i++){
			if(mark[i]==0){
				return i;
			}
		}
		return 0;
	}
	
	public static void sieve(int p){
		if(p<n){
		for(int i=0;i<n;i++){
			int temp = var[i]*p;
			if(temp<n){
				mark[temp]=1;
			}
		}
		
		int next = checkUnmarked(p);
		if(p!=0){
			System.out.println("Prime is..."+p);
		sieve(next);
		}
		}
		
	}
	
	
	public static void start(){
		for(int i=0;i<n;i++)
		{
			var[i] = new Integer(i+2);
			mark[i] = new Integer(0);
		}
		
		sieve(2);
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		start();
		// TODO Auto-generated method stub

	}

}
