import java.util.Scanner; 
 
 
 public class compoundinterest 
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		compoundinterest dollar = new compoundinterest();
 		
		System.out.println("Please enter your interest rate:"); 
 		double r = kb.nextDouble(); 
 		
		System.out.println("Please enter the original amount of your loan:"); 
 		double p = kb.nextDouble(); 
 		
		System.out.println("Please enter the number of times your loan is compounded--per year:"); 
 		double n = kb.nextDouble(); 
 		
		System.out.println("Please enter the total life of your loan--in years:"); 
 		double t = kb.nextDouble(); 
 		double tot = dollar.money(r,p,t,n); 
 		
		System.out.printf("Your monthly payment is %10.2f!", tot); 
 		 
 	} 
 	 
 	public double money(double r, double p, double t, double n) 
 	{ 
 		return (p*(Math.pow(1+r/n,n*t)))/(t*12); 
 	} 
 	 
 } 
