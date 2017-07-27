import java.lang.Integer;


public class Rational{
private int numerator;
private int denominator;


  public Rational(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }



  public Rational() {
    this.numerator = 0;
    this.denominator = 1;
  }


  public void negate() {
    this.numerator *= -1;
    this.denominator *= -1;
  }

  public void invert() {
    int dummy1 = this.numerator;
    int dummy2 = this.denominator;
    this.numerator = dummy2;
    this.denominator = dummy1;

  }

  public static double toDouble(Rational r) {
    return (double)(r.numerator) / (double)(r.denominator);
  }

  public void printRational() {
    System.out.printf("%d / %d\n", this.numerator, this.denominator);
  }

  public String toString() {
    return String.format("%d / %d", this.numerator, this.denominator);
  }

  public static void main(String[] args) {
    Rational r = new Rational(1, 1);
    Rational t = new Rational(-1, 1);
    Rational f = new Rational(-1, -1);
    Rational g = new Rational(1, -1);

    //t.invert();
    //r.printRational();
    //t.printRational();

    //f.printRational();
    //g.printRational();

  }

}
