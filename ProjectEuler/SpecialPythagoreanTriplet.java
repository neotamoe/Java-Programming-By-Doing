// Special Pythagorean triplet
// Problem 9
// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
// a2 + b2 = c2
// For example, 32 + 42 = 9 + 16 = 25 = 52.
//
// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

public class SpecialPythagoreanTriplet {
  public static void main (String [] args){
    int a,b,c;

    for ( a=1; a<499; a++) {
      for ( b=2; b<500; b++) {
        c = 1000-a-b;
        if ((1000 - a - b == c) && (a*a + b*b==c*c) && (a < b) && (b < c)){
            System.out.println("special pythagoren triplet is: a: " + a + " b: " + b + " c: " + c);
            System.out.println("product of abc = " + a*b*c);
        }
      }
    }
  }
}
