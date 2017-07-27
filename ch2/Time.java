public class Time{
  public static void main(String[] args) {
    int hour, minute, second, sinceMidnight, secondsInDay, secondsLeftInDay;
    double totalSeconds, sinceMidnightDouble, percentageOfDayPassed;
    hour = 10;
    minute = 7;
    second = 26;
    sinceMidnight = (hour * 60 * 60) + (minute * 60) + second;
    //System.out.println("It has been "+ sinceMidnight + " seconds since midnight.");
    secondsInDay = 24 * 60 * 60;
    secondsLeftInDay = secondsInDay - sinceMidnight;
    //System.out.println("There are still " + secondsLeftInDay + " seconds left in the day.");
    sinceMidnightDouble = sinceMidnight;
    totalSeconds = secondsInDay;
    percentageOfDayPassed = sinceMidnightDouble / totalSeconds;
    System.out.println(percentageOfDayPassed + "% of the day has passed.");
  }
}
