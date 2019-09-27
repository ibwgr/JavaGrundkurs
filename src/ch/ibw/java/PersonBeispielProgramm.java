package ch.ibw.java;

public class PersonBeispielProgramm {

  public static void main(String[] args) {
    Person einfach = createPerson("Hans", "Muster", 18);
    Person einfach1 = createPerson("Martin", "Muster", 8);
    Person einfach2 = createPerson("Fritz", "Muster", 6);

    Person alterLos = createPerson("Annette", "Schmid");
  }

  public static Person createPerson(String vorname, String nachname, int alter){
    Person neuePerson = new Person();
    neuePerson.alter = alter;
    neuePerson.nachname = nachname;
    neuePerson.vorname = vorname;
    return neuePerson;
  }

  public static Person createPerson(String vorname, String nachname) {
    return createPerson(vorname, nachname, 0);
  }
}
