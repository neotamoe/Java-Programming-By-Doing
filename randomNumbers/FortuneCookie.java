import java.util.Random;

public class FortuneCookie {
  public static void main (String[] args){
    Random r = new Random();

    int theNumber = 1 + r.nextInt(6);
    int lotto1 = 1 + r.nextInt(54);
    int lotto2 = 1 + r.nextInt(54);
    int lotto3 = 1 + r.nextInt(54);
    int lotto4 = 1 + r.nextInt(54);
    int lotto5 = 1 + r.nextInt(54);
    int lotto6 = 1 + r.nextInt(54);

    if (theNumber == 1){
      System.out.println("You make your own luck.");
      System.out.println(lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6);
    } else if (theNumber == 2){
      System.out.println("You can achieve if you believe in yourself.");
      System.out.println(lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6);
    } else if (theNumber == 3){
      System.out.println("Sometimes will alone is not enough.");
      System.out.println(lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6);
    } else if (theNumber == 4){
      System.out.println("You can't lead if you don't know how to follow.");
      System.out.println(lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6);
    } else if (theNumber == 5){
      System.out.println("Code tomorrow.");
      System.out.println(lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6);
    } else if (theNumber == 6){
      System.out.println("Do or do not.  There is no try.");
      System.out.println(lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6);
    }
  }
}
