import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Fill the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1); // Random value between 1 and 13 (inclusive)
            card.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit index between 0 and 3
            hand[i] = card;
        }

        // Ask the user for their guess
        System.out.println("Enter your guess for a card value (1-13):");
        int guessValue = scanner.nextInt();
        System.out.println("Enter your guess for a card suit (1-4):");
        int guessSuit = scanner.nextInt();

        // Search for a match in the hand
        boolean foundMatch = false;
        for (Card card : hand) {
            if (card.getValue() == guessValue && card.getSuit() == guessSuit - 1) {
                foundMatch = true;
                break;
            }
        }

        // Print result
        if (foundMatch) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found.");
        }
    }

    /**
     * A simple method to print out personal information.
     * @author Diya patel
     * @date 6th feb 2024
     */
    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();    
        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");
        System.out.println();
    }
}