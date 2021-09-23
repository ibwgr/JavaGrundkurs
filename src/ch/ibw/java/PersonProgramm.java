package ch.ibw.java;

public class PersonProgramm {
  public static void main(String[] args) {
    Person p1 = createPerson("Hans", "Ruedi", 17);
    Person p2 = createPerson("Peter", "Griffindor", 32);
    Person p3 = createPerson("Jon", "Don", 48);
    System.out.println(p1);

    Person alterLos = createPerson("Gina", "Truller");
  }

  // überladene Methode
  private static Person createPerson(String vorname, String nachname) {
    Person neuePerson = new Person();
    neuePerson.vorname = vorname;
    neuePerson.nachname = nachname;
    return neuePerson;
  }

  // überladene Methode
  private static Person createPerson(String vorname, String nachname, int alter) {
    Person neuePerson = new Person();
    neuePerson.alter = alter;
    neuePerson.vorname = vorname;
    neuePerson.nachname = nachname;
    return neuePerson;
  }
}
