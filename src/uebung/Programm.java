package uebung;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anzahlPersonen = 0;
        System.out.println("Wieviele Kinder haben Vater und Mutter?");
        Person vater = new Person("Desax","Martin",77);
        Person mutter = new Person("Desax", "Antonia",79);
        anzahlPersonen = sc.nextInt();
        Person[] personen = new Person[anzahlPersonen];
        for (int i = 0; i < personen.length; i++){
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Vorname:");
            String vorname = sc.next();
            System.out.println("Alter:");
            int alter = sc.nextInt();
            Person p = new Person(name,vorname,alter, vater,mutter);
            personen[i] = p;
        }
        for (int i = 0; i<personen.length; i++) {
            System.out.println("******************"+
                    "\nName: " + personen[i].name + " " + personen[i].vorname +
                    "\nAlter: " + personen[i].alter +
                    "\nVater: " + personen[i].vater.vorname + " " + personen[i].vater.name + " " + personen[i].vater.alter +
                    "\nMutter: "+ personen[i].mutter.vorname + " " + personen[i].mutter.name + " " + personen[i].mutter.alter);
        }


        Person p1 = new Person("Desax", "Gion", 45, vater, mutter);

        System.out.println("******************\n"+p1.name + " " + p1.vorname + " " + p1.alter + " " + p1.vater.alter + " " + p1.mutter.alter);
    }
}
