package retailPriceCal;

import java.util.Scanner;


public class RetailPriceCalculator {
	public static void calculateRetail(double cost, double percentage) {
		double retial_price=0;
		retial_price=cost*percentage+cost;
		System.out.println("retail price : "+retial_price);
	}
	

	public static void main(String[] args) {
	double a;
	double per1=1.0;
	double per2=0.5;
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter whole sale cost ");
          a=s.nextDouble();
          System.out.println("when  markup percentage is 100 percent");
          calculateRetail(a,per1);
          System.out.println("when  markup percentage is 50 percent");
          calculateRetail(a,per2);
         
	}

}
