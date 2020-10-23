package Chapter_1;/*
 * "Projektet" handler om at få printet nogle resultater af en rectangle ud.
 *
 * Denne kode er programmeret af:
 * Lasse Jørgensen Kongsdal
 *
 * Programmet printer resultatet af rectanglets omkreds og areal.
 */

public class Opg_9 {

    public static void main(String[] args) {

        double width = 5.3;
        double height = 8.6;
        double area = width * height;
        double perimeter = 2 * (width * height);

        System.out.println("Omkreds = " + perimeter);
        System.out.println("Areal = " + area);

    }

}
