package ch.ibw.java;

public class GeometrieProgramm {

    public static void main(String[] args) {
        Circle c1 = new Circle(IOTools.readDouble("Radius: "));
        System.out.println(c1);
        c1.circumference();
        c1.area();
        c1.diameter();

    }
}
