import java.util.Random;

public class LocatingLargest {
  public static void main(String[] args) {
    Random r = new Random();
    int[] anArray;
    int largest = 0;
    int slot = 0;
    anArray = new int[10];

    for (int i=0; i<anArray.length; i++) {
      anArray[i] = 1 + r.nextInt(50);
      System.out.print(anArray[i] + " ");
    }
    System.out.println();

    for(int j=0; j<anArray.length; j++) {
      if(anArray[j] >= largest){
        largest = anArray[j];
        slot = j;
      }
    }
    System.out.println("The largest value is " + largest);
    System.out.println("It is in slot " + slot);

  }
}
