import java.util.InputMismatchException;
import java.util.Scanner;

public class PowersOfTwo
{
	public static void main(String[] args)
	{
		// Create scanner object
		Scanner scanner = new Scanner(System.in);
		boolean continueWrongInputLoop = true; //

		// Output info about the program
		System.out.println();
		System.out.println("*********************************");
		System.out.println("Welcome to the Powers of Two Test");
		System.out.println("Type 0 to Quit");
		System.out.println("*********************************");
		System.out.println();

		do
		{
			System.out.print("2^0: ");
			scanner.nextInt();	
		} while (continueWrongInputLoop == true);

		

	} // end main
} // end PowersOfTwo
