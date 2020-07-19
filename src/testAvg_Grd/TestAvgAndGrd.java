package testAvg_Grd;

import java.util.Scanner;

public class TestAvgAndGrd {
public static double calcAverage(double [] x) {
	double total=0.0;
	double avg=0.0;
	for(int i=0;i<x.length;i++) {
		total+=x[i];
	}
		avg=total/x.length;
		return avg;
	}
public static void determineGrade(double avg) {
	if(avg>=90) {
		System.out.println("A");
	}
	else if(avg>=80  && avg<=89) {
		System.out.println("B");
	}
	else if(avg>=70 && avg<=79) {
		System.out.println("C");
	}
	else if(avg>=60 && avg<=69) {
		System.out.println("D");
	}
	else if(avg<60) {
		System.out.println("F");
	}
}
	
public static void main(String[] args) {
double [] a=new double[4];
Scanner s=new Scanner(System.in);
System.out.println("enter five test scores ");
    for(int i=0;i<a.length;i++) {
        a[i]=s.nextDouble();
}
    calcAverage(a);
    System.out.println("average of test scores : "+calcAverage(a));
    determineGrade(calcAverage(a));
    
}
}
