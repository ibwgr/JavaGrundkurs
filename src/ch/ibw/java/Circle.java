package ch.ibw.java;

public class Circle {
  double radius;

  public static Circle create(double radius) {
    Circle circle = new Circle();
    circle.radius = radius;
    return circle;
  }

  public double area() {
    // PI * radius^2
    return Math.PI * radius * radius;
  }

  public double circumference() {
    // PI * radius * 2
    return Math.PI * radius * 2;
  }

  @Override
  public String toString() {
    return "Circle{" +
            "radius=" + radius +
            '}';
  }
}
