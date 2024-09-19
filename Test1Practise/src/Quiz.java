import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Array of quiz questions
        String[] questions = {
                "What is the best programming language? (A) Java (B) Python (C) C++",
                "Which planet is closest to the sun? (A) Earth (B) Mars (C) Mercury",
                "Which animal is known as the king of the jungle? (A) Tiger (B) Lion (C) Elephant",
                "What is the capital of France? (A) Berlin (B) Paris (C) Rome",
                "Which color is associated with peace? (A) Red (B) Blue (C) White",
                "Which is the largest ocean on Earth? (A) Atlantic (B) Indian (C) Pacific",
                "What is the boiling point of water? (A) 100°C (B) 90°C (C) 80°C",
                "Which is the fastest land animal? (A) Cheetah (B) Lion (C) Horse",
                "What is the hardest natural substance? (A) Gold (B) Diamond (C) Steel",
                "Who wrote 'Romeo and Juliet'? (A) Charles Dickens (B) Mark Twain (C) William Shakespeare"
        };

        // Array of correct answers
        char[] answers = {'A', 'C', 'B', 'B', 'C', 'C', 'A', 'A', 'B', 'C'};

        Scanner input = new Scanner(System.in);
        int correctCount = 0, incorrectCount = 0;

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            char userAnswer;
            do {
                System.out.println(questions[i]);
                System.out.print("Your answer (A, B, C): ");
                userAnswer = input.next().toUpperCase().charAt(0);
            } while (userAnswer != 'A' && userAnswer != 'B' && userAnswer != 'C');

            // Check if answer is correct
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i]);
                incorrectCount++;
            }
            System.out.println();
        }

        // Display results
        System.out.println("You answered " + correctCount + " correctly and " + incorrectCount + " incorrectly.");
    }
}
