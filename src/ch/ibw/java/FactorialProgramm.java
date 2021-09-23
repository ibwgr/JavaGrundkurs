package ch.ibw.java;

public class FactorialProgramm {

  public static void main(String[] args) {
    // Factorial = Fakultät, mathematischer Operator !
    // 5! = 5 * 4 * 3 * 2 * 1

    System.out.println(fact(5));
    System.out.println(factLoop(5));
  }

  // Jeder rekursive Algorithmus kann auch nicht rekursiv implementiert werden
  private static long factLoop(long n) {
    long f = 1;
    while (n > 1) {
      f = f * n--;
    }
    return f;
  }

  private static long fact(long n) {
    // Abbruchbedingung. Zwingend notwendig, sonst endlos rekursiv!
    if (n == 1) {
      return 1;
    }
    return n * fact(n - 1);
  }
}
