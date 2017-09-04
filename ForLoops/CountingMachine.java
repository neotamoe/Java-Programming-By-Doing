import java.util.Scanner;

public class CountingMachine {
  public static void main( String[] args ) {
    int userNumber;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Count to: ");
    userNumber = keyboard.nextInt();
    for ( int n = 0 ; n <= userNumber ; n = n+1 ) {
      System.out.println( n );
    }
  }
}
