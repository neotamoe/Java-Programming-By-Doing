import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it several times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
    System.out.print("How many times? ");
    int repeat = keyboard.nextInt();
		int n = 0;

    // prints five times
		// while ( n < 5 )
		// {
		// 	System.out.println( (n+1) + ". " + message );
		// 	n++;
		// }

    // now prints the lines counting by 10s
    // while ( n < 10 )
		// {
		// 	System.out.println( ((n+1)*10) + ". " + message );
		// 	n++;
		// }

    // prints the number of times specified by user
    while ( n < repeat )
    {
      System.out.println( (n+1) + ". " + message );
      n++;
    }

	}
}
