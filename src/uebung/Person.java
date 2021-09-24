package uebung;

public class Person {
    public final String name, vorname;
    public final int alter;
    public final Person vater;
    public final Person mutter;


    Person(String name, String vorname, int alter, Person vater, Person mutter){
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.vater = vater;
        this.mutter = mutter;
    }

    Person(int alter){
        this.alter = alter;
        this.name = "";
        this.vorname ="";
        this.vater = null;
        this.mutter = null;
    }
    Person (String name, String vorname, int alter){
        this.alter = alter;
        this.name = name;
        this.vorname = vorname;
        this.vater = null;
        this.mutter = null;
    }

}
