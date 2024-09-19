import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        // Array of responses
        String[] responses = {
                "Yes, definitely.",
                "It is certain.",
                "Without a doubt.",
                "Yes - definitely.",
                "You may rely on it.",
                "As I see it, yes.",
                "Most likely.",
                "Yes.",
                "Outlook good.",
                "Yes, in due time.",
                "Definitely not.",
                "My sources say no.",
                "Outlook not so good.",
                "No.",
                "Very doubtful.",
                "Don't count on it.",
                "No, not at all.",
                "It's uncertain.",
                "Ask again later.",
                "Maybe.",
                "Cannot predict now."
        };

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String question;

        System.out.println("Welcome to the Magic 8 Ball game!");
        System.out.println("Ask a yes-or-no question and see what the Magic 8 Ball has to say.");
        System.out.println("Type 'exit' to quit.");

        while (true) {
            System.out.print("Ask your question: ");
            question = scanner.nextLine();

            if (question.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            // Provide a random response
            String response = responses[rand.nextInt(responses.length)];
            System.out.println(response);
        }

        scanner.close();
    }
}
