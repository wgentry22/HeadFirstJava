public class isDivisible{

  public static boolean isDivisible(int n, int m){
      if (n % m == 0){
        return true;
      } else {
        return false;
      }
  }

  public static void main(String[] args){
    if (isDivisible(4, 2)){
      System.out.println("the code works.");
    } 
  }
}
