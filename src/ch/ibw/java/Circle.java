package ch.ibw.java;

public class Circle {

//  class specific
    public static Circle create(double radius) {
        // init
       Circle circle = new Circle();
    //  definition of the circle
        circle.radius = radius;

        return  circle;

    }



//    object specific
    Double radius;

    // method to calculate the diameter using the radius
    public Double calcDiameter(){
        Double diameter = ( 2 * radius);
        return diameter;
    }

    // method to calculate the surface using pi (3.1415.....) and radius
    public double calcSurface(){
        double surface = ( Math.pow(radius, 2) *  Math.PI);
        return surface;
    }

    public double calcCircumference() {

        return (Math.PI * radius * 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
