import java.util.Scanner;

public class AddingValuesInALoop {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int total = 0;
    int userNumber;

		System.out.println("I will add up the numbers you give me.");
		System.out.print("Number: ");
		userNumber = keyboard.nextInt();
		while ( userNumber != 0 ) {
      total = total + userNumber;
			System.out.println("The total so far is " + total);
			System.out.print("Number: ");
			userNumber = keyboard.nextInt();
		}
    total = total + userNumber;
    System.out.println("The total is " + total);
	}
}
