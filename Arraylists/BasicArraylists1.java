import java.util.ArrayList;

public class BasicArraylists1 {
  public static void main (String args[]){
    ArrayList<Integer> arrL = new ArrayList<Integer>(10);
    for (int i=0; i<10; i++) {
      arrL.add(-113);
    }
    for (int j=0; j<arrL.size(); j++ ) {
      System.out.println("Slot " + j + " contains a " + arrL.get(j));
    }
  }
}
