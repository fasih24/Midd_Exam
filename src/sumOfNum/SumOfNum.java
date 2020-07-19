package sumOfNum;

import java.util.Scanner;

public class SumOfNum {
	public static void sum(int x) {
	int s=0;
	for(int i=0;i<x;i++) {
		s=(x*(x+1)/2);
	}
	System.out.println("sum of all inetegers: "+s);
		
	
		
	}

	public static void main(String[] args) {
	int a;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
    a=s.nextInt();
    while (a < 0 ) {
        System.out.print("only accept positive integers  ");
        System.out.println("enter number again");
        a =s.nextInt();
    }
    sum(a);
    
    
	}

}
