import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int theNumber = 1 + r.nextInt(10);
    int guess;

    System.out.println("I'm thinking of a number between 1 and 10.  \nYour guess: " );
    guess = keyboard.nextInt();
    System.out.println("");
    if (theNumber == guess) {
      System.out.println("That's right!  My secret number was " + theNumber + "!");
    } else {
      System.out.println("Sorry, but I was really thinking of " + theNumber + ".");
    }
  }
}
