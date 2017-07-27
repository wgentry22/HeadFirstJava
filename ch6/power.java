public class power{

  public static double Power(double x, int n){
    if (n == 0){
      return 1;
    } else if (n == 1){
      return x;
    } else {
      if (n > 1){
        return x * Power(x, n-1);
      } else if (n < 0){
        return x * Power(x, n + 1);
      }
    return 0.0;
  }
}

  public static void main(String[] args){
    System.out.println(Power(2.0, 3));
    System.out.println(Power(4.2, 7));
    System.out.println(Power(15.0, -2));

  }
}
