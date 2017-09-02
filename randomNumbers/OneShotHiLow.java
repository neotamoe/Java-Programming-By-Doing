import java.util.Random;
import java.util.Scanner;

public class OneShotHiLow {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int theNumber = 1 + r.nextInt(100);
    int guess;

    System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
    System.out.print("> ");
    guess = keyboard.nextInt();
    if (guess == theNumber){
      System.out.println("You guessed it!  What are the odds?!");
    } else if (guess > theNumber) {
      System.out.println("Sorry, you are too high.  I was thinking of " + theNumber + ".");
    } else {
      System.out.println("Sorry, you are too low.  I was thinking of " + theNumber + ".");
    }
  }
}
