public class Tile{
  private char letter;
  private int value;

  public Tile(){
    this.letter = 'a';
    this.value = 0;
  }

  public int getValue(){
    return this.value;
  }

  public char getLetter() {
    return this.letter;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public void setLetter(char letter) {
    this.letter = letter;
  }

  public Tile(char letter, int value){
    this.letter = letter;
    this.value = value;
  }

  public void printTile(Tile t){
    System.out.println("Letter: " + t.letter + '\t' + "Value: " + t.value);
  }

  public static Tile testFile() {
    Tile test = new Tile('Z', 10);
    return test;
  }

  public String toString(){
    return String.format("Letter: %s \t Value: %d\n", this.letter, this.value);
  }




  public static void main(String[] args){
    //testFile().printTile(testFile());

  }

}
