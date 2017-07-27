import java.math.BigInteger;

public class Big{


  public static BigInteger factorial(int n){
    BigInteger big = BigInteger.valueOf(1);

    if (n == 0){
      return big;
    } else {
      for (int i = 0; n > 0; n--){
        big = big.multiply(BigInteger.valueOf(n));
      }
    }
    return big;
  }

  public static void main(String[] args){
    for (int i = 0; i <= 50; i++){
      System.out.println(i + ":   " + factorial(i));
    }
  }


}
