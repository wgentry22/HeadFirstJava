import java.util.Random;
import java.util.Scanner;

public class GuessStarter{
  public static void main(String[] args){
    //pick a random number
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int diff, guess;
    int number = random.nextInt(100) + 1;
    System.out.println("Let's play a game. I am thinking of a number between 1 and 100, inclusive.");
    System.out.println("Can you guess what it is?");
    guess = in.nextInt();
    System.out.println("My guess: " + number);
    System.out.println("Your guess: " + guess);
    diff = number - guess;

    System.out.println("You were off by: " + Math.abs(diff));
  }
}
