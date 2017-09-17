// Summation of primes
// Problem 10
// The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
// Find the sum of all the primes below two million.

public class SummationOfPrimes{
  public static void main (String[] args){
    long sum = 2;
    for (int j = 3; j<2000000 ; j++) {
      if(isPrime(j)){
        sum += j;
        System.out.println("adding " + j);
      }
    }
    System.out.println("the sum of all primes below two million is: " + sum);
  }
  static boolean isPrime(long n){
    for(int i = 2; i <= Math.sqrt(n); i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
