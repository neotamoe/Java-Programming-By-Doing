// Sum square difference
// Problem 6
// The sum of the squares of the first ten natural numbers is,
// 1^2 + 2^2 + ... + 102 = 385
//
// The square of the sum of the first ten natural numbers is,
// (1 + 2 + ... + 10)^2 = 552 = 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
// ANSWER: 25164150

public class SumSquareDifference {
  public static void main (String [] args){
    System.out.println("the difference is " + (squareSum(100) - sumSquare(100)));
  }

  static int squareSum (int m){
    int sum = 0;
    for (int i  = 1; i<m+1; i++) {
      sum += i;
    }
    sum = (sum * sum);
    return sum;
  }

  static int sumSquare (int n) {
    int sum2 = 0;
    for (int j = 1; j<n+1 ; j++) {
      sum2 += (j * j);
    }
    return sum2;
  }
}
