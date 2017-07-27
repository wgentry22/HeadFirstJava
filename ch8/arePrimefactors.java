public class arePrimefactors{

  public static boolean isPrime(int n){
    for (int i = 2; i < n; i++){
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }

  public static int productOfArrayElements(int[] array){
    int total = 1;
    for (int i = 0; i < array.length; i++){
      total *= array[i];
    }
    return total;
  }

  public static boolean primeFactors(int n, int[] array){
    if (n == productOfArrayElements(array)){
      for (int i = 0; i < array.length; i++){
        if (isPrime(array[i])){
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args){
    int[] array = {2, 3, 5};
    System.out.println(primeFactors(31, array));
  }

}
