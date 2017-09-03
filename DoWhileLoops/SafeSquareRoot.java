import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int userNumber;

		System.out.println("SQUARE ROOT!");
		do {
			System.out.print("Enter a number: ");
			userNumber = keyboard.nextInt();
			if (userNumber >= 0) {
				System.out.println("\nThe square root of " + userNumber + " is " + Math.sqrt(userNumber) + ".");
			} else {
				System.out.println("\nYou can't take the square root of a negative number.  \nTry again.");
			}
		}
		while ( userNumber < 0 );

	}
}
