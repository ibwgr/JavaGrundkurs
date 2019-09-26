package ch.ibw.java.sol;

import ch.ibw.java.IOTools;
import ch.ibw.java.Person;

public class UbPersonCreatorSol {

  public static void main(String[] args) {
    int count = IOTools.readInteger("Anzahl Personen: ");

    if (count > 0) {
      Person[] persons = new Person[count];
      int personIndex = 0;

      do {
        String eingabe = IOTools.readString("Personendaten: ");
        String[] werte = eingabe.split(":");
        Person person = new Person();
        person.vorname = werte[0];
        person.nachname = werte[1];
        person.alter = Integer.parseInt(werte[2]);
        persons[personIndex] = person;
      }
      while (++personIndex < count);

      for (Person p : persons) {
        System.out.println(p);
      }
    }
  }
}
