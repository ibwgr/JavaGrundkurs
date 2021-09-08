package ch.ibw.java;

class Circle {
  double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void circumference() {
    System.out.println("Der Umfang vom Radius: " + this.radius + " ist " + Math.round(2 * this.radius * Math.PI));
  }

  public void area() {
    System.out.println("Die Flaeche vom Radius: " + this.radius + " ist " + Math.pow(this.radius, 2) * Math.PI);
  }

  @Override
  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            '}';
  }

  public void diameter() {
    System.out.println("Der Durchmesser vom Radius: " + this.radius + " ist " + this.radius * 2);
  }
}

public class GeometrieProgramm {

  public static void main(String[] args) {
    Circle circle = new Circle(4.5);
    circle.radius = 2;

    //   double area();
    //  double cirfumf = circle.circumference();

    //  System.out.println("Fläche ist" + area);
    //   System.out.println("Umfang ist " + cirfumf);

    System.out.println(circle);

    GeometrieProgramm.berechnungUmfang(circle);
  }

  public static void berechnungUmfang(Circle c) {
    System.out.println();
  }
}
