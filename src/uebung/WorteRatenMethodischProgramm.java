package uebung;

public class WorteRatenMethodischProgramm {
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

    String loesung = generateString(zufallsWort.length(), '_');
    System.out.println(loesung);

    boolean ende = false;
    int anzahlRateVersuche = 0;

    while (!ende) {
      String geraten = IOTools.readString(" Buchstabe? ");

      final boolean komplettesWortErraten = geraten.equals(zufallsWort);
      if (komplettesWortErraten) {
        ende = true;
      } else {
        anzahlRateVersuche++;

        // Schreibe "geraten" am richtigen Ort in die "loesung".
        // Aus _ wird also z.B. ein a, fall in Zufallswort irgendwo ein a vorkommt
        loesung = replaceMatches(zufallsWort, loesung, geraten.charAt(0));
        System.out.println(loesung);

        boolean wortGefunden = loesung.equals(zufallsWort);
        boolean zuvieleVersuche = anzahlRateVersuche >= 10;
        ende = wortGefunden || zuvieleVersuche;
      }
    }
  }

  private static String replaceMatches(String word, String wordMask, char guess) {
    for (int i = 0; i < word.length(); i++) {
      if (guess == word.charAt(i)) {
        wordMask = replaceCharAt(wordMask, guess, i);
      }
    }
    return wordMask;
  }

  private static String generateString(int length, char symbol) {
    String result = "";
    while (result.length() < length) {
      result += symbol;
    }
    return result;
  }

  private static String replaceCharAt(String subject, char newChar, int replaceIndex) {
    subject = subject.substring(0, replaceIndex) + newChar + subject.substring(replaceIndex + 1);
    return subject;
  }
}
