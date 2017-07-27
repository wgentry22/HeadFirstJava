public class params1{


  public static void zool(int number, String pet, String street){
    System.out.printf("Number: %d\nPet: %s\nStreet: %s\n", number, pet, street);
  }

  public static void main(String[] args){
    //int number = 360;
    //String pet = "Stella";
    //String street = "Glenridge";
    //zool(11, pet, street);
    printAmerican("Sunday", 18, "June", 2017);
    printEuropean("Sunday", 18, "June", 2017);
  }



    public static void printAmerican(String day, int date, String month, int year){
    System.out.printf("American Format: %s, %s %d, %d.\n", day, month, date, year);
  }

    public static void printEuropean(String day, int date, String month, int year){
      System.out.printf("European Format: %s %d %s %d\n", day, date, month, year);
    }
}
