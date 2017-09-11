import java.util.ArrayList;
import java.util.Random;

public class CopyingArraylists {
  public static void main (String args[]){
    Random r = new Random();
    ArrayList<Integer> arrL1 = new ArrayList<Integer>(10);
    Object arrL2;
    for (int i=0; i<10; i++) {
      arrL1.add(1+r.nextInt(100));
    }
    arrL2 = arrL1.clone();
    arrL1.set(9, -7);
    System.out.println("ArrayList 1: " + arrL1);
    System.out.println("ArrayList 2: " + arrL2);
  }
}
