public class indexOfMax{

  public static int indexOfMax(int[] a){
    int max = a[0];
    int maxIndex = 0;
    for (int i = 0; i < a.length; i++){
      if (a[i] > max){
        max = a[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  public static void displayMax(int index){
    System.out.println("The max value of the array is located at " + index);
  }

  public static void main(String[] args){
    int[] test = {1, 5, 18, 3, 5};
    displayMax(indexOfMax(test));
  }
}
