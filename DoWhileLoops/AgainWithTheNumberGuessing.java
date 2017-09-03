import java.util.Scanner;

public class AgainWithTheNumberGuessing {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int theNumber = 4;
    int tries = 0;
		int guess;

		System.out.println("I chose a number between 1-10.  Try to guess it.");
		do {
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
    	tries++;
			if (guess == theNumber) {
				System.out.println("\nThat's right!  You're a good guesser!");
			} else {
				System.out.println("\nIncorrect.  Guess again.");
			}
		}
		while ( guess != theNumber );

    System.out.println("It only took you " + tries + " tries.");
	}
}
