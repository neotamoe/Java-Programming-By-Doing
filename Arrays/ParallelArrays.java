import java.util.Scanner;

public class ParallelArrays {
	public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    String[] names = { "Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks" };
    double[] gpa = { 99.5, 78.5,95.6,96.8,82.7 };
    int[] id = {123456, 123457,123458,123459,987654};
    int toFind;
    int slot;

    System.out.print("Values:\n\t");
		for ( int i=0; i<names.length; i++ ){
      System.out.print(names[i] + " " + gpa[i] + " " + id[i] + "\n\t");
    }

		System.out.println();
    System.out.print("ID number to find: ");
    toFind = keyboard.nextInt();

    for (int j=0; j<id.length; j++) {
      if(id[j]==toFind){
        slot = j;
        System.out.println("\nFound in slot " + slot);
        System.out.print("\tName: " + names[slot]);
        System.out.print("\n\tAverage: " + gpa[slot]);
        System.out.print("\n\tID: " + id[slot] + "\n");
      }
    }

	}
}
