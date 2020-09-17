/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 16-09-2020
 *
 * Description of program
 ********************************************/

package Exercises_17_09_2020;

public class VisNuvaerendeTid {

    public static void main(String[] args) {

        // Fang det totale antal af millisekunder siden midnat, Jan 1, 1970
        long antalMilliSekunder = System.currentTimeMillis();

        // Denne kode er erstattet med metoden
        /*// Fang det totale antal af sekunder siden midnat, Jan 1, 1970
        long antalSekunder = antalMilliSekunder / 1000;

        // Udregn den nuværende sekund i minutet i timen
        long nuvaerendeSekunder = antalSekunder % 60;

        // Fang det totale antal af minutter
        long antalMinutter = antalSekunder / 60;

        // Udregn den nuværende minut i timen
        long nuvaerendeMinutter = antalMinutter % 60;

        // Fang det totale antal af timer
        long antalTimer = antalMinutter / 60;

        // Udregn den nuværende time
        long nuvaerendeTimer = antalTimer % 24;*/

        long antalSekunder = nuvaerendeSekunder(antalMilliSekunder)[0];
        long antalMinutter = nuvaerendeMinutter(antalSekunder)[0];

        // Vis resultatet
        System.out.println("Nuværende tid er " + nuvaerendeTimer(antalMinutter) + ":"
                + nuvaerendeMinutter(antalSekunder)[1] + ":" + nuvaerendeSekunder(antalMilliSekunder)[1] + " GMT/UTC");

    }

    public static long nuvaerendeTimer(long antalMinutter){

        // Fang det totale antal af timer
        long antalTimer = antalMinutter / 60;

        // Udregn den nuværende time
        long nuvaerendeTimer = antalTimer % 24;

        return nuvaerendeTimer;
    }

    public static long[] nuvaerendeMinutter(long antalSekunder){

        // Fang det totale antal af minutter
        long antalMinutter = antalSekunder / 60;

        // Udregn den nuværende minut i timen
        long nuvaerendeMinutter = antalMinutter % 60;

        long minutter[] = {antalMinutter, nuvaerendeMinutter};

        return minutter;
    }

    public static long[] nuvaerendeSekunder(long antalMilliSekunder){

        // Fang det totale antal af sekunder siden midnat, Jan 1, 1970
        long antalSekunder = antalMilliSekunder / 1000;

        // Udregn den nuværende sekund i minutet i timen
        long nuvaerendeSekunder = antalSekunder % 60;

        long sekunder[] = {antalSekunder, nuvaerendeSekunder};

        return sekunder;
    }

}
