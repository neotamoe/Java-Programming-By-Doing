import java.util.Scanner;

public class Adventure1 {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    String choice1, choice2, choice3;

    System.out.println("WELCOME TO NEOTA'S TINY CHOOSE YOUR OWN ADVENTURE!");
    System.out.println("You are in a creepy house.  Would you like to go in the \"kitchen\" or to the \"bedroom\"?");
    choice1 = keyboard.next();
    if (choice1.equalsIgnoreCase("kitchen")){ // choice 1
      System.out.println("The kitchen counter is covered in dust and mold.  Both the \"oven\" and the \"refrigerator\" have fingerprints on them.  Which one do you want to open?");
      choice2 = keyboard.next();
      if(choice2.equalsIgnoreCase("oven")){ // choice 2
        System.out.println("In the oven, there's a pot with a lid on it.  Do you take \"off\" the lid or leave it \"on\"?");
        choice3 = keyboard.next();
        if(choice3.equalsIgnoreCase("off")){ // choice 3
          System.out.println("Green fumes escape from the pot and you pass out on the floor.  The End.");
        } else { // choice 3
          System.out.println("Suddenly you notice green fumes escaping from the pot.  You try to escape, but trip and fall and pass out from the toxic fumes.  The End.");
        }
      } else { // choice 2
        System.out.println("In the refrigerator, it's empty except for a paper bag that is slimy and super stinky.  Do you \"open\" the bag or \"shut\" the door and run out of the house?");
        choice2 = keyboard.next();
        if(choice2.equalsIgnoreCase("open")){
          System.out.println("Your fingers accidentally touch some of the slime and your fingers start to burn and lose feeling in your arms.  You run to the front door and fumble with the doorknob.  Does it \"open\" or \"not\"?");
          choice3 = keyboard.next();
          if(choice3.equalsIgnoreCase("open")){  // choice 3
            System.out.println("You escape and run screaming down the street.  You lived!  The End.");
          } else {
            System.out.println("You sob and scratch at the door before passing out from the pain.  Oh no.  Will anyone ever find you?  The End.");
          }
        } else { // choice2
          System.out.println("You shut the refrigerator door, but notice the slime was on the handle and your fingers are burning.  You run to the front door and fumble with the doorknob.  Does it \"open\" or \"not\"?");
          choice3 = keyboard.next();
          if(choice3.equalsIgnoreCase("open")){
            System.out.println("The door opens and you run out to seek medical help...hopefully it will be in time to save your fingers.  The End.");
          } else {
            System.out.println("You scream and cry.  Suddenly you hear police on the other side of the door.  You're going to live after all.  The End.");
          }
        }
      }
    } else { // choice 1
      System.out.println("The bedroom is dark and you hear a rustling under the bed.  Do you \"look\" under the bed or do you \"run\" out of the room?");
      choice2 = keyboard.next();
      if(choice2.equalsIgnoreCase("look")){ // choice 2
        System.out.println("You see a big flat box under the bed.  Do you \"grab\" the box or \"run\" away?");
        choice3 = keyboard.next();
        if(choice3.equalsIgnoreCase("grab")){ // choice 3
          System.out.println("You try to grab the box, but a giant rat escapes from the box and bites your hand.  You writhe in pain and pass out.  The End.");
        } else {
          System.out.println("You try to run away, but trip and fall.  A rat escapes from the box and bites your hands.  You are bleeding and pass out from the pain.  The End.");
        }
      } else { // choice 2
        System.out.println("You start to run out of the room, but trip and fall.  That's when you notice the man sitting in the corner.  Do you \"scream\" or do you try to \"back\" away quietly?");
        choice3 = keyboard.next();
        if (choice3.equalsIgnoreCase("scream")) { // choice 3
          System.out.println("You scream, but then notice the man is a mannequin.  You run out of the house and never look back.");
        } else {
          System.out.println("You start backing out of the room, but then notice the man is a mannequin.  You scream anyway and run out of the house and never look back.");
        }
      }
    }
  }
}
