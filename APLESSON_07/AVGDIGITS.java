import java.util.Scanner; 
 public class AVGDIGITS
 { 
 	
	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter an integer value! "); 
 		int number = kb.nextInt(); 
 		int digits = 0; 
 		int average = 0; 
 		AVGDigits(digits, average, number); 
 	} 
 	 
 	
	
	public static void AVGDigits(int digits, int average, int number) 
 	{ 
 		int num = number; 
 		while(num > 0) 
 		{ 
 			digits++; 
 			average = (average + (num % 10)); 
 			num /= 10; 
 		} 
 		System.out.println("The average of all the digits in " + number + " is " + average/digits); 
 	} 
 } 

