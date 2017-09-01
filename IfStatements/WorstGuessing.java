import java.util.Scanner;

public class WorstGuessing {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    int theNumber = 7;
    int guess;
    System.out.println("Welcome to the WORST number guessing game ever made!  \nI'm thinking of a number between 1-10.  Try to guess it." );
    guess = keyboard.nextInt();
    if (theNumber == guess) {
      System.out.println("You got it!  I can't believe you guessed it was " + theNumber + "!");
    } else {
      System.out.println("Wrong!  The correct number was " + theNumber + ".");
    }
  }
}
