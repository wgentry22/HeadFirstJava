public class sieve{

  public static int[] arrayUpTo(int n){
    int[] array = new int[n];
    for (int i = 0; i < n; i++){
      array[i] = i;
    }
    return array;
  }

  public static void printArray(boolean[] array){
    System.out.print("[" + array[0]);
    for (int i = 1; i < array.length; i++){
      System.out.print(", " + array[i]);
    }
    System.out.println("]");
  }

  public static boolean isPrime(int n){
    for (int i = 2; i < n; i++){
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }

  public static boolean[] Sieve(int n){
    int[] array = arrayUpTo(n);
    boolean[] primes = new boolean[n];
    for (int i = 0; i < array.length; i++){
      primes[i] = isPrime(array[i]);
    }
    return primes;
  }


  public static void main(String[] args){
    printArray(Sieve(25));
  }
}
