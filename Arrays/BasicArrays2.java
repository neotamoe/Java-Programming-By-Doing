// modified from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
public class BasicArrays2 {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = -113;
        // initialize second element
        anArray[1] = -113;
        // and so forth
        anArray[2] = -113;
        anArray[3] = -113;
        anArray[4] = -113;
        anArray[5] = -113;
        anArray[6] = -113;
        anArray[7] = -113;
        anArray[8] = -113;
        anArray[9] = -113;
        for (int i=0; i<anArray.length; i++) {
          System.out.println("Slot " + i + " contains: " + anArray[i]);
        }
    }
}
