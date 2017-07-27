import java.util.Arrays;

public class isDoubloon{

  public static boolean isEven(String s){
    boolean isEven;
    if (s.length() % 2 == 0){
      isEven = true;
    } else {
      isEven = false;
    }
    return isEven;
  }





  public static int[] histogram(String s){
    int[] counts;
    char[] letters = s.toCharArray();
    if (isEven(s)){
      counts = new int[s.length() / 2];
      for (int i = 0; i < letters.length; i++){
        char letter = letters[i];
        int index = s.indexOf(letter);
        counts[index]++;
      }
    } else {
      counts = new int[(s.length() / 2) - 1];
      for (int i = 0; i < letters.length; i++){
        char letter = letters[i];
        int index = s.indexOf(letter);
        counts[index]++;
      }
    }
    return counts;
  }



  public static boolean isDoubloon(String s){
    boolean conditionMet = false;
    if (isEven(s)){
      int[] hist = histogram(s);
      for (int i = 0; i < hist.length; i++){
        if (hist[i] == 2){
          return conditionMet = true;
        }
      }
    }
    return conditionMet;
  }

  public static void main(String[] args){
    System.out.println(isDoubloon("william"));
  }
}
