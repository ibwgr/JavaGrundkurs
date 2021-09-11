package ch.ibw.java;

public class PersonFactoryUebung {

  public static void main(String[] args) {
    /*
     * Erstelle eine Personenfabrik.
     *
     * 1. Frage den User zuerst wie viele Personen er erstellen möchte.
     * 2. Für jede zu erstellende Person fragst du dann die Attributwerte ab.
     *    Das Eingabeformat der Attributwerte ist ein String in der Form: <vorname>:<nachname>:<alter>
     * 3. Gib am Ende alle erstellten Personen auf der Konsole aus, so, dass man alle Instanzvariabelwerte in der Ausgabe sehen kann.
     *
     * Hinweis: String.split, IOTools
     * */

    int anzahl = IOTools.readInt("Anzahl Personen?");
    Person[] personen = new Person[anzahl];

    for (int personNummer = 0; personNummer < anzahl; personNummer++) {
      String eingabe = IOTools.readString("Vorname:Nachname:Alter bitte eingeben!");

      String[] eingaben = eingabe.split(":");

      Person p = new Person();
      p.vorname = eingaben[0];
      p.nachname = eingaben[1];
      p.alter = Integer.parseInt(eingaben[2]);

      personen[personNummer] = p;
    }

    for (Person p : personen){
      System.out.println(p.vorname);
    }
  }
}
