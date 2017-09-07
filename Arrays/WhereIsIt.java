import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random r = new Random();
    int[] anArray;
    int userInput;
    int slot = 0;

    anArray = new int[10];
    for (int i=0; i<anArray.length; i++) {
      anArray[i] = 1 + r.nextInt(50);
      System.out.print(anArray[i] + " ");
    }
    System.out.println();
    System.out.print("Value to find: ");

    userInput = keyboard.nextInt();

    for(int j=0; j<anArray.length; j++) {
      if(anArray[j]==userInput){
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
