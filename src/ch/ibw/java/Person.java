package ch.ibw.java;

/*
 * Bauplan um eine Person mit drei Attributen (auch Instanzvariablen genannt) zu erstellen.
 * Man sagt auch: ein Objekt vom Typ Person erstellen.
 *
 * Person p = new Person();
 *
 * Die Person hat noch keine Attribute gesetzt.
 * Attribute setzen und Ausgeben:
 *
 * p.alter = 18;
 * System.out.println(p1.alter);
 * */
public class Person {
  private String name;
  private String prename;
  private int age;

  public String vorname = ""; // Wert ist immer "", sofern nicht anders von Aussen gesetzt.
  public String nachname;     // Äquivalent zu: String nachname = null;
  public int alter = 0;       // "= 0" ist überflüssig, da es für primitive Datentypen immer einen Default-Wert gibt.

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPrename() {
    return prename;
  }

  public void setPrename(String prename) {
    this.prename = prename;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  // Ohne toString Methode wird einfach nur die Speicheraddresse ausgegeben, wie bei einem Array.
  @Override
  public String toString() {
    return "Person{" +
            "vorname='" + getPrename() + '\'' +
            ", nachname='" + getName() + '\'' +
            ", alter=" + getAge() +
            '}';
  }
}
