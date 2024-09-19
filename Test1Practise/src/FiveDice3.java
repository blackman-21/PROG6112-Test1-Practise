

import java.util.Arrays;

public class FiveDice3 {
    public static void main(String[] args) {
        Die[] computerDice = new Die[5];
        Die[] playerDice = new Die[5];

        // Roll dice for computer and player
        for (int i = 0; i < 5; i++) {
            computerDice[i] = new Die();
            playerDice[i] = new Die();
        }

        System.out.print("Computer rolled: ");
        displayDice(computerDice);
        System.out.print("You rolled: ");
        displayDice(playerDice);

        String computerResult = evaluateDice(computerDice);
        String playerResult = evaluateDice(playerDice);

        System.out.println("Computer has " + computerResult);
        System.out.println("You have " + playerResult);

        int computerRank = getRank(computerResult);
        int playerRank = getRank(playerResult);

        if (computerRank > playerRank) {
            System.out.println("Computer wins");
        } else if (computerRank < playerRank) {
            System.out.println("You win!");
        } else {
            int computerMaxValue = getMaxValue(computerDice);
            int playerMaxValue = getMaxValue(playerDice);

            if (computerMaxValue > playerMaxValue) {
                System.out.println("Computer wins with higher dice values");
            } else if (computerMaxValue < playerMaxValue) {
                System.out.println("You win with higher dice values!");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }

    public static void displayDice(Die[] dice) {
        for (Die die : dice) {
            System.out.print(die.getValue() + " ");
        }
        System.out.println();
    }

    public static String evaluateDice(Die[] dice) {
        int[] counts = new int[6];
        for (Die die : dice) {
            counts[die.getValue() - 1]++;
        }

        Arrays.sort(counts); // Sorts from lowest to highest
        if (counts[5] == 5) {
            return "5 of a kind";
        } else if (counts[5] == 4) {
            return "4 of a kind";
        } else if (counts[5] == 3) {
            if (counts[4] == 2) {
                return "Full house";
            }
            return "3 of a kind";
        } else if (counts[5] == 2 && counts[4] == 2) {
            return "2 pairs";
        } else if (counts[5] == 2) {
            return "1 pair";
        }
        return "nothing";
    }

    public static int getRank(String result) {
        switch (result) {
            case "5 of a kind":
                return 5;
            case "4 of a kind":
                return 4;
            case "3 of a kind":
                return 3;
            case "2 pairs":
                return 2;
            case "1 pair":
                return 1;
            default:
                return 0;
        }
    }

    public static int getMaxValue(Die[] dice) {
        int maxValue = 0;
        for (Die die : dice) {
            if (die.getValue() > maxValue) {
                maxValue = die.getValue();
            }
        }
        return maxValue;
    }
}
