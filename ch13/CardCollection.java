import java.util.*;

public class CardCollection {
  private String label;
  private ArrayList<Card> cards;

  public CardCollection(String label) {
    this.label = label;
    this.cards = new ArrayList<Card>();
  }

  public void addCard(Card card) {
    this.cards.add(card); //ArrayList comes with a method 'add' which adds an element to the collection
  }

  public Card popCard(int i) {
    return cards.remove(i); //ArrayList also has a method 'remove' which takes an index, removes that element,
                            // and shifts the following cards to the left
  }

  public Card popCard() {
    int i = size() - 1;
    return popCard(i);
  }

  public int size() {
    return cards.size();
  }

  public boolean empty() {
    return cards.size() == 0;
  }

  public void deal(CardCollection that, int n) {
    for (int i = 0; i < n; i++) {   //This method removes cards from the collection its invoked on, this,
      Card card = popCard();        //and adds n cards to the collection it gets as a parameter, that.
      this.addCard(card);
    }
  }

  public Card getCard(int i) {
    return cards.get(i);
  }

  public Card last() {
    int i = size() - 1;
    return cards.get(i);
  }

  public void swapCards(int i, int j) {
    Card temp = cards.get(i);
    cards.set(i, cards.get(j));
    cards.set(j, temp);
  }


  public void shuffle() {
    Random random = new Random();
    for (int i = size() - 1; i > 0; i--) {
      int j = random.nextInt(i);
      swapCards(i, j);
    }
  }
}

class Deck extends CardCollection {
  public Deck(String label) {
    super(label);

    for (int suit = 0; suit <= 3; suit++) {
      for (int rank = 1; rank <= 13; rank++) {
        cards.add(new Card(rank, suit));
      }
    }
  }
}










/*=============================================================================*/
class Card {
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
