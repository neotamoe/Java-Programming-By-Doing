import java.util.Random;

public class BasicArrays4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] anArray;

        anArray = new int[1000];
        for (int i=0; i<anArray.length; i++) {
          anArray[i] = 10 + r.nextInt(89);
          System.out.print(anArray[i] + ((i%10==9) ? "\n" : "  "));
        }
      }
}
