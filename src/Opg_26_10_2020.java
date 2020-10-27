import java.awt.*;
import java.util.ArrayList;

/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 26-10-2020
 *
 * Description of program
 ********************************************/

public class Opg_26_10_2020 {

    public static void main(String[] args) {

        System.out.println("Assignment using Strings:");
        OpgWithStrings();

        System.out.println("\nAssignment using Colors:");
        OpgWithColors();

        System.out.println("\nAssignment using enum:"); // Colortypes
        OpgWithEnum();

    }

    public static void OpgWithStrings() {

        final int amountColorNames = 3; // x
        final int amountColors = 3; // y
        final String colorToCheck = "Blue"; // z

        String[] colorNames = new String[amountColorNames];
        colorNames[0] = "Green";
        colorNames[1] = "Blue";
        colorNames[2] = "Orange";
        String[] colors = new String[amountColors];
        colors[0] = colorNames[0];
        colors[1] = colorNames[1];
        colors[2] = colorNames[2];

        for (String currentColor : colors) {

            if (currentColor.equals(colorToCheck)) {

                System.out.printf("The color %s exists in the array.\n", colorToCheck);
                break;

            }

        }

    }

    public static void OpgWithColors() {

//        final int amountColorNames = 3;
        final int amountColors = 3;
        final Color colorToCheck = Color.cyan;

//        String[] colorNames = new String[amountColorNames];
        Color[] colors = new Color[amountColors];
        colors[0] = Color.CYAN;
        colors[1] = Color.BLACK;
        colors[2] = Color.BLUE;

        for (Color currentColor : colors) {

            if (currentColor == colorToCheck) {

                System.out.print("The color Cyan exists in the array.\n");
                break;

            }

        }

    }


    enum Colortypes {
        GREEN,
        BLUE,
        ORANGE;
    }

    public static void OpgWithEnum() {

        final Colortypes colorToCheck = Colortypes.ORANGE;

        Colortypes[] colors = Colortypes.values();

        for (Colortypes currentColor : colors) {

            if (currentColor == colorToCheck) {

                System.out.printf("The color %s exists in the array.\n", colorToCheck);
                break;

            }

        }

    }

    public static void OpgWithArrayList() {

//        final int amountColorNames = 3;
        final int amountColors = 3;
        final Color colorToCheck = Color.cyan;

//        String[] colorNames = new String[amountColorNames];
        ArrayList<Color> colors = new ArrayList<>(amountColors);
        colors.add(Color.CYAN);
        colors.add(Color.BLACK);
        colors.add(Color.BLUE);

        if (colors.contains(colorToCheck)) {

            System.out.print("The color Cyan exists in the array.\n");

        }

    }

}
