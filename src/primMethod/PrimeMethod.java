package primMethod;

import java.util.Scanner;

public class PrimeMethod {
	public static boolean isPrime(int x) {
	boolean a=true;
	for(int i=0;i<x;i++) {
		
	}
		if(x%x==0 && x%1==0) {
		return true;
		}
		else 
		return a=false;
	}
	
	public static void main(String[] args) {
		int a; 
		Scanner s=new Scanner(System.in);
        System.out.println("enter an integer ");
        a=s.nextInt();
        isPrime(a);
        if(isPrime(a)==true) {
        	System.out.println("it is a prime number : "+a);
        }
        else {
        	System.out.println("it is not a prime number : "+a);
        }
	}

}
