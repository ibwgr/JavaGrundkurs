package ch.ibw.java;

public class ArrayEqualsExtended_4_2 {

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {1,2};
        // Ist die folgende Zeile aktiv, wird trotzdem jedesmal die for-Schlaufe durchlaufen.
        // Das ist ja unnötig, da ja klar ist, dass die Inhalte von a und b identisch sind.
        // Verändere das Programm so, dass die for-Schlaufe nicht unnötig durchlaufen wird.
        // a = b;

        boolean haveSameContents = true;

        if (a.length != b.length)
            haveSameContents = false;

        if (haveSameContents) {
            System.out.println("Comparing contents …");
            for (int i=0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    haveSameContents = false;
                    break;
                }
            }
        }

        System.out.println("a and b are equal: " + haveSameContents);
    }
}
