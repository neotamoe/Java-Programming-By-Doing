import java.util.Random;

public class ShorterDoubleDice {
  public static void main (String[] args){
    Random r = new Random();
    int roll1;
    int roll2;
    System.out.println("HERE COMES THE DICE!\n");

    do{
      roll1 = 1 + r.nextInt(6);
      roll2 = 1 + r.nextInt(6);
      System.out.println("Roll #1: " + roll1);
      System.out.println("Roll #2: " + roll2);
      System.out.println("The total is " + (roll1 + roll2) + "\n");
    }

    while (roll1 != roll2);
  }
}
