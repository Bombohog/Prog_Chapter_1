/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3_Examples;

import java.awt.*;

public class Selections {

    public static void main(String[] args) {

        int hour = 9;
        int minute = 58;

        // if
        if (hour >= 9) {
            if (hour < 15) {
                System.out.println("Du er i skole");
            } else {
                System.out.println("Du er ikke i skole");
            }
        } else {
            System.out.println("Du er ikke i skole");
        }

            // brug && for at gøre det bedre
        if (hour >= 9 && hour < 15) {
            System.out.println("Du er i skole");
        } else {
            System.out.println("Du er ikke i skole");
        }

        // switch
        String color = "blue";

        // normal switch
        switch (color) {
            case "red":
                System.out.println("En rød sportsvogn");
                break;
            case "grøn":
                System.out.println("En grøn offroader");
                break;
            case "sort":
                System.out.println("En sort limusine");
                break;
            default:
                System.out.println("En eller anden random bil");
        }

        // ombygget til if
        if (color.equals("red")) {System.out.println("En rød sportsvogn");}
        else if (color.equals("red")) {System.out.println("En grøn offroader");}
        else if (color.equals("red")) {System.out.println("En sort limusine");}
        else {System.out.println("En eller anden random bil");}

        // enhanced switch
        switch (color) {
            case "red" -> System.out.println("En rød sportsvogn");
            case "grøn" -> System.out.println("En grøn offroader");
            case "sort" -> System.out.println("En sort limusine");
            default -> System.out.println("En eller anden random bil");
        }

    }

}
