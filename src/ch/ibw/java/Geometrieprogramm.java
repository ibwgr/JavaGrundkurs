package ch.ibw.java;

import com.sun.security.jgss.GSSUtil;

public class Geometrieprogramm {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2;

     //   double area();
      //  double cirfumf = circle.circumference();

      //  System.out.println("Fläche ist" + area);
     //   System.out.println("Umfang ist " + cirfumf);

        System.out.println(circle);

        Geometrieprogramm.berechnungUmfang(circle);
    }

    public static void berechnungUmfang(Circle c){
        System.out.println();

    }

}