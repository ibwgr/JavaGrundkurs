package ch.ibw.java;
import java.util.Scanner;

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
    Scanner sc = new Scanner(System.in);
    int anzahl;
    System.out.println("Wieviele Personen möchtest du bauen?");
    anzahl=sc.nextInt();
    Person[] p = new Person[anzahl];

    for(int i=0;i< p.length;i++){
      System.out.println("Gibt die Daten für Person " + (i+1) + " ein!");
      Person ppl = new Person();
      System.out.print("Name: ");
      ppl.setName(sc.next());
      System.out.print("Vorname: ");
      ppl.setPrename(sc.next());
      System.out.print("Alter: ");
      ppl.setAge(sc.nextInt());
      p[i]=ppl;
    }
    System.out.println("Anzahl Datensätze im Array " + p.length);
    for (Person ppl:p) System.out.println(ppl.toString());
  }
}
