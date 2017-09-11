import java.util.ArrayList;
import java.util.Random;

public class BasicArraylists3 {
  public static void main (String args[]){
    Random r = new Random();

    ArrayList<Integer> arrL = new ArrayList<Integer>(1000);
    for (int i=0; i<1000; i++) {
      arrL.add(10+r.nextInt(89));
    }
    System.out.print(arrL);
  }
}
