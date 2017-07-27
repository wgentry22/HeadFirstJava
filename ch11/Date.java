public class Date{
  private int year, month, day;

  public Date() {
    this.year = 1970;
    this.month = 1;
    this.day = 1;
  }

  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public static void main(String[] args){
    Date birthday = new Date(1993, 1, 14);
    System.out.printf("%02d/%02d/%d\n", birthday.month, birthday.day, birthday.year);
  }
}
