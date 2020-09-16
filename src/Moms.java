/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 16-09-2020
 *
 * Description of program
 ********************************************/

import java.util.Scanner;

public class Moms {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double Pris = input.nextDouble();

        plusDanskMoms(Pris);
        plusTyskMoms(Pris);

    }

    public static void plusDanskMoms(double pris){

        double moms = 25;
        pris = pris * (1 + (moms / 100));

        System.out.println("Pris i danske kroner " + (int)(pris * 100) / 100.0);

    }


    public static void plusTyskMoms(double pris){

        double moms = 16;
        pris = pris * (1 + (moms / 100));

        System.out.println("Pris i tysk " + (int)(pris * 100) / 100.0);

    }

}
