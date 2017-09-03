import java.util.Scanner;

public class CollatzSequence {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int userNumber;

		System.out.print("Starting number: ");
    userNumber = keyboard.nextInt();
    do {
      System.out.print(userNumber + "\t");
      if (userNumber % 2 == 0){
        userNumber = userNumber / 2;
      } else {
        userNumber = ((userNumber * 3) + 1);
      }
    } while (userNumber > 1);
		System.out.print(userNumber);
  }
}
