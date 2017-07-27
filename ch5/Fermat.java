public class Fermat{

  public static void checkFermat(double a, double b, double c, double n){
    double x = Math.pow(a, n);
    double y = Math.pow(b, n);
    double z = Math.pow(c, n);

    if (x + y == z && n > 2){
      System.out.println("Holy shit, Fermat was wrong!");
    } else {
      System.out.println("Nope, that didnt work.");
    }
  }

  public static void main(String[] args){
    checkFermat(3, 4, 5, 2);
  }
}
