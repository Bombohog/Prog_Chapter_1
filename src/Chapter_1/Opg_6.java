package Chapter_1;/*
 * "Projektet" handler om at få printet et resultat ud.
 *
 * Denne kode er programmeret af:
 * Lasse Jørgensen Kongsdal
 *
 * Programmet printer et resultat af en beregning der sker i selve koden/programmet inde i et loop.
 */

public class Opg_6 {

    public static void main(String[] args) {

        int resultat = 0;

        // Et loop der lægger tallene sammen en efter en og gemmer dem i variablen resultat.
        for (int i = 1; i <= 10; i++) {

            resultat += i;

        }

            System.out.println(resultat);

    }



}
