package ch.ibw.java;

public class Circle {
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
