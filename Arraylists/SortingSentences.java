import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class SortingSentences {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String sentence = "";
    System.out.print("Sentence: ");
    sentence = keyboard.nextLine();
    sentence = sentence.toLowerCase();
    String[] sentenceArray = sentence.split(" ");
    sentenceArray = sentence.split(" ");
    List<String> newList = new ArrayList<String>(Arrays.asList(sentenceArray));
    Collections.sort(newList);

    System.out.println("Sentence sorted: " + newList);
  }
}
