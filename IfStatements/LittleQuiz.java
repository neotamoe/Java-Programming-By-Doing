import java.util.Scanner;

public class LittleQuiz {
  public static void main (String[] args){
    Scanner keyboard = new Scanner(System.in);
    int answer1;
    int answer2;
    int answer3;
    int score = 0 ;

    System.out.println("Are you ready for a quiz?  Okay, here it comes!");
    System.out.println("Question 1: What is the capital of Minnesota?\n\t1. Minneapolis\n\t2. St Paul\n\t3. St Cloud");
    answer1 = keyboard.nextInt();
    if (answer1 == 1) {
      System.out.println("Incorrect.  The capital of Minnesota is St Paul.");
    }
    else if (answer1 == 2) {
      ++score;
      System.out.println("You got it!");
    }
    else if (answer1 == 3) {
      System.out.println("Incorrect.  The capital of Minnesota is St Paul.");
    }
    System.out.println("Question 2: What is my son's name?\n\t1. Eli\n\t2. Sam\n\t3. Both 1 & 2.");
    answer2 = keyboard.nextInt();
    if (answer2 == 1) {
      ++score;
      System.out.println("Correct!  But a better answer is #3.");
    }
    else if (answer2 == 2) {
      ++score;
      System.out.println("Correct!  But a better answer is #3.");
    }
    else if (answer2 == 3) {
      ++score;
      System.out.println("Correct!");
    }
    System.out.println("Question 3: True or False: Learning Java is fun.\n\t1. True\n\t2. False");
    answer3 = keyboard.nextInt();
    if (answer3 == 1) {
      ++score;
      System.out.println("Correct!");
    } else if (answer3 == 2) {
      System.out.println("Incorrect! This is fun stuff!");
    }
    System.out.println("Overall, you got " + score + " out of 3 correct. \nThank for playing!");
  }
}
