package ch.ibw.java;

public class PersonBeispielProgramm {

    public static void main(String[] args) {
        Person einfach = createPerson("Hans", "Muster", 18);
//        einfach.vorname = "Hans";
//        einfach.nachname = "Muster";
//        einfach.alter = 18;

        Person einfach1 = createPerson("Martin", "Muster", 8);
//        einfach.vorname = "Martin";
//        einfach.nachname = "Muster";
//        einfach.alter = 8;

        Person einfach2 = createPerson("Fritz", "Muster", 6);
//        einfach.vorname = "Fritz";
//        einfach.nachname = "Muster";
//        einfach.alter = 6;

        Person alterLos = createPerson("Annette", "Schmid");
    }



    public static Person createPerson(String vorname, String nachname) {
        return createPerson(vorname, nachname, 0)
//        Person neuePerson = new Person();
//        neuePerson.vorname = vorname;
//        neuePerson.nachname = nachname;
//        return neuePerson;
    }

    public static Person createPerson(String vorname, String nachname, int alter){
        Person neuePerson = new Person();
        neuePerson.alter = alter;
        neuePerson.vorname = vorname;
        neuePerson.nachname = nachname;
        return neuePerson;
    }
}
