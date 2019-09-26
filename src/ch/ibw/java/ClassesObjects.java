package ch.ibw.java;

/*
* Bauplan um eine Person mit drei Attributen (auch Instanzvariablen genannt) zu erstellen.
* Man sagt auch: ein Objekt vom Typ Person erstellen.
*
* Person p = new Person();
*
* Die Person hat noch keine Attribute gesetzt.
* Attribut setzen und Ausgeben:
*
* p.alter = 18;
* System.out.println(p1.alter);
* */
class Person {
  String vorname;
  String nachname;
  int alter;

  // Ohne toString Methode wird einfach nur die Speicheraddresse ausgegeben, wie bei einem Array.
  //  @Override
//  public String toString() {
//    return "Person{" +
//            "vorname='" + vorname + '\'' +
//            ", nachname='" + nachname + '\'' +
//            ", alter=" + alter +
//            '}';
//  }
}

public class ClassesObjects {

  public static void main(String[] args) {
    createPerson();
  }

  private static void createPerson() {
    Person p1 = new Person();
    p1.alter = 18;
    p1.vorname = "Jean";
    p1.nachname = "Claude";

    System.out.println(p1);

    // --------------------------------

    Person p2 = new Person();
    p2.alter = 42;
    p2.vorname = "Martin";
    p2.nachname = "Jörg";

    System.out.println(p2);
  }
}
