package ch.ibw.java;

/*
* Klasse Person mit privaten Attributen,
* die nur zum Erstellungszeitpunkt des Objekts einmalig gesetzt werden können.
* */
class PersonAdvanced {
  // private bedeutet, dass man von Aussen keinen Zugriff hat auf das Attribut.
  // private ist ein Access Modifier (Zugriffsparameter).
  private String vorname;
  private String nachname;
  private int alter;

  PersonAdvanced(String vorname, String nachname, int alter) {
    // "this.vorname" braucht das "this.", weil sonst nicht klar ist,
    // ob der Parameter oder das Attribut gemeint ist.
    this.vorname = vorname;
    this.nachname = nachname;
    this.alter = alter;
  }

  int getAlter() {
    return alter;
  }

  @Override
  public String toString() {
    return "Person{" +
            "vorname='" + vorname + '\'' +
            ", nachname='" + nachname + '\'' +
            ", alter=" + alter +
            '}';
  }
}

public class ClassesObjectsConstructor {

  public static void main(String[] args) {
    createPerson();
  }

  private static void createPerson() {
    PersonAdvanced p1 = new PersonAdvanced("Hans", "Meier", 23);
    // Attribute "alter" kann hier, ausserhalb der Klasse selbst, nicht gesetzt oder gelesen werden werden.
    // p1.alter = 18;
    // System.out.println(p1.alter);

    // Über die getter-Methode getAlter kann der Wert jedoch ausgelesen werden
    System.out.println(p1.getAlter());
    System.out.println(p1);
  }
}
