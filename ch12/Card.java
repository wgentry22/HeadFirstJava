import java.util.Arrays;


public class Card {
  private final int rank;
  private final int suit;


  public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public static final String[] RANKS = {
    null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
  };

  public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

  public static Card[] makeDeck() {
    Card[] cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit <= 3; suit++) {
      for (int rank = 1; rank <= 13; rank++) {
        cards[index] = new Card(rank, suit);
        index++;
      }
    }
    return cards;
  }

  public String toString() {
    return RANKS[this.rank] + " of " + SUITS[this.suit];
  }


  public int compareTo(Card that) { //returns 1 if 'this' wins, returns -1 if 'that' wins, 0 if equal
    if (this.suit < that.suit) {
      return -1;
    }

    if (this.suit > that.suit) {
      return 1;
    }

    if (this.rank < that.rank) {
      if (this.rank == 1 && that.rank == 13) {
        return 1;
      }
      return -1;
    }

    if (this.rank > that.rank) {
      return 1;
    }

    return 0;
  }


  public static void printDeck(Card[] cards) {
    for (int i = 0; i < cards.length; i++) {
      System.out.println(cards[i]);
    }
  }


  public static int[] suitHist(Card[] cards) {
    int[] hist = new int[4];
    for (int i = 0; i < cards.length; i++) {
      hist[cards[i].suit]++;
    }
    return hist;
  }

  public static boolean hasFlush(Card[] cards) {
    boolean flush = false;
    int[] hand = suitHist(cards);
    for (int i = 0; i < hand.length; i++) {
      if (hand[i] >= 5) {
        flush = true;
      }
    }
    return flush;
  }
}
