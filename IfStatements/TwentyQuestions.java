import java.util.Scanner;

public class TwentyQuestions {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    String itemType;
    String isItSmallerThan;

    System.out.println("Only Two Questions--NOT Twenty\nThink of an object, and I'll try to guess it.");
    System.out.println("Question 1) Is it animal, vegetable, or mineral?");
    itemType = keyboard.next();
    System.out.println("Question 2) Is it smaller than a breadbox?  Type yes or no.");
    isItSmallerThan = keyboard.next();
    if (itemType.equalsIgnoreCase("animal")){
      if (isItSmallerThan.equalsIgnoreCase("yes")){
        System.out.println("My guess is you are thinking of a squirrel.\nI would ask if I'm right, but that's not the point of this exercise.");
      } else {
        System.out.println("My guess is you are thinking of a moose.\nI would ask if I'm right, but that's not the point of this exercise.");
      }
    } else if (itemType.equalsIgnoreCase("vegetable")){
      if(isItSmallerThan.equalsIgnoreCase("yes")){
        System.out.println("My guess is you are thinking of a carrot.\nI would ask if I'm right, but that's not the point of this exercise.");
      } else {
        System.out.println("My guess is you are thinking of a pumpkin.\nI would ask if I'm right, but that's not the point of this exercise.");
      }
    } else if (itemType.equalsIgnoreCase("mineral")){
      if (isItSmallerThan.equalsIgnoreCase("yes")) {
        System.out.println("My guess is you are thinking of a paper clip.\nI would ask if I'm right, but that's not the point of this exercise.");
      } else {
        System.out.println("My guess is you are thinking of a Camaro.\nI would ask if I'm right, but that's not the point of this exercise.");
      }
    }
  }
}
