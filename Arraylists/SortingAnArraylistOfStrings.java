import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArraylistOfStrings {
  public static void main(String[] args) {
    Random r = new Random();
    ArrayList<String> arrL = new ArrayList<String>();

    arrL.add("if");
    arrL.add("i");
    arrL.add("cannot");
    arrL.add("do");
    arrL.add("great");
    arrL.add("things");
    arrL.add("can");
    arrL.add("small");
    arrL.add("in");
    arrL.add("a");
    arrL.add("way");
    System.out.println("ArrayList before: " + arrL);

    Collections.sort(arrL);

    System.out.println("ArrayList after: " + arrL);
  }
}
