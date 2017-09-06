import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        Random r = new Random();
        int[] anArray;
        int[] anArray2;
        anArray = new int[10];
        for (int i=0; i<anArray.length; i++) {
          anArray[i] = 1 + r.nextInt(100);
        }
        anArray2 = anArray.clone();
        anArray[9] = -7;
        System.out.print("Array 1: ");
        for (int i=0; i<anArray.length; i++ ) {
          System.out.print(anArray[i] + " ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for (int j=0; j<anArray2.length; j++ ) {
          System.out.print(anArray2[j] + " ");
        }
      }
}
