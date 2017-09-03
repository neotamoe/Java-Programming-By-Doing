import java.util.Random;
import java.util.Scanner;

public class HiLowLimited {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int theNumber = 1 + r.nextInt(100);
    int guess;
    int tries = 0;
    System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
    System.out.print("First guess: ");
    guess = keyboard.nextInt();
    tries++;
    while(guess != theNumber && tries <7){
      if (guess > theNumber) {
        System.out.println("Sorry, you are too high.");
        System.out.print("Guess # "+ (tries+1) + ": ");
        guess = keyboard.nextInt();
        tries++;
      } else if (guess < theNumber){
        System.out.print("Sorry, you are too low.");
        System.out.print("Guess # "+ (tries+1) + ": ");
        guess = keyboard.nextInt();
        tries++;
      }
    }
    if (guess != theNumber && tries == 7){
      System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
    } else {
      System.out.println("You guessed it!  What are the odds?!");
    }
  }
}
