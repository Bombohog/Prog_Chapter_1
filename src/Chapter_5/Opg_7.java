/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 01-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_5;

public class Opg_7 {

    public static void main(String[] args) {

        double tuition = 10000;
        double fourYearTuition = 0;

        for (int years = 1; years  <= 14; years++) {

            tuition += tuition * 0.06;
            if (years <= 10) {System.out.println("Year " + years + " the tuition is " + tuition);}
            else {
                fourYearTuition += tuition;
            }

        }
        System.out.println("The cost of four years of tuition after the tenth year is " + fourYearTuition);

    }

}
