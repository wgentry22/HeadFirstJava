import java.util.Random;
import java.util.Scanner;


public class guessMyNumber_V2{
  public static void game(){
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
    int guess, diff;
    int number = rand.nextInt(100) + 1;
    System.out.println("I am thinking of a number 1 and 100, inclusive.");
    System.out.print("Can you guess it?\n> ");
    guess = in.nextInt();
    diff = Math.abs(number - guess);

    if (diff == 0){
      System.out.println("Wow! I can't believe you guessed it!");
    } else {
      System.out.println("My guess: " + number);
      System.out.println("Your guess: " + guess);
      System.out.println("You were off by "+ diff + ".");
      System.out.println();
      playAgain();
    }
  }

  public static void playAgain(){
    Scanner in = new Scanner(System.in);
    System.out.println("Would you like to play again?");
    System.out.print("Please enter 'yes' to play again or 'quit' to quit.\n> ");
    String answer = in.nextLine();
    if (answer.equals("yes")){
      game();
    } else if (answer.equals("quit")){
      System.out.println("Thanks for playing!");
    } else {
      playAgain();
    }
  }

  public static void main(String[] args){
    game();
  }
}
