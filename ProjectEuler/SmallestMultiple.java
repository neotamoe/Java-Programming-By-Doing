// Smallest multiple
// Problem 5
// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class SmallestMultiple {
  public static void main (String[] args) {
    int theNumber = 21;
    boolean found = false;
    while(!found){
      if(theNumber%20==0 && theNumber%19==0 && theNumber%18==0 && theNumber%17==0 && theNumber%16==0 && theNumber%15==0 && theNumber%14==0 && theNumber%13==0 && theNumber%12==0 && theNumber%11==0){
        System.out.println("the number is: " + theNumber);
        found = true;
      } else {
        theNumber +=1;
        found = false;
      }
    }


  }
}
