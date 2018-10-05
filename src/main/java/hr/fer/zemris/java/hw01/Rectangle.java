package hr.fer.zemris.java.hw01;


import java.util.Scanner;

/**
 * Class that calculates the perimeter and the area of a rectangle based on given width and height.
 * If the parameters are given by the user while executing the program, the area and the perimeter will be calculated
 * based on those parameters. Otherwise, the program will urge the user to input the width and height individually.
 * If the input is in invalid format or in unsupported range, the class will notify the user.
 * 
 * @author Dinz
 *
 */
public class Rectangle {
	
	/**
	 * Main method that manages the user input and executes the Rectangle class.
	 * 
	 * @param args Paramaters inputted through the command prompt.
	 */
	public static void main(String[] args) {
		
		if(args.length != 0 && args.length != 2) {
			System.out.println("Neispravan broj argumenata. Prekid rada.");
			System.exit(1);
		}
		
		if(args.length == 2) {
			double sirina;
			double visina;
			
			try {
				
				sirina = Double.parseDouble(args[0]);			
				visina = Double.parseDouble(args[1]);
				
				if(sirina <= 0 || visina <= 0) {
					System.out.println("Jedan ili oba argumenata nisu u dozvoljenom rasponu.");
					System.exit(1);
				}
				
				ispisi(sirina, visina, povrsina(sirina,visina), opseg(sirina,visina));
				
				} catch (NumberFormatException e) {
				System.out.println("Neispravno uneseni argumenti. Doviđenja.");
				System.exit(1);
				}		
			
			}		
		
		else {
			Scanner scanner = new Scanner(System.in);
			double sirina;
			double visina;
			
			while(true) {
				System.out.print("Unesite širinu.");
				String userInput = scanner.nextLine();
				
				try {
					double userNumber = Double.parseDouble(userInput);
					
					if(userNumber <= 0)
						System.out.println("Unijeli ste negativnu vrijednost ili nulu.");
					else {
						sirina = userNumber;
						break;
								
					}
						
				} 
				catch (NumberFormatException ex) {
					System.out.println("'" + userInput + "' se ne može protumačiti kao broj.");
				}
				 
			}
			
			while(true) {
				System.out.print("Unesite visinu.");
				String userInput = scanner.nextLine();
				
				try {
					double userNumber = Double.parseDouble(userInput);
					
					if(userNumber <= 0)
						System.out.println("Unijeli ste negativnu vrijednost ili nulu.");
					else {
						visina = userNumber;
						break;
								
					}
						
				} 
				catch (NumberFormatException ex) {
					System.out.println("'" + userInput + "' se ne može protumačiti kao broj.");
				}
				 
			}
			
			scanner.close();
			ispisi(sirina, visina, povrsina(sirina,visina), opseg(sirina,visina));
		}

	}
	/**
	 * Method that calculates the area of a rectangle.
	 * 
	 * @param sirina Rectangle Width
	 * @param visina Rectangle Height
	 * @return Value of the area of a rectangle.
	 */
	public static double povrsina(double sirina, double visina) {
		return sirina*visina;
	}
	
	/**
	 * Method that calculates the perimeter of a rectangle.
	 * 
	 * @param sirina Rectangle Width
	 * @param visina Rectangle Height
	 * @return Value of the perimeter of a rectangle.
	 */
	public static double opseg(double sirina, double visina) {
		return 2*sirina + 2*visina;
	}
	
	/**
	 * Method that prints the perimeter and the area of a rectangle.
	 * 
	 * @param sirina Inputted Rectangle Width
	 * @param visina Inputted Rectangle Height
	 * @param povrsina Calculated Rectangle Area
	 * @param opseg Calculated Rectangle Perimeter
	 */
	public static void ispisi(double sirina, double visina, double povrsina, double opseg) {
		System.out.println("Pravokutnik širine " + sirina + " i visine " + visina + " ima površinu " + povrsina + " te opseg " + opseg + ".");
	}
	

}
