import java.util.Random;

public class BasicArrays3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] anArray;

        anArray = new int[10];
        for (int i=0; i<anArray.length; i++) {
          anArray[i] = 1 + r.nextInt(100);
          System.out.println("Slot " + i + " contains: " + anArray[i]);
        }
      }
}
