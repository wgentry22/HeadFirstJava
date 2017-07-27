public class Bottles{
  public static void bottlesOfBeer(int n){
    if (n > 0){
      System.out.printf("%d bottles of beer on the wall,\n", n);
      System.out.printf("%d bottles of beer!\n", n);
      System.out.println("Take one down, pass it around,");
      n--;
      System.out.printf("%d bottles of beer on the wall.\n", n);
      System.out.println();
      bottlesOfBeer(n);
    } else if (n == 0){
      System.out.println("No bottles of beer on the wall,\nno Bottles of beer,");
      System.out.println("ya' take one down, ya' pass it around,\n'cause there are no more bottles of beer on the wall");
    }
  }

  public static void main(String[] args){
    int n = 99;
    bottlesOfBeer(n);
  }
}
