import java.util.Scanner;

public class CountingMachineRevisited {
  public static void main( String[] args ) {
    int countFrom, countTo, countBy;
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Count from: ");
    countFrom = keyboard.nextInt();
    System.out.print("Count to: ");
    countTo = keyboard.nextInt();
    System.out.print("Count by: ");
    countBy = keyboard.nextInt();

    for ( int n = countFrom ; n <= countTo ; n = n+countBy ) {
      System.out.println( n );
    }
  }
}
