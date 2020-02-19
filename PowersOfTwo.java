import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class PowersOfTwo
{
	public static void main(String[] args)
	{
		// Create scanner object
		Scanner scanner = new Scanner(System.in);

		// Create instance of Random class
		Random rand = new Random();
			
		// variable for loop condition	
		boolean continueLoop = true; //

		// user guess vs correct guess
		double userGuess = 0;
		double correctAnswer = 0;
		
		// variable for random number
		int exponent = 0;

		// Output info about the program
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Welcome to the Powers of Two Test");
		System.out.println("Type 0 to Quit");
		System.out.println("*********************************");
		System.out.println();

		do
		{
			try // try to get user input
			{
				exponent = rand.nextInt(18); // range 0 to 17
				System.out.print("2^" + exponent + ": ");
				userGuess = scanner.nextInt();	

				// check to make sure user input is not 0 before continuing	
				if (userGuess != 0)
				{
					correctAnswer = Math.pow(2, exponent);
					System.out.printf("%.0f%n", correctAnswer); // print correct answer in whole number format
				}

				// if you wants to quit, they type 0, then the progam should end
				else if (userGuess == 0)
					continueLoop = false;
			}

			catch (InputMismatchException inputMismatchException)
			{
				System.out.printf("%nException: %s%n", inputMismatchException);
				scanner.nextLine(); // discard input so user can try again
				System.out.printf("You must enter an integer. Please try again. %n%n");
			}

		} while (continueLoop == true);

		

	} // end main
} // end PowersOfTwo
