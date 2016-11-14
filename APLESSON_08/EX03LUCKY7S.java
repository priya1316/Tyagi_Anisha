import java.util.Scanner; 
 public class EX03LUCKY7S
 { 
 	public static void main(String[]args) 
 	{ 
 		Scanner kb = new Scanner(System.in); 
 		System.out.println("Please, enter a number! "); 
 		int num = kb.nextInt(); 
 		System.out.println(luck(num)); 
 	} 
 	 
 	
	public static int luck(int number) 
 	{ 
 		 
 		if(number > 0)  
 		{ 
 			if(number%10==7) 
 			{ 
 				return 1 + luck(number/10); 
 			} 
 			return 0 + luck(number/10); 
 		} 
 		else 
 			return 0; 
 		 
 	} 
 } 

