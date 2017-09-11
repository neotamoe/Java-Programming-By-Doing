import java.util.Random;
import java.util.ArrayList;

public class LocatingTheLargestValueInAnArraylist {
  public static void main(String[] args) {
    Random r = new Random();
    ArrayList<Integer> arrL = new ArrayList<Integer>();
    int largest = 0;
    int slot = 0;

    for (int i=0; i<10; i++) {
      arrL.add(1 + r.nextInt(50));
    }
    System.out.println("ArrayList: " + arrL);

    for(int j=0; j<arrL.size(); j++) {
      if(arrL.get(j) >= largest){
        largest = arrL.get(j);
        slot = j;
      }
    }
    System.out.println("The largest value is " + largest);
    System.out.println("It is in slot " + slot);

  }
}
