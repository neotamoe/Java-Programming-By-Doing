import java.util.Scanner;

public class NumberGuessingWithACounter {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int theNumber = 4;
    int tries = 0;

		System.out.println("I chose a number between 1-10.  Try to guess it.");
		System.out.print("Your guess: ");
		int guess = keyboard.nextInt();
    tries++;

		while ( guess != theNumber ) {
			System.out.println("\nIncorrect.  Guess again.");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
      tries++;
		}

		System.out.println("\nThat's right!  You're a good guesser!");
    System.out.println("It only took you " + tries + " tries.");
	}
}
