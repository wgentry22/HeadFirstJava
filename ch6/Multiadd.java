public class Multiadd{
  public static double multadd(double a, double b, double c){
    return (a * b) + c;
  }


  public static double expSum(double x){
    return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
  }



  public static void main(String[] args){
    System.out.println(expSum(2.0));
  }
}
