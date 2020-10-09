/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 08-10-2020
 *
 * Description of program
 ********************************************/

package Chapter_6;

import java.util.Random;

public class Opg_30 {

    public static void main(String[] args) {

        Craps();

    }

    public static void Craps() {

        int points = 0;
        int[] diceRolls = RollDice();

        System.out.printf("You rolled %d + %d = %d", diceRolls[0], diceRolls[1], diceRolls[0] + diceRolls[1]);

        if (diceRolls[0] + diceRolls[1] == 7 || diceRolls[0] + diceRolls[1] == 11) {

            System.out.println("\nCongrats you win!");

        } else if (diceRolls[0] + diceRolls[1] == 2 || diceRolls[0] + diceRolls[1] == 3 || diceRolls[0] + diceRolls[1] == 12) {

            System.out.println("\nYou lose!");

        } else {

            points += diceRolls[0] + diceRolls[1];

            while (true) {

                diceRolls = RollDice();
                System.out.printf("\nYou rolled %d + %d = %d", diceRolls[0], diceRolls[1], diceRolls[0] + diceRolls[1]);

                if (diceRolls[0] + diceRolls[1] == points) {

                    System.out.println("\nCongrats you win!");
                    break;

                } else if (diceRolls[0] + diceRolls[1] == 7) {

                    System.out.println("\nYou lose!");
                    break;

                }

            }


        }

    }

    public static int[] RollDice() {

        Random rand = new Random();
        int dice1 = rand.nextInt((6 - 1) + 1) + 1;
        int dice2 = rand.nextInt((6 - 1) + 1) + 1;

        return new int[]{dice1, dice2};
    }

}
