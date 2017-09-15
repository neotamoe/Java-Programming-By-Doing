// Largest palindrome product
// Problem 4
// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
// Find the largest palindrome made from the product of two 3-digit numbers.
// ANSWER: 906609 = 993*913
public class LargestPalindromeProduct {
  public static void main (String[] args) {
    int i = 999, j = 999, p = 0, largest = 1;
    for (i = 999; i > 900; i--) {
      for (j =  999; j > 900; j--) {
        p = i * j;
        String numberAsString = Integer.toString(p);
        if (numberAsString.charAt(0)==numberAsString.charAt(5)){
          if (numberAsString.charAt(1)==numberAsString.charAt(4)){
            if(numberAsString.charAt(2)==numberAsString.charAt(3)){
              System.out.println(p + " is a palindrome product of " + i + " * " + j);
              if (largest < p){
                largest = p;
              }
            }
          }
        }
      }
    }
    System.out.println("FINAL ANSWER: the largest palindrome is " + largest);

  }
}
