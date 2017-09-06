// modified from https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
public class BasicArrays {
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

        System.out.println("Slot 0 contains: "
                           + anArray[0]);
        System.out.println("Slot 1 contains: "
                           + anArray[1]);
        System.out.println("Slot 2 contains: "
                           + anArray[2]);
        System.out.println("Slot 3 contains: "
                           + anArray[3]);
        System.out.println("Slot 4 contains: "
                           + anArray[4]);
        System.out.println("Slot 5 contains: "
                           + anArray[5]);
        System.out.println("Slot 6 contains: "
                           + anArray[6]);
        System.out.println("Slot 7 contains: "
                           + anArray[7]);
        System.out.println("Slot 8 contains: "
                           + anArray[8]);
        System.out.println("Slot 9 contains: "
                           + anArray[9]);
    }
}
