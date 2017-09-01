import java.util.Scanner;

public class AgeMessages3 {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;

    System.out.println("Hi, what is your name?");
    name = keyboard.next();
    System.out.println("How old are you?");
    age = keyboard.nextInt();
    if (age<16){
      System.out.println("You can't drive, " + name + ".");
    }
    if (age==16 || age==17){
      System.out.println("You can drive, but not vote, " + name + ".");
    }
    if (age>17 && age<25){
      System.out.println("You can vote but not rent a car, " + name + ".");
    }
    if (age>=25){
      System.out.println("You can do pretty much anything, " + name + ".");
    }
  }
}
