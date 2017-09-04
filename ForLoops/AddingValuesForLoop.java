import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
    int sum = 0;

		System.out.print("Enter a number: ");
		int userNumber = keyboard.nextInt();
    for (int i = 1; i <= userNumber; i++) {
      System.out.print(i + " ");
      sum = sum + i;
    }
    System.out.println("\nThe sum is " + sum + ".");
  }
}
