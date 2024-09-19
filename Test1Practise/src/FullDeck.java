public class FullDeck {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        Card[] deck = new Card[52];
        int index = 0;

        // Create the deck of cards
        for (String suit : suits) {
            for (String value : values) {
                deck[index] = new Card(suit, value);
                index++;
            }
        }

        // Display the deck
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
