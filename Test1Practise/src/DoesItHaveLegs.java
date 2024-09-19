import java.util.Scanner;

class Node {
    String data; // Store either a question or an animal
    Node yesNode; // Left child: If the answer to the question is Yes
    Node noNode;  // Right child: If the answer to the question is No

    public Node(String data) {
        this.data = data;
        this.yesNode = null;
        this.noNode = null;
    }

    public boolean isQuestion() {
        return yesNode != null && noNode != null;
    }
}

public class DoesItHaveLegs {
    private Node root;
    private Scanner scanner;

    public DoesItHaveLegs() {
        // Initial question/animal setup: the tree starts with one question about legs
        root = new Node("Does the animal you are thinking of have legs?");
        root.yesNode = new Node("Dog"); // Default animal if yes
        root.noNode = new Node("Fish"); // Default animal if no
        scanner = new Scanner(System.in);
    }

    // Start the game
    public void play() {
        do {
            System.out.println("Think of an animal, and I'll try to guess what it is.");
            playRound(root);
            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Thanks for playing!");
    }

    // Play a round of the game starting from a given node
    private void playRound(Node current) {
        if (current.isQuestion()) {
            System.out.print(current.data + " (yes/no): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                playRound(current.yesNode); // Move to yes branch
            } else {
                playRound(current.noNode);  // Move to no branch
            }
        } else {
            // We are at a guess (an animal)
            System.out.print("Is it a " + current.data + "? (yes/no): ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Yay! I win.");
            } else {
                // If the guess was wrong, learn a new animal and a question to distinguish
                System.out.println("I give up. What was your animal?");
                String animal = scanner.nextLine();

                System.out.println("Type a question for which the answer is 'Yes' for " + animal + " but 'No' for " + current.data + ".");
                String newQuestion = scanner.nextLine();

                // Add new question node and adjust tree
                Node newQuestionNode = new Node(newQuestion);
                newQuestionNode.yesNode = new Node(animal);  // Yes for the new animal
                newQuestionNode.noNode = current;           // No for the current guess

                // Replace the current node with the new question node
                current.data = newQuestion;
                current.yesNode = new Node(animal);
                current.noNode = new Node(current.data);
            }
        }
    }

    public static void main(String[] args) {
        DoesItHaveLegs game = new DoesItHaveLegs();
        game.play();
    }
}
