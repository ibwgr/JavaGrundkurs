package ch.ibw.java;

class Rectangle {
  // private = nur innerhalb der Klasse sichtbar
  // final   = kann nur einmal gesetzt werden, spätestens im Konstruktor.
  private final int length;
  private final int height;

  // Konstruktor
  // Erlaubt zu definieren, wie ein Objekt erstellt wird.
  // Hier wird der Ersteller gezwungen, zwei Werte mitzugeben.
  Rectangle(int length, int height) {
    // this ist eine Variable die innerhalb eines Objektes immer auf sich selbst zeigt.
    this.length = length;
    this.height = height;
  }

  // kein static, d.h. es ist eine Instanzmethode,
  // kann also nur auf Objekten aufgerufen werden.
  // Rectangle.area() geht nicht.
  // new Rectangle(1, 2).area() geht.
  // int = Type des Rückgabewertes
  int area() {
    return length * height;
  }

//  nicht ok, weil static Methode keinen Zugriff hat auf die Instanzvariablen
//  static int area(){
//    return lenght * height;
//  }
}

public class ObjectsAndMethods {

  // static = Klassenmethode, kein Zugriff auf Instanzvariablen!
  // void   = Type des Rückgabewertes. void steht für "nichts".
  //          Es ist also nicht erlaubt, einen Werte zu retournieren.
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(10, 5);
    System.out.println(rect.area());

    // return 1;    // nicht erlaubt, weil 1 vom Typ int ist und nicht vom Typ void.
    // return;      // ok, z.B. für frühzeitiges verlassen der Methode innerhalb einer if
  }
}
