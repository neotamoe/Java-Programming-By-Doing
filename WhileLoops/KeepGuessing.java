import java.util.Scanner;

public class KeepGuessing {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int theNumber = 4;

		System.out.println("I chose a number between 1-10.  Try to guess it.");
		System.out.print("Your guess: ");
		int guess = keyboard.nextInt();

		while ( guess != theNumber ) {
			System.out.println("\nIncorrect.  Guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
		}

		System.out.println("\nThat's right!  You're a good guesser!");
	}
}
