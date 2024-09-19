import java.util.ArrayList;
import java.util.Collections;

public class War3 {
    public static void main(String[] args) {
        // Initialize suits and values
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Create the deck of 52 cards
        ArrayList<Card> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String value : values) {
                deck.add(new Card(suit, value));
            }
        }

        // Shuffle the deck
        Collections.shuffle(deck);

        // Split the deck into two halves, one for the player and one for the computer
        ArrayList<Card> playerDeck = new ArrayList<>(deck.subList(0, 26));
        ArrayList<Card> computerDeck = new ArrayList<>(deck.subList(26, 52));

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        // Play 26 rounds of War
        for (int i = 0; i < 26; i++) {
            Card playerCard = playerDeck.get(i);
            Card computerCard = computerDeck.get(i);

            // Display the current cards
            System.out.println("Round " + (i + 1) + ":");
            System.out.println("Player's card: " + playerCard);
            System.out.println("Computer's card: " + computerCard);

            // Compare the two cards and determine the winner
            int comparisonResult = compareCards(playerCard, computerCard);
            if (comparisonResult > 0) {
                System.out.println("Player wins the round!\n");
                playerWins++;
            } else if (comparisonResult < 0) {
                System.out.println("Computer wins the round!\n");
                computerWins++;
            } else {
                System.out.println("It's a tie!\n");
                ties++;
            }
        }

        // Display the final results
        System.out.println("Game Over! Here are the results:");
        System.out.println("Player wins: " + playerWins);
        System.out.println("Computer wins: " + computerWins);
        System.out.println("Ties: " + ties);
    }

    // Method to compare two cards based on their values
    public static int compareCards(Card playerCard, Card computerCard) {
        // Define the ranking order of card values
        String[] cardRanks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Get the rank of the player's card and the computer's card
        int playerCardRank = getCardRank(playerCard.getValue(), cardRanks);
        int computerCardRank = getCardRank(computerCard.getValue(), cardRanks);

        // Compare the ranks
        return Integer.compare(playerCardRank, computerCardRank);
    }

    // Helper method to get the rank of a card
    public static int getCardRank(String cardValue, String[] cardRanks) {
        for (int i = 0; i < cardRanks.length; i++) {
            if (cardRanks[i].equals(cardValue)) {
                return i;
            }
        }
        return -1; // Should never happen if the cards are valid
    }
}


