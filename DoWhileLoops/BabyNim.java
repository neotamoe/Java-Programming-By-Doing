import java.util.Scanner;

public class BabyNim {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pileA = 3;
    int pileB = 3;
    int pileC = 3;
    int remove = 0;
    String pileChosen;

    while (pileA > 0 || pileB > 0 || pileC > 0) {
      System.out.println("A: " + pileA + " B: " + pileB + " C: " + pileC);
      System.out.println("Choose a pile: ");
      pileChosen = keyboard.next();
      System.out.println("How many to remove from pile " + pileChosen + ": ");
      remove = keyboard.nextInt();
      if (pileChosen.equalsIgnoreCase("A")) {
        pileA = pileA - remove;
      } else if (pileChosen.equalsIgnoreCase("B")){
        pileB = pileB - remove;
      } else if (pileChosen.equalsIgnoreCase("C")) {
        pileC = pileC - remove;
      }
    } if (pileA <=0 && pileB <=0 && pileC <=0){
		  System.out.print("All piles are empty.  Good job!");
    }
  }
}
