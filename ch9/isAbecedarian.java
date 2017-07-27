public class isAbecedarian{


  public static boolean isAbecedarian(String s){
    boolean conditionMet = false;
    char[] letters = s.toCharArray();
    for (int i = 0; i < letters.length - 1; i++){
      if (letters[i] < letters[i+1]){
        conditionMet = true;
      } else {
        conditionMet = false;
      }
    }
    return conditionMet;
  }



  public static void main(String[] args){
    String[] test = {"abdest", "acknow", "acorsy", "nahhh", "befist"};
    for (int i = 0; i < test.length; i++){
      System.out.println(isAbecedarian(test[i]));
    }
  }
}
