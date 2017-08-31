import java.util.Scanner;

public class ForgetfulMachine {
  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Give me a word!");
    keyboard.next();
    System.out.println("Give me a second word!");
    keyboard.next();
    System.out.println("Great, now give me your favorite number?");
    keyboard.next();
    System.out.println("And now your second favorite number...");
    keyboard.next();
    System.out.println("Whew!  Wasn't that fun?!");
  }
}
