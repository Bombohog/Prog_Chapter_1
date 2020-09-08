/*
 * "Projektet" handler om at få printet det approximeret pi.
 *
 * Denne kode er programmeret af:
 * Lasse Jørgensen Kongsdal
 *
 * Programmet printer to forskellige værdier af pi alt efter om det er 1 eller 1.0 der står.
 */

public class Opg_7 {

    public static void main(String[] args) {

        // Variabler af pi, 1 og 1.0.
        double pi1 = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);
        double pi = 4 * (1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13);

        System.out.println("pi(1) = " + pi1);
        System.out.println("pi(1.0) = " + pi);

    }

}
