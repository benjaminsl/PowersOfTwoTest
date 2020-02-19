import java.util.InputMismatchException;
import java.util.Scanner;

public class PowersOfTwo
{
	public static void main(String[] args)
	{
		// Create scanner object
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true; //

		// user guess vs correct guess
		int userGuess = 0;
		int correctGuess = 0;

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
				System.out.print("2^0: ");
				userGuess = scanner.nextInt();	

				// if you wants to quit, they type 0, then the progam should end
				if (userGuess == 0)
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
