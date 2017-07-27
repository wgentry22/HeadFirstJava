public class ack{

  public static boolean nonNegative(int n){
    if (n >= 0){
      return true;
    } else {
      return false;
    }
  }

  public static int Ackerman(int n, int m){
    if (nonNegative(n) && nonNegative(m)){
      if (m == 0){
        return n + 1;

      } else if (m > 0 && n == 0){
        return Ackerman(m-1, 1);

      } else if (m > 0 && n > 0){
        return Ackerman(m-1, Ackerman(m, n-1));
      }
    }
    return 0;
  }



  public static void main(String[] args){
    System.out.println(Ackerman(3, 0));
    System.out.println(Ackerman(1, 1));
  }
}
