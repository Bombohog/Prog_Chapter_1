/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 21-09-2020
 *
 * Description of program
 ********************************************/

package Chapter_3;

import java.util.*;

public class Opg_14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Guess whether the coin will flip 'heads' or 'tails': ");
        String guess = input.nextLine();

        Random rand = new Random();
        int coinFlipInt = rand.nextInt((1) + 1);
        String coinFlipString;

        if (coinFlipInt == 0) {coinFlipString = "heads";}
        else {coinFlipString = "tails";}
        
        if (guess.equals(coinFlipString)) {
            System.out.println("You guessed correct");
        }  else {
            System.out.println("You guessed wrong");
        }

    }

}
