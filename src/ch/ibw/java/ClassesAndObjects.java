package ch.ibw.java;

public class ClassesAndObjects {

  public static void main(String[] args) {
    Person p1 = new Person();
    // Mit dem Punkt-Operator "." kann man auf Elemente innerhalb eines anderen Objekts bzw. einer Klasse zugreifen.
    p1.alter = 18;
    p1.vorname = "Jean";
    p1.nachname = "Claude";

    System.out.println(p1);
















    // --------------------------------------------


    Person p2; // der Wert von p2 ist jetzt null
    // Äquivalent zur obigen Zeile wäre also:
    // Person p2 = null;
    // null ist in Java eine Konstante und steht für "nichts".
    p2 = new Person();
    p2.alter = 42;
    p2.vorname = "Martin";
    p2.nachname = "Jörg";

    System.out.println(p2);

    // Lasse p2 auf p1 zeigen. Das Objekt hinter p2 (Martin Jörg) geht damit unwiderruflich verloren.
    p2 = p1;
    System.out.println(p2);


    // ---------------------------------------------


    Person[] persons = new Person[2];
    persons[0] = p2;
    persons[1] = p2;
    System.out.println(persons);
    System.out.println(persons.length);
  }
}
