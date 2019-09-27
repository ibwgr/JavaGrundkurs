package ch.ibw.java;

public class PersonBeispiel {
    // class specific
    public static PersonBeispiel createPerson(String vorname, String nachname, int alter){
        PersonBeispiel neuePerson = new PersonBeispiel();
        neuePerson.alter = alter;
        neuePerson.vorname = vorname;
        neuePerson.nachname = nachname;

        return neuePerson;
    }//createPerson




    String vorname;
    String nachname;
    int alter;

    public String toString(){
        return "Die Person heisst:" + vorname + " " + nachname + " und ist " + alter + " Jahre alt.";
    }

}
