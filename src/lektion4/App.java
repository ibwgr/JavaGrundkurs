package lektion4;

import java.util.Scanner;

public class App {
    public static String[] words = {"Auto", "Velo", "Motorfahrrad", "Vater", "Mutter", "Sohn", "Verkehrszeichen","Wasserzeichen","Yathzee", "Schule"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = 10;
        int wordCount = words.length;
        int random = (int)(Math.random()*wordCount);
        String rndWord = words[random];
        String wordOut = "";
        System.out.println(rndWord);

        char[] quiz = new char[rndWord.length()];
        for (int i = 0; i < rndWord.length(); i++){
            wordOut += "-";
            quiz[i] = rndWord.charAt(i);
        }
        System.out.println(wordOut);

        /*
        Aufgabe
        Beginne mit 10 Punkten und nach jedem ungültigen Vesuch ziehe ein Punkt ab
        Spiel geht bis 0 Punkte oder Wort erraten wurde?
        Am Ende gib die Punktezahl aus
         */
        do {
            points = points-1;
            System.out.print("\nBuchstabe? ");
            char input = sc.next().charAt(0);
            for (int i = 0;i<rndWord.length();i++){
                if (input == rndWord.charAt(i)){
                    wordOut = wordOut.substring(0, i) + input + wordOut.substring(i+1);
                    points += 1;
                }
            }
            System.out.println(wordOut);
            System.out.println(points);
        }while (!wordOut.equals(rndWord));
    }
}
