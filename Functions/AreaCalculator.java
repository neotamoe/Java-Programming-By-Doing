import java.util.Scanner;

public class AreaCalculator {
	public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Shape Area Calculator");
    System.out.println();
    System.out.print("1) Triangle\n2) Rectangle\n3) Square\n4) Circle\n5) Quit\nWhich shape? ");
    int choice = keyboard.nextInt();

    if (choice == 1){
      System.out.print("Base: ");
      int base = keyboard.nextInt();
      System.out.print("Height: ");
      int height = keyboard.nextInt();
      System.out.println("\nThe area is " + area_triangle(base, height) + ".");
    } else if (choice == 2){
      System.out.print("Length: ");
      int length = keyboard.nextInt();
      System.out.print("Width: ");
      int width = keyboard.nextInt();
      System.out.println("\nThe area is " + area_rectangle(length, width) +"." );
    } else if (choice == 3){
      System.out.print("Side length: ");
      int side = keyboard.nextInt();
      System.out.println("\nThe area is " + area_square(side) + ".");
    } else if (choice == 4){
      System.out.print("Radius: ");
      int radius = keyboard.nextInt();
      System.out.println("\nThe area is " + area_circle(radius) + "." );
    } else if (choice == 5){
      System.out.print("Goodbye.");
    } else {
      System.out.println("That's not a choice.");
    }
  }

  public static double area_circle( int radius ){
    double area = Math.PI*radius*radius;
    return area;
  }              // returns the area of a circle
  public static int area_rectangle( int length, int width ){
    int area = length * width;
    return area;
  }   // returns the area of a rectangle
  public static int area_square( int side ){
    int area = side * side;
    return area;
  }                   // returns the area of a square
  public static double area_triangle( int base, int height ){
    double area = .5 * base * height;
    return area;
  }  // returns the area of a triangle

}
