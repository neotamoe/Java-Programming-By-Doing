// 10001st prime
// Problem 7
// By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
// What is the 10 001st prime number?
// ANSWER: 104743

public class TenThousandOnePrime {
  public static void main (String[] args){
    int count = 1;
    long n = 3;
    while(count<10001){
      if (isPrime(n)){
        count++;
        System.out.println(n + " is prime, count is " + count);
      }
      n++;
    }
    System.out.println(n-1 + " is the " + count +" (10,001st) Prime.");
  }

  static boolean isPrime(long n){
    for(int i = 2; i < n; i++) {
      if(n % i == 0) {
        return false;
      }
    }
    return true;
  }

}
