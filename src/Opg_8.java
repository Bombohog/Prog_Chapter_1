/*
 * "Projektet" handler om at få printet nogle resultater af en cirkel ud.
 *
 * Denne kode er programmeret af:
 * Lasse Jørgensen Kongsdal
 *
 * Programmet printer resultatet af cirklens omkreds og areal.
 */

public class Opg_8 {

    public static void main(String[] args) {

        double radius = 6.5;
        double pi = 3.14159;
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.println("Omkreds = " + perimeter);
        System.out.println("Areal = " + area);

    }

}
