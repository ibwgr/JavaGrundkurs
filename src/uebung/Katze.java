package uebung;

public class Katze {
    private static String farbe;
    private static String name;
    private int groesse;
    private int gewicht;

    public Katze(String farbe, String name, int groesse, int gewicht){
        this.farbe = farbe;
        this.name = name;
        this.groesse = groesse;
        this.gewicht = gewicht;
    }

    public static String getFarbe() {
        return farbe;
    }

    public static void setFarbe(String farbe) {
        Katze.farbe = farbe;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Katze.name = name;
    }

    public int getGroesse() {
        return groesse;
    }

    public Katze setGroesse(int groesse) {
        this.groesse = groesse;
        return this;
    }

    public int getGewicht() {
        return gewicht;
    }

    public Katze setGewicht(int gewicht) {
        this.gewicht = gewicht;
        return this;
    }
}
