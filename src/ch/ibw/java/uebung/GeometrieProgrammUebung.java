package ch.ibw.java.uebung;

class Circle {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void circumference() {
    System.out.println("Umfang basierend auf Radius " + this.radius + " ist " + Math.round(2 * this.radius * Math.PI));
  }

  public void area() {
    System.out.println("Flaeche basierend auf Radius " + this.radius + " ist " + Math.pow(this.radius, 2) * Math.PI);
  }

  @Override
  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            '}';
  }

  public void diameter() {
    System.out.println("Durchmesser basierend auf Radius " + this.radius + " ist " + this.radius * 2);
  }
}

public class GeometrieProgrammUebung {

  public static void main(String[] args) {
    Circle circle = new Circle(4.5);
    circle.radius = 2;

    //  double area();
    //  double cirfumf = circle.circumference();

    //  System.out.println("Fläche ist" + area);
    //  System.out.println("Umfang ist " + cirfumf);

    System.out.println(circle);

    GeometrieProgrammUebung.berechnungUmfang(circle);
  }

  public static void berechnungUmfang(Circle c) {
    System.out.println();
  }
}
