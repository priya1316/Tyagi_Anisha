import java.util.Scanner; 
 public class TOYSTORERUNNER  
 { 
 	public static void main(String[]args) 
	{ 
 		String listoftoys = ""; 
 		Scanner kb = new Scanner(System.in); 
		System.out.println("Enter in the list of toys: "); 
 		listoftoys = kb.nextLine(); 
 		 
		THETOYSTORECLASS TS = new THETOYSTORECLASS(listoftoys); 
 		System.out.println(TS); 
 		System.out.println("Most Frequent Toy: " + TS.getMostFrequentToy()); 
 		System.out.println("Most Frequest Type of Toy: " + TS.getMostFrequentType()); 
 		 
 	} 
 } 