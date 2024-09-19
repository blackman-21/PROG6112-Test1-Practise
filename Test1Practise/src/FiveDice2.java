import java.util.Scanner;

public class FiveDice2 {
    public static void main(String[] args) {
        Die[] computerDice = new Die[5];
        Die[] playerDice = new Die[5];

        // Roll dice for computer and player
        for (int i = 0; i < 5; i++) {
            computerDice[i] = new Die();
            playerDice[i] = new Die();
        }

        // Display results
        System.out.print("Computer rolled: ");
        displayDice(computerDice);
        System.out.print("You rolled: ");
        displayDice(playerDice);

        // Determine winner based on dice combinations
        String computerResult = getDiceCombination(computerDice);
        String playerResult = getDiceCombination(playerDice);

        System.out.println("Computer has " + computerResult);
        System.out.println("You have " + playerResult);

        // Compare results
        int computerRank = getRank(computerResult);
        int playerRank = getRank(playerResult);

        if (computerRank > playerRank) {
            System.out.println("Computer wins!");
        } else if (playerRank > computerRank) {
            System.out.println("You win!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    // Display the dice values
    public static void displayDice(Die[] dice) {
        for (Die die : dice) {
            System.out.print(die.getValue() + " ");
        }
        System.out.println();
    }

    // Return the dice combination (e.g., "Three of a kind")
    public static String getDiceCombination(Die[] dice) {
        int[] counts = new int[7]; // Array to count occurrences of each value

        for (Die die : dice) {
            counts[die.getValue()]++;
        }

        int maxCount = 0;
        for (int count : counts) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        switch (maxCount) {
            case 5: return "Five of a kind";
            case 4: return "Four of a kind";
            case 3: return "Three of a kind";
            case 2: return "Two of a kind";
            default: return "Nothing special";
        }
    }

    // Get rank for a combination (higher rank means better combination)
    public static int getRank(String combination) {
        switch (combination) {
            case "Five of a kind": return 4;
            case "Four of a kind": return 3;
            case "Three of a kind": return 2;
            case "Two of a kind": return 1;
            default: return 0;
        }
    }
}
