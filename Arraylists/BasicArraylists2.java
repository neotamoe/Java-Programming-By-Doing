import java.util.ArrayList;
import java.util.Random;

public class BasicArraylists2 {
  public static void main (String args[]){
    Random r = new Random();

    ArrayList<Integer> arrL = new ArrayList<Integer>(10);
    for (int i=0; i<10; i++) {
      arrL.add(1+r.nextInt(100));
    }
    System.out.println("ArrayList: " + arrL);
  }
}
