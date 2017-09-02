import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();

    int theNumber = 1 + r.nextInt(3);
    int guess;

    System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
    System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
    System.out.println("He lays down three cards.\n");
    System.out.println("Which one is the ace?\n");
    System.out.println("\t\t##\t##\t##");
    System.out.println("\t\t##\t##\t##");
    System.out.println("\t\t1 \t2 \t3 ");
    System.out.print("> ");
    guess = keyboard.nextInt();
    if (guess == theNumber){
      System.out.println("You nailed it!  Fast Eddie reluctantly hands over your winnings, scowling.");
      if(guess == 1){
        System.out.println("\t\tAA\t##\t##");
        System.out.println("\t\tAA\t##\t##");
        System.out.println("\t\t1 \t2 \t3 ");
      } else if (guess == 2){
        System.out.println("\t\t##\tAA\t##");
        System.out.println("\t\t##\tAA\t##");
        System.out.println("\t\t1 \t2 \t3 ");
      } else {
        System.out.println("\t\t##\t##\tAA");
        System.out.println("\t\t##\t##\tAA");
        System.out.println("\t\t1 \t2 \t3 ");
      }
    } else if (theNumber == 1) {
      System.out.println("Ha!  Fast Eddie wins again!  The ace was card number 1.");
      System.out.println("\t\tAA\t##\t##");
      System.out.println("\t\tAA\t##\t##");
      System.out.println("\t\t1 \t2 \t3 ");
    } else if (theNumber == 2) {
      System.out.println("Ha!  Fast Eddie wins again!  The ace was card number 2.");
      System.out.println("\t\t##\tAA\t##");
      System.out.println("\t\t##\tAA\t##");
      System.out.println("\t\t1 \t2 \t3 ");
    } else {
      System.out.println("Ha!  Fast Eddie wins again!  The ace was card number 3.");
      System.out.println("\t\t##\t##\tAA");
      System.out.println("\t\t##\t##\tAA");
      System.out.println("\t\t1 \t2 \t3 ");
    }
  }
}
