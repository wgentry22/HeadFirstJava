public class oddSum{

  public static boolean isPosAndOdd(int n){
    if (n > 0 && n % 2 == 1){
        return true;
    } else {
        return false;
    }
  }


  public static int sum(int n){
    if (n >= 0){
      if (isPosAndOdd(n)){
        return int result;
      }
      int recurse = sum(n - 2);
      int result = n += recurse;
      return result;
    }
    return 0;
  }


  public static void main(String[] args){
    System.out.println(sum(7));
  }
}
