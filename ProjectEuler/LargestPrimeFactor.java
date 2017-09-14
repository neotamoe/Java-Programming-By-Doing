// Largest prime factor
// Problem 3
// The prime factors of 13195 are 5, 7, 13 and 29.
//
// What is the largest prime factor of the number 600851475143 ?
// ANSWER: 6857


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.lang.Math;

public class LargestPrimeFactor {
  public static void main (String[] args) {
    ArrayList<Integer> factors = new ArrayList<Integer>();
    long theNumber = 600851475143L;
    int largest = 0;
    // timestamp to know how long it takes for calculation to finish (for curiosity sake)
    // Calendar calendar = Calendar.getInstance();
    // java.util.Date now = calendar.getTime();
    // java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());
    // System.out.println("zoned date and time at start of program: " + currentTimestamp);
    for (int i=2; i<theNumber/2 && i>0; i++) {
        if(theNumber%i==0){
          if(isPrime(i)){
            largest = i;
            System.out.println("largest: " + largest);
          }
        }
      }
    }

  static boolean isPrime(long n){
    if (n%2==0){
      return false;
    } if (n%5==0) {
      return false;
    } else {
      for(int j = 3; j < n/2; j+=2) {
        if(n % j == 0) {
          return false;
        }
      }
    }
    System.out.println(n + " is prime");
    return true;
  }
}
