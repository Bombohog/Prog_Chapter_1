/********************************************
 * Et program der kan beregne moms dansk/tysk
 *
 * Created by: Lasse J. Kongsdal
 * Date: 16-09-2020
 *
 * Du kan indsætte en pris og så kan den
 * beregne prisen ud efter moms.
 ********************************************/

import java.util.Scanner;

public class Moms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Skriv antal kroner: ");
        double Pris = input.nextDouble();

        plusDanskMoms(Pris);
        plusTyskMoms(Pris);

    }

    public static void plusDanskMoms(double pris){

        double moms = 25;
        pris = pris * (1 + (moms / 100));

        System.out.println("Pris efter dansk moms: " + (int)(pris * 100) / 100.0 + " kr");

    }


    public static void plusTyskMoms(double pris){

        double moms = 16;
        pris = pris * (1 + (moms / 100));

        System.out.println("Pris efter tysk moms: " + (int)(pris * 100) / 100.0 + " kr");

    }

}
