package lektion4;

import java.util.Scanner;

public class WordQuiz {
    public static String[] words = {"Auto", "Velo", "Motorfahrrad", "Vater", "Mutter", "Sohn", "Verkehrszeichen","Wasserzeichen","Yathzee", "Schule"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = 10;
        int wordCount = words.length;
        int random = (int)(Math.random()*wordCount);
        String rndWord = words[random];
        String wordSpacer = "";
        //System.out.println(rndWord);

        for (int i = 0; i < rndWord.length(); i++){
            wordSpacer += "-";
        }
        System.out.println(wordSpacer);


        /*
        Aufgabe
        Beginne mit 10 Punkten und nach jedem ungültigen Vesuch ziehe ein Punkt ab
        Spiel geht bis 0 Punkte oder Wort erraten wurde?
        Am Ende gib die Punktezahl aus
         */

        do {
            points -= 1;
            System.out.print("\nBuchstabe? ");
            char input = sc.next().charAt(0);
            for (int i = 0;i<rndWord.length();i++){
                if (input == rndWord.charAt(i)){
                    wordSpacer = wordSpacer.substring(0, i) + input + wordSpacer.substring(i+1);
                    points += 1;
                }
            }
            System.out.println(wordSpacer);
            System.out.println("Anzahl Credits: " + points);
        }while (!wordSpacer.equals(rndWord) && points > 0);
        if (wordSpacer.equals(rndWord)){
            System.out.println("***************"+
                    "\nHerzlichen Glückwunsch, Wort " + wordSpacer + " erraten!"+
                    "\nSie haben " + points + " Credits übrig!");
        }
        if (points <=0){
            System.out.println("Sie haben keine Credits mehr!");
        }
    }
}
