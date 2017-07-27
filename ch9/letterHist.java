import java.util.Arrays;

public class letterHist{


  public static char[] alphabet(){
    char[] alphabet = new char[26];
    char c = 'a';
    for (int i = 0; i < 26; i++){
      alphabet[i] = c;
      c++;
    }
    return alphabet;
  }

  public static int[] letterHist(String s){
    char[] alphabet = alphabet();
    int[] histogram = new int[26];
    char[] word = s.toCharArray();
    for (int i = 0; i < word.length - 1; i++){
      for (int j = 0; j < alphabet.length -1; j++){
        if (word[i] == alphabet[j] || Character.toUpperCase(word[i]) == Character.toUpperCase(alphabet[j])){
          histogram[j]++;
        }
      }
    }
    return histogram;
  }

  public static String formatted(String s){
    int[] hist = letterHist(s);
    char[] alphabet = alphabet();
    String formattedHist = "";
    System.out.println("The provided string '" + s + "' contains the following number of letters:");
    for (int i = 0; i < hist.length; i++){
      String count = Integer.toString(hist[i]);
      String letter = Character.toString(alphabet[i]);
      formattedHist += "\t"+letter + ": "+count+'\n';
    }
    return formattedHist;
  }

  public static void main(String[] args){
    System.out.print(formatted("Jessica I miss you so very much, but hey I made this badass program to count the number of letters in a string!"));
  }
}
