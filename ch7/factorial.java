public class factorial{

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

  public static void main(String[] args){
    
  }
}
