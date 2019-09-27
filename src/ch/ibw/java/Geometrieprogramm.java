package ch.ibw.java;

public class Geometrieprogramm {

    public static void main(String[] args) {
        Circle circle = createCircle(5);
        Circle circle1 = createCircle(6);
        Circle circle2 = createCircle(7);

        circle.area();
        double area = circle.area();
        circle.circumference();
        double circumf = circle.circumference();
//        System.out.println("Die Fläche ist: " + area);
        System.out.println("Der Umfang ist: " + circumf);
//
//        System.out.println("Der Kreis ist rund: " + circle);
//
        Geometrieprogramm.createCircle(6);

    }

    private static Circle createCircle(double radius) {
        Circle circle = new Circle();
        circle.radius = radius;
        return circle;

    }


}
