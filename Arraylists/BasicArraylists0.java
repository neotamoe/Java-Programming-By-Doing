import java.util.ArrayList;

public class BasicArraylists0 {
  public static void main (String args[]){
    ArrayList<Integer> arrL = new ArrayList<Integer>(5);
    arrL.add(-113);
    arrL.add(-113);
    arrL.add(-113);
    arrL.add(-113);
    arrL.add(-113);
    System.out.println("Slot 0 contains a " + arrL.get(0));
    System.out.println("Slot 1 contains a " + arrL.get(1));
    System.out.println("Slot 2 contains a " + arrL.get(2));
    System.out.println("Slot 3 contains a " + arrL.get(3));
    System.out.println("Slot 4 contains a " + arrL.get(4));
  }
}
