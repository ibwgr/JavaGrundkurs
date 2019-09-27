package ch.ibw.java;

public class PersonBeispielProgramm {
    public static void main(String[] args) {

        // Beispiel 1 mit Person 1 - erstellen einer Person und einfache Ausgabe des Vornamens
        PersonBeispiel p1 = new PersonBeispiel();
        p1.alter = 17;
        p1.vorname = "Peter";
        p1.nachname = "Meier";
        System.out.println(p1.vorname);

        // Beispiel 2 mit Person 2 - erstellen einer Person und einfache Ausgabe des Vorname, Name und Alter
        PersonBeispiel p2 = new PersonBeispiel();
        p2.alter = 51;
        p2.vorname = "Urs";
        p2.nachname = "Muster";
        System.out.println(p2.vorname + " " + p2.nachname + " " + p2.alter );

        // Beispiel 3 mit Person 3 - erstellen einer Person und Ausgabe über eine Methode
        PersonBeispiel p3 = new PersonBeispiel();
        p3.alter = 20;
        p3.vorname = "Petrus";
        p3.nachname = "Meier";

        String ausgabePerson = p3.toString();
        System.out.println(ausgabePerson);


        PersonBeispiel einfach = PersonBeispiel.createPerson("martin","Gusti",101)  ;
        PersonBeispiel einfach1 = PersonBeispiel.createPerson("Hans","Ueli",16)  ;
        PersonBeispiel einfach2 = PersonBeispiel.createPerson("Jonas","Müller",57)  ;

        PersonBeispiel alterlos = createPerson("Annette", "Witzig");


        System.out.println(einfach2);
        System.out.println(alterlos);


    }



    private static PersonBeispiel createPerson(String vorname, String nachname) {


        return PersonBeispiel.createPerson(vorname, nachname,0);
    }



}
