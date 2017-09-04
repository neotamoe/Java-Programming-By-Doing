public class XsAndYs {
  public static void main( String[] args ) {
    System.out.println("x\ty");
    System.out.println("--------------");
    for ( double n = -10 ; n <= 10 ; n = n+0.5 ) {
      double y = n*n;
      System.out.println( n+"\t"+y );
    }
  }
}
