package evenOdd;

import java.util.Random;

public class EvenOdd {
public static void isEven(int x) {
	
		if(x%2==0) {
			System.out.println(x+" is an even number" );
		}
		else {
			System.out.println(x+" is not an even number" );
		}
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(); 
		int count=0;
	while(count<=100) {
		int int1 = rand.nextInt(100); 
		   isEven(int1);
		count++;
		}
	}
		
	}


