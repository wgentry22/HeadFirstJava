import java.util.*;



public class Deck {
  private Card[] cards;

  public Deck(int n) {
    this.cards = new Card[n];
  }

  public Deck() {
    this.cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit <= 3; suit++) {
      for (int rank = 1; rank <= 13; rank++) {
        this.cards[index] = new Card(rank, suit);
        index++;
      }
    }
  }



  public int randomInt(int high, int low) {
    int range = Math.abs(high - low) + 1;
    return (int)(Math.random() * range) + (low <= high ? low : high);
  }

  public void swapCards(int n, int m) {
    Card temp = cards[n];
    cards[n] = cards[m];
    cards[m] = temp;
  }


  public void shuffle() {
    for (int i = 0; i < this.cards.length -1 ; i++) {
      int rand = this.randomInt(this.cards.length-1, i);
      this.swapCards(i, rand);
    }
  }

  public void compareShuffled(Deck shuffled) {
    if (this.cards.length != shuffled.cards.length) {
      System.out.println("Cannot compare decks of different size.");
    } else {
    for (int i = 0; i < this.cards.length - 1; i++) {
      System.out.printf("Original: %s\tShuffled: %s\n", this.cards[i], shuffled.cards[i]);
      }
    }
  }


  public void print() {
    for (int i = 0; i < this.cards.length; i++) {
      System.out.println(this.cards[i]);
    }
  }

  public void printWithIndex() {
    for (int i = 0; i < this.cards.length; i++) {
      System.out.println("Index: " + i + "\t" + this.cards[i]);
    }
  }

  public int indexLowest(int lowIndex, int highIndex) {
    int index = lowIndex;
    for (int i = lowIndex + 1; i <= highIndex; i++) {
      if (this.cards[i].compareTo(this.cards[index]) < 0) {
        index = i;
      }
    }
    return index;
  }

  public void selectionSort() {
    for (int i = 0; i < cards.length; i++) {
      int j = indexLowest(i, cards.length - 1);
      swapCards(i, j);
    }
  }


  public static Deck merge(Deck d1, Deck d2) {

    Deck result = new Deck(d1.cards.length + d2.cards.length);
    int choice;
    int i = 0;
    int j = 0;
    //System.out.println(result.cards.length);
    for (int k = 0; k < result.cards.length ; k++) {
      choice = 1;

      if (i == d1.cards.length)
        choice = 2;
      else if (j == d2.cards.length)
        choice = 1;
      else if (d1.cards[i].compareTo(d2.cards[j]) > 0)
        choice = 2;

      if (choice == 1) {
        result.cards[k] = d1.cards[i]; i++;
      } else {
        result.cards[k] = d2.cards[j]; j++;
      }
    }
    return result;
  }

  public Deck subdeck(int low, int high) {
    Deck sub = new Deck(high - low + 1);
    for (int i = 0; i < sub.cards.length; i++) {
      sub.cards[i] = this.cards[low + i];
    }
    return sub;
  }


  public Deck mergeSort() {
    if (this.cards.length < 2) {
      return this;
    }

    int mid = (cards.length - 1) / 2;
    Deck d1 = subdeck(0, mid);
    Deck d2 = subdeck(mid + 1, cards.length - 1);

    d1.selectionSort();
    d2.selectionSort();

    return merge(d1, d2);

  }



  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle();
    Deck sub1 = deck.subdeck(0, 10);
    Deck sub2 = deck.subdeck(15, 35);

    sub1.printWithIndex();
    System.out.println();

    sub1.mergeSort().printWithIndex();


    //System.out.println(deck1.cards[51]);

  }

}











/*===============================================================================*/



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
/*================================================================================*/


class CardCollection {
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
