import java.util.Random;
import java.util.Scanner;

public class SecretPhrase2 {
    public static void main(String[] args) {
        // List of phrases
        String[] phrases = {
                "No man is an island",
                "To be or not to be",
                "The early bird catches the worm",
                "A journey of a thousand miles begins with a single step",
                "Actions speak louder than words",
                "Better late than never",
                "Birds of a feather flock together",
                "A penny saved is a penny earned",
                "Beauty is in the eye of the beholder",
                "You can't judge a book by its cover"
        };

        // Select a random phrase
        Random rand = new Random();
        String phrase = phrases[rand.nextInt(phrases.length)];
        String hiddenPhrase = phrase.replaceAll("[a-zA-Z]", "*");
        Scanner scanner = new Scanner(System.in);
        StringBuilder currentGuess = new StringBuilder(hiddenPhrase);
        StringBuilder guessedLetters = new StringBuilder();
        int attempts = 0;

        System.out.println("Welcome to the Secret Phrase game!");
        System.out.println("Try to guess the phrase. Type your guesses one letter at a time.");

        while (currentGuess.indexOf("*") != -1) {
            System.out.println("Current phrase: " + currentGuess.toString());
            System.out.println("Guessed letters: " + guessedLetters.toString());
            System.out.print("Enter a letter: ");
            String input = scanner.nextLine().toUpperCase();

            // Check if the input is valid
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Invalid input. Please enter a single letter.");
                continue;
            }

            char guess = input.charAt(0);

            // Check if the letter has already been guessed
            if (guessedLetters.indexOf(String.valueOf(guess)) != -1) {
                System.out.println("You already guessed that letter.");
                continue;
            }

            // Update guessed letters
            guessedLetters.append(guess).append(" ");

            // Check if the guess is correct
            boolean correctGuess = false;
            for (int i = 0; i < phrase.length(); i++) {
                if (Character.toUpperCase(phrase.charAt(i)) == guess) {
                    currentGuess.setCharAt(i, phrase.charAt(i));
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                System.out.println("Incorrect guess.");
                attempts++;
            }

            if (currentGuess.indexOf("*") == -1) {
                System.out.println("Congratulations! You've guessed the phrase: " + phrase);
                break;
            }
        }

        if (currentGuess.indexOf("*") != -1) {
            System.out.println("Sorry, you've used all your attempts. The phrase was: " + phrase);
        }

        scanner.close();
    }
}
