import java.math.BigInteger;

public class encryption{



  public static BigInteger encrypt(int x, int n){
    if (n == 0) {
      return BigInteger.ONE;
    }

    BigInteger t = power(x, n / 2);
    BigInteger newX = BigInteger.valueOf(x);
    if (n % 2 == 0){
      return t.multiply(t);
    } else {
      t = t.multiply(t).multiply(newX);
      return t;
    }
  }



  public static BigInteger power(int x, int n){
    BigInteger value = BigInteger.valueOf(x);
    if (n == 0){
      value = BigInteger.ONE;
    }
    for (int i = 1; n > i; n--){
      value = value.multiply(BigInteger.valueOf(x));
    }
    return value;
  }



  public static void main(String[] args){
    System.out.println(encrypt(6, 5));
  }

}
