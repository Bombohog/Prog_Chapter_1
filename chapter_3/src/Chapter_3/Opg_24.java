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

public class Opg_24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int cardsInDeck = 52;
        card[] deck = CreatDeck();

        while (cardsInDeck > 0) {
            System.out.print("Write 'Pick a card' to pick up a card from the deck, or write 'leave': ");
            if (input.nextLine().equals("Pick a card") || input.nextLine().equals("pick a card")) {

                cardsInDeck -= 1;
                int deckIndex = rand.nextInt(deck.length);
                card pickedCard = deck[deckIndex];
                String rank;
                switch (pickedCard.rank) {
                    case 1 -> {rank = "Ace";}
                    case 11 -> {rank = "Jack";}
                    case 12 -> {rank = "Queen";}
                    case 13 -> {rank = "King";}
                    default -> {rank = Integer.toString(pickedCard.rank);}
                }
                System.out.println("The card you picked is " + rank + " of " + pickedCard.suit);

                // remove card from array
                // create an array to hold elements after deletion
                card[] copyArray = new card[deck.length - 1];

                // copy elements from original array from beginning till index into copyArray
                System.arraycopy(deck, 0, copyArray, 0, deckIndex);

                // copy elements from original array from index+1 till end into copyArray
                System.arraycopy(deck, deckIndex + 1, copyArray, deckIndex, deck.length - deckIndex - 1);

                deck = copyArray;

            } else if (input.nextLine().equals("leave")) {break;}
            else {System.out.println("Wrong command");}
        }
        if (cardsInDeck == 0) {System.out.println("There are no more cards in the deck");}

    }

    public static card[] CreatDeck() {

        //<editor-fold desc="Clubs">
        card clubAce = new card();
        clubAce.rank = 1;
        clubAce.suit = "Clubs";

        card clubTwo = new card();
        clubTwo.rank = 2;
        clubTwo.suit = "Clubs";

        card clubThree = new card();
        clubThree.rank = 3;
        clubThree.suit = "Clubs";

        card clubFour = new card();
        clubFour.rank = 4;
        clubFour.suit = "Clubs";

        card clubFive = new card();
        clubFive.rank = 5;
        clubFive.suit = "Clubs";

        card clubSix = new card();
        clubSix.rank = 6;
        clubSix.suit = "Clubs";

        card clubSeven = new card();
        clubSeven.rank = 7;
        clubSeven.suit = "Clubs";

        card clubEight = new card();
        clubEight.rank = 8;
        clubEight.suit = "Clubs";

        card clubNine = new card();
        clubNine.rank = 9;
        clubNine.suit = "Clubs";

        card clubTen = new card();
        clubTen.rank = 10;
        clubTen.suit = "Clubs";

        card clubJack = new card();
        clubJack.rank = 11;
        clubJack.suit = "Clubs";

        card clubQueen = new card();
        clubQueen.rank = 12;
        clubQueen.suit = "Clubs";

        card clubKing = new card();
        clubKing.rank = 13;
        clubKing.suit = "Clubs";
        //</editor-fold>
        //<editor-fold desc="Diamonds">
        card diamondAce = new card();
        diamondAce.rank = 1;
        diamondAce.suit = "Diamonds";

        card diamondTwo = new card();
        diamondTwo.rank = 2;
        diamondTwo.suit = "Diamonds";

        card diamondThree = new card();
        diamondThree.rank = 3;
        diamondThree.suit = "Diamonds";

        card diamondFour = new card();
        diamondFour.rank = 4;
        diamondFour.suit = "Diamonds";

        card diamondFive = new card();
        diamondFive.rank = 5;
        diamondFive.suit = "Diamonds";

        card diamondSix = new card();
        diamondSix.rank = 6;
        diamondSix.suit = "Diamonds";

        card diamondSeven = new card();
        diamondSeven.rank = 7;
        diamondSeven.suit = "Diamonds";

        card diamondEight = new card();
        diamondEight.rank = 8;
        diamondEight.suit = "Diamonds";

        card diamondNine = new card();
        diamondNine.rank = 9;
        diamondNine.suit = "Diamonds";

        card diamondTen = new card();
        diamondTen.rank = 10;
        diamondTen.suit = "Diamonds";

        card diamondJack = new card();
        diamondJack.rank = 11;
        diamondJack.suit = "Diamonds";

        card diamondQueen = new card();
        diamondQueen.rank = 12;
        diamondQueen.suit = "Diamonds";

        card diamondKing = new card();
        diamondKing.rank = 13;
        diamondKing.suit = "Diamonds";
        //</editor-fold>
        //<editor-fold desc="Hearts">
        card heartAce = new card();
        heartAce.rank = 1;
        heartAce.suit = "Hearts";

        card heartTwo = new card();
        heartTwo.rank = 2;
        heartTwo.suit = "Hearts";

        card heartThree = new card();
        heartThree.rank = 3;
        heartThree.suit = "Hearts";

        card heartFour = new card();
        heartFour.rank = 4;
        heartFour.suit = "Hearts";

        card heartFive = new card();
        heartFive.rank = 5;
        heartFive.suit = "Hearts";

        card heartSix = new card();
        heartSix.rank = 6;
        heartSix.suit = "Hearts";

        card heartSeven = new card();
        heartSeven.rank = 7;
        heartSeven.suit = "Hearts";

        card heartEight = new card();
        heartEight.rank = 8;
        heartEight.suit = "Hearts";

        card heartNine = new card();
        heartNine.rank = 9;
        heartNine.suit = "Hearts";

        card heartTen = new card();
        heartTen.rank = 10;
        heartTen.suit = "Hearts";

        card heartJack = new card();
        heartJack.rank = 11;
        heartJack.suit = "Hearts";

        card heartQueen = new card();
        heartQueen.rank = 12;
        heartQueen.suit = "Hearts";

        card heartKing = new card();
        heartKing.rank = 13;
        heartKing.suit = "Hearts";
        //</editor-fold>
        //<editor-fold desc="Spades">
        card spadeAce = new card();
        spadeAce.rank = 1;
        spadeAce.suit = "Spades";

        card spadeTwo = new card();
        spadeTwo.rank = 2;
        spadeTwo.suit = "Spades";

        card spadeThree = new card();
        spadeThree.rank = 3;
        spadeThree.suit = "Spades";

        card spadeFour = new card();
        spadeFour.rank = 4;
        spadeFour.suit = "Spades";

        card spadeFive = new card();
        spadeFive.rank = 5;
        spadeFive.suit = "Spades";

        card spadeSix = new card();
        spadeSix.rank = 6;
        spadeSix.suit = "Spades";

        card spadeSeven = new card();
        spadeSeven.rank = 7;
        spadeSeven.suit = "Spades";

        card spadeEight = new card();
        spadeEight.rank = 8;
        spadeEight.suit = "Spades";

        card spadeNine = new card();
        spadeNine.rank = 9;
        spadeNine.suit = "Spades";

        card spadeTen = new card();
        spadeTen.rank = 10;
        spadeTen.suit = "Spades";

        card spadeJack = new card();
        spadeJack.rank = 11;
        spadeJack.suit = "Spades";

        card spadeQueen = new card();
        spadeQueen.rank = 12;
        spadeQueen.suit = "Spades";

        card spadeKing = new card();
        spadeKing.rank = 13;
        spadeKing.suit = "Spades";
        //</editor-fold>
        //<editor-fold desc="Deck">
        card[] deck = {clubAce,
                clubTwo,
                clubThree,
                clubFour,
                clubFive,
                clubSix,
                clubSeven,
                clubEight,
                clubNine,
                clubTen,
                clubJack,
                clubQueen,
                clubKing,
                diamondAce,
                diamondTwo,
                diamondThree,
                diamondFour,
                diamondFive,
                diamondSix,
                diamondSeven,
                diamondEight,
                diamondNine,
                diamondTen,
                diamondJack,
                diamondQueen,
                diamondKing,
                heartAce,
                heartTwo,
                heartThree,
                heartFour,
                heartFive,
                heartSix,
                heartSeven,
                heartEight,
                heartNine,
                heartTen,
                heartJack,
                heartQueen,
                heartKing,
                spadeAce,
                spadeTwo,
                spadeThree,
                spadeFour,
                spadeFive,
                spadeSix,
                spadeSeven,
                spadeEight,
                spadeNine,
                spadeTen,
                spadeJack,
                spadeQueen,
                spadeKing};
        //</editor-fold>

        return deck;
    }

}

class card {

    int rank;
    String suit;

}
