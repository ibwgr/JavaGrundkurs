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
    int wortCount = worte.length;
    int zufallsIndex = (int) (Math.random() * wortCount); // 0.14 => 1.4, 0.68 => 6.8, 0.998 => 9.98
    String zufallsWort = worte[zufallsIndex];
//    System.out.println(zufallsWort);

    String loesung = "";
    for (int i = 0; i < zufallsWort.length(); i++) {
      loesung += "_";
    }
    System.out.println(loesung);

    boolean ende = false;
    int geratenTotal = 0;

    while (!ende) {
      String geraten = IOTools.readString("Buchstabe?");

      if (geraten.equals(zufallsWort)) {
        ende = true;
      } else {
        geratenTotal++;

        // ___a___a__
        for (int i = 0; i < zufallsWort.length(); i++) {
          if (geraten.equals(String.valueOf(zufallsWort.charAt(i)))) {
            // Ersetze Zeichen auf Index i im String loesung
            loesung = loesung.substring(0, i) + geraten + loesung.substring(i + 1);
          }
        }
        System.out.println(loesung);

        ende = loesung.equals(zufallsWort) || geratenTotal >= 10;
      }
    }
  }
}
