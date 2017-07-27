import java.util.Scanner;

public class secondsCalculator{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int seconds, hours, minutes, outputSeconds, afterHours, afterMinutes;
    System.out.print("How many seconds?\n>");
    seconds = in.nextInt();
    hours = seconds / 3600;
    afterHours = seconds - (hours * 3600);
    minutes = afterHours / 60;
    afterMinutes = afterHours - (minutes * 60);
    outputSeconds = afterMinutes;
    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", seconds, hours, minutes, outputSeconds);
  }
}
