public class areFactors{

  public static boolean areFactors(int n, int[] array){
    boolean factor = true;
    for (int i = 0; i < array.length; i++){
      if (array[i] % n != 0){
        factor = false;
        break;
      }
    }
    return factor;
  }

  public static void main(String[] args){
    int[] test = {2, 4, 6, 8};
    int testFactor = 2;

    System.out.println(areFactors(testFactor, test));
  }

}
