import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner scanner = new Scanner(System.in);

        // Fill the hand with random cards
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) (Math.random() * 13) + 1); // Random value between 1 and 13 (inclusive)
            card.setSuit((int) (Math.random() * 4)); // Random suit index between 0 and 3
            hand[i] = card;
        }

        // Ask the user to pick a card
        System.out.println("Pick a card (Enter value and suit):");
        System.out.print("Enter value (1-13): ");
        int userValue = scanner.nextInt();
        System.out.print("Enter suit (1-4): ");
        int userSuit = scanner.nextInt();

        // Search for the user's card in the hand
        boolean foundMatch = false;
        for (Card card : hand) {
            if (card.getValue() == userValue && card.getSuit() == userSuit - 1) {
                foundMatch = true;
                break;
            }
        }

        // Print result
        if (foundMatch) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand.");
        }
    }

    /**
     * A simple method to print out personal information.
     * @author - diya patel
     * @date - 06 feb 2024
     */
    private static void printInfo() {
        System.out.println("Congratulations, you picked the right card!");
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
