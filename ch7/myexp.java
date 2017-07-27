public class myexp{

  public static int fac(int n){
    int i = 0;
    int result = 1;
    if (n == 0){
      return 1;
    } else {
      while (i < n){
        result *= (n - i);
        i++;
      }
    }
    return result;
  }

  public static double power(double x, int n){
    int i = 1;
    double result = x;
    while(i < n){
      result *= x;
      i++;
    }
    return result;
  }


  public static double termInExpansion(double x, int n){
    double numerator = power(x, n);
    double denomonator = fac(n);
    double fraction = numerator / denomonator;
    return fraction;
  }

  public static double myExp(double x, int n){
    int i = 1;
    double result = 1;
    while (i < n){
      result += termInExpansion(x, i);
      i++;
    }
    return result;
  }


  public static void check(double x){
    System.out.println(x + "\t" + myExp(x, 5) + "\t" + Math.exp(x));
  }

  public static void main(String[] args){
    
  }

}
