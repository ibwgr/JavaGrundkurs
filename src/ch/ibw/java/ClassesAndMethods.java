package ch.ibw.java;

public class ClassesAndMethods {

  public static void main(String[] args) {
    // Rufe die Methode createPerson auf, und weise den Rückgabewert der Variable p1 zu.
    Person p1 = createPerson();
    System.out.println(p1);

    Person p2 = createPersonWithName("Julian");
    Person p3 = createPersonWithName("Julian", "Genovese");

    System.out.println(p1);
    referenzParameter(p1);
    System.out.println(p1);
  }

  static void referenzParameter(Person p) {
    System.out.println(p);
    p = null; // Hat keinen Effekt auf die Referenz p1, welche vom Aufrufer verwendet wird!
  }

  // static = Methode einer Klasse (nicht Objekt!)
  // Person = Type des Rückgabewertes
  // createPerson = Name der Methode
  // () = Liste der Parameter, in diesem Falle keine
  static Person createPerson() {
    Person p1 = new Person();
    p1.alter = 18;
    p1.vorname = "Jean";
    p1.nachname = "Claude";

    // Rückgabewert ist der Wert hinter p1
    return p1;
  }

  static Person createPersonWithName(String vorname) {
    Person p1 = new Person();
    p1.alter = 18;
    p1.vorname = vorname;
    p1.nachname = "Claude";
    return p1;
  }

  // überlade die Methode createPersonWithName
  // überladen heisst: gleicher Name, andere Parameter
  static Person createPersonWithName(String vorname, String nachname) {
    Person p1 = new Person();
    p1.alter = 18;
    p1.vorname = vorname;
    p1.nachname = "Claude";
    return p1;
  }
}
