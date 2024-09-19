import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Recording[] recordings = new Recording[5];

        // Input details for 5 recordings
        for (int i = 0; i < recordings.length; i++) {
            recordings[i] = new Recording();

            System.out.print("Enter title for recording #" + (i + 1) + ": ");
            recordings[i].setTitle(input.nextLine());

            System.out.print("Enter artist for recording #" + (i + 1) + ": ");
            recordings[i].setArtist(input.nextLine());

            System.out.print("Enter playing time (in seconds) for recording #" + (i + 1) + ": ");
            recordings[i].setPlayingTime(input.nextInt());
            input.nextLine(); // Consume the newline character
        }

        // Prompt for sorting criteria
        System.out.print("Sort by (title, artist, playing time): ");
        String sortBy = input.nextLine();

        // Sort by the chosen criteria
        switch (sortBy.toLowerCase()) {
            case "title":
                Arrays.sort(recordings, Comparator.comparing(Recording::getTitle));
                break;
            case "artist":
                Arrays.sort(recordings, Comparator.comparing(Recording::getArtist));
                break;
            case "playing time":
                Arrays.sort(recordings, Comparator.comparingInt(Recording::getPlayingTime));
                break;
            default:
                System.out.println("Invalid sorting option. Sorting by title.");
                Arrays.sort(recordings, Comparator.comparing(Recording::getTitle));
                break;
        }

        // Display sorted recordings
        System.out.println("\nSorted Recordings:");
        for (Recording recording : recordings) {
            recording.displayRecording();
        }
    }
}
