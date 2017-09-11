import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ArraylistWhereIsIt {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    ArrayList<Integer> arrL = new ArrayList<Integer>();
    int userInput;
    int slot = 0;

    for (int i=0; i<10; i++) {
      arrL.add(1 + r.nextInt(50));
    }
    System.out.println("ArrayList: " + arrL);
    System.out.print("Value to find: ");

    userInput = keyboard.nextInt();

    for(int j=0; j<arrL.size(); j++) {
      if(arrL.get(j)==userInput){
        slot = j;
      }
    }
    if(slot != 0){
      System.out.println(userInput + " is in slot " + slot + ".");
    } else {
      System.out.println(userInput + " is not in the array.");
    }
  }
}
