package uebung;

public class WorteRatenProgramm {
  static String[] worte = new String[]{
          "Fussball",
          "Velo",
          "Auto",
          "Schule",
          "Verkehrszeichen",
          "Lokomotivführerstand",
          "Fluxkompensator",
  };

  public static void main(String[] args) {
    int anzahlWorte = worte.length;
    int zufallsIndex = (int) (Math.random() * anzahlWorte);
    String zufallsWort = worte[zufallsIndex];
//    System.out.println(zufallsWort); // Das zu erratende Wort, zu Entwicklungszwecken ausgeben

    String loesung = "";
    while (loesung.length() < zufallsWort.length()) {
      loesung += "_";
    }
    System.out.println(loesung);

    boolean ende = false;
    int anzahlRateVersuche = 0;

    while (!ende) {
      String geraten = IOTools.readString(" Buchstabe? ");

      if (geraten.equals(zufallsWort)) {
        ende = true;
      } else {
        anzahlRateVersuche++;

        // Schreibe "geraten" am richtigen Ort in die "loesung". Aus _ wird also z.B. a
        for (int i = 0; i < zufallsWort.length(); i++) {
          if (geraten.equals(String.valueOf(zufallsWort.charAt(i)))) {
            // Ersetze Zeichen auf Index i im String loesung
            loesung = loesung.substring(0, i) + geraten + loesung.substring(i + 1);
          }
        }
        System.out.println(loesung);

        ende = loesung.equals(zufallsWort) || anzahlRateVersuche >= 10;
      }
    }
  }
}
