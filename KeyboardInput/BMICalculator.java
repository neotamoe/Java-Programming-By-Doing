import java.util.Scanner;

public class BMICalculator {

  public static void main (String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double height;
    double weight;

    System.out.print("Your height in meters: ");
    height = keyboard.nextDouble();
    System.out.print("Your weight in kg: ");
    weight = keyboard.nextDouble();
    System.out.println("Your BMI is " + weight/Math.sqrt(height));
  }

}
