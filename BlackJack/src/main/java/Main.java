import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        String[] playerNames = new String[numPlayers];
        Hand[] playerHands = new Hand[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Enter name for player " + (i + 1) + ": ");
            playerNames[i] = scanner.nextLine();
            playerHands[i] = new Hand();
        }

        Hand dealerHand = new Hand();

        // Deal 2 cards to each player and dealer
        for (int i = 0; i < 2; i++) {
            for (Hand hand : playerHands) {
                hand.deal(deck.deal());
            }
            dealerHand.deal(deck.deal());
        }

        // Each player's turn
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("\n" + playerNames[i] + "'s turn:");
            boolean continueTurn = true;
            while (continueTurn) {
                System.out.println("Your hand:");
                playerHands[i].showHand();
                int handValue = playerHands[i].getValue();
                System.out.println("Total points: " + handValue);
                if (handValue > 21) {
                    System.out.println("Bust! You lose :(");
                    break;
                }
                System.out.print("Do you want to hit? (y/n): ");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    playerHands[i].deal(deck.deal());
                } else {
                    continueTurn = false;
                }
            }
        }

        // Dealer's turn
        System.out.println("\nDealer's turn:");
        dealerHand.showHand();
        while (dealerHand.getValue() < 17) {
            System.out.println("Dealer hits.");
            dealerHand.deal(deck.deal());
            dealerHand.showHand();
        }
        int dealerValue = dealerHand.getValue();
        System.out.println("Dealer's total points: " + dealerValue);
        if (dealerValue > 21) {
            System.out.println("Dealer busts!");
        }

        // Determine winners
        for (int i = 0; i < numPlayers; i++) {
            int playerValue = playerHands[i].getValue();
            System.out.println("\nResult for " + playerNames[i] + ":");
            System.out.println("Total points: " + playerValue);
            if (playerValue > 21) {
                System.out.println("You lose :(");
            } else if (dealerValue > 21 || playerValue > dealerValue) {
                System.out.println("You win siiiiiiuu!");
            } else if (playerValue == dealerValue) {
                System.out.println("Push.");
            } else {
                System.out.println("You lose :(");
            }
        }

        scanner.close();
    }
}
