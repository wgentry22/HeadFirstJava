public class power{

  public static double power(double x, int n){
    int i = 1;
    double result = x;
    while(i < n){
      result *= x;
      i++;
    }
    return result;
  }

  public static void main(String[] args){
    System.out.println(power(5.0, 2));
  }

}
