import java.util.Random;

public class BabyBlackjack {
  public static void main (String[] args){
    Random r = new Random();
    int card1, card2, dealer1, dealer2, yourTotal, dealerTotal;
    card1 = 1 + r.nextInt(10);
    card2 = 1 + r.nextInt(10);
    dealer1 = 1 + r.nextInt(10);
    dealer2 = 1 + r.nextInt(10);

    System.out.println("Baby Blackjack!");
    System.out.println("You drew " + card1 + " and " + card2 + ".");
    yourTotal = card1 + card2;
    System.out.println("Your total is " + yourTotal + ".");

    System.out.println("The dealer has " + dealer1 + " and " + dealer2 + ".");
    dealerTotal = dealer1 + dealer2;
    System.out.println("The dealer's total is " + dealerTotal + ".");

    if (yourTotal > dealerTotal) {
      System.out.println("You WIN!");
    } else if (dealerTotal > yourTotal) {
      System.out.println("Dealer wins.");
    } else {
      System.out.println("It's a draw!");
    }
  }
}
