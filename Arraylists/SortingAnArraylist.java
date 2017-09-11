import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArraylist {
  public static void main(String[] args) {
    Random r = new Random();
    ArrayList<Integer> arrL = new ArrayList<Integer>();

    for (int i=0; i<10; i++) {
      arrL.add(10 + r.nextInt(89));
    }
    System.out.println("ArrayList before: " + arrL);

    Collections.sort(arrL);

    System.out.println("ArrayList after: " + arrL);
  }
}
