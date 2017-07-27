import java.util.Scanner;

public class Convert {
  public static void main(String[] args){
    double F, C;
    final double NINE_FIFTHS = 9.0 / 5.0;
    Scanner in = new Scanner(System.in);
    System.out.print("What temperature would you like to convert to Fahrenheit?\n" + "> ");
    C = in.nextDouble();
    F = (C * NINE_FIFTHS) + 32;

    System.out.printf("%.1f C = %.1f F\n", C, F);
  }
}
