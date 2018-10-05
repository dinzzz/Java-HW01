package hr.fer.zemris.java.hw01;

import java.util.Scanner;

/**
 * Class that calculates and prints the factorial of the given number. An input number have to be
 * between 1 and 20. If the input is in invalid format or in unsupported range, the class will
 * notify the user.
 * 
 * @author Dinz
 *
 */
public class Factorial {
	
	/**
	 * Main class that manages the user input and executes the factorial operation.
	 * 
	 * @param args Arguments given through the command prompt.
	 */
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Unesite broj.");
			String userInput = scanner.nextLine();
			
			if(userInput.equals("kraj")) {
				System.out.println("Doviđenja.");
				scanner.close();
				System.exit(1);
			}
			
			try {
				 int userNumber = Integer.parseInt(userInput);
				 
				 if(userNumber > 20 || userNumber < 1) {
					 System.out.println("'" + userNumber + "' nije u dozvoljenom rasponu.");
					 continue;
				 }
				 int faktorijel = faktorijela(userNumber);
				 System.out.println(userNumber+"!" + " = " + faktorijel);
			}
			catch(NumberFormatException ex){
				System.out.println("'" + userInput + "' nije cijeli broj." );
			}
		}	
		
	}
	
	/**
	 * Method that calculates the factorial of an inputted number - operation that calculates
	 * the product of all positive integers less or equal to the inputted number. 
	 * 
	 * @param x Input value
	 * @return Factorial of the input value
	 */
	public static int faktorijela(int x) {
		int produkt = 1;
		for(int i = 1; i <= x; i++)
			produkt *= i;
		
		return produkt;
	}
	
	

}
