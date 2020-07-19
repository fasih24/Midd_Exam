package FutureInvestment;

public class FutureInvestment {
	public static void interestC(double investement,double interest_rate,double months,double total_years) {
		double future_value;
		for(int i=1;i<=total_years;i++) {
		future_value=investement*Math.pow((1+interest_rate/months),months*i);
		System.out.println("future value year "+i+":"+future_value);
	}
	}
	public static void main(String[] args) {
		double invest_amt=500;
		double interest=0.1;
		double years=5;
		double month=12;
       interestC(invest_amt,interest,month,years);
	}
	

}
