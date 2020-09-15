package Chapter_2;

import java.util.Scanner;

public class ComputeArea {

    public static final double pi = 3.14159; // const var

    public static void main(String[] args) {

        // circle
        double r; // var

        String title = "Areal beregner";

        r = 6; // declare var

        System.out.println("Beregner arealet med metoder");

        System.out.println("Arealet for radius "+r+" = " + ComputeCircle(r)); // display result

        r = 12;
        System.out.println("Arealet for radius "+r+" = " + ComputeCircle(r)); // display result

        r = 18;
        System.out.println("Arealet for radius "+r+" = " + ComputeCircle(r)); // display result

        // rect
        double rectLang; // var
        double rectBred; // var

        rectLang = 8;
        rectBred = 11;
        System.out.println("Arealet for længde:"+rectLang+", bredde:"+rectBred+" = " + ComputeRect(rectLang, rectBred));

        rectLang = 2;
        rectBred = 5;
        System.out.println("Arealet for længde:"+rectLang+", bredde:"+rectBred+" = " + ComputeRect(rectLang, rectBred));

        rectLang = 6;
        rectBred = 12;
        System.out.println("Arealet for længde:"+rectLang+", bredde:"+rectBred+" = " + ComputeRect(rectLang, rectBred));

        // Box
        double boxLang; // var
        double boxBred; // var
        double boxHeight; // var

        boxLang = 8;
        boxBred = 11;
        boxHeight = 14;

        System.out.println("Arealet for længde:8, bredde:11, højde:14 = " + ComputeBox(boxLang, boxBred, boxHeight));
        System.out.println("Arealet for længde:5, bredde:25, højde:14 = " + ComputeBox(5, 25, 14));
        System.out.println("Arealet for længde:16, bredde:28, højde:85 = " + ComputeBox(16, 28, 85));

        //ComputeBoxInput();

    }

    // Area of circle
    public static double ComputeCircle(double radius) {

        double a = radius * radius * Math.PI; // var & compute area
        return a; // return area

    }

    // Area of rectangle
    public static double ComputeRect(double l, double b) {

        double a = l * b; // var & compute area
        return a; // return area

    }

    // Volume of box
    public static double ComputeBox(double l, double b, double h) {

        double v = l * b * h; // var & compute volume
        return v; // return volume

    }

    /*public static void ComputeBoxInput() {

        System.out.println("The two numbers are: "+ a +"and"+ b);

        *//*Scanner inputL = new Scanner(System.in);
        System.out.print("Laengde: ");
        System.out.println("");
        Scanner inputB = new Scanner(System.in);
        System.out.print("Bredde: ");
        System.out.println("");
        Scanner inputH = new Scanner(System.in);
        System.out.print("Hoejde: ");

        int l = inputL.nextInt();
        int b = inputB.nextInt();
        int h = inputH.nextInt();

        int v = l * b * h; // var & compute volume
        System.out.println(v);*//*

    }*/

}
