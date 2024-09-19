import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class EventDemo {
    public static void main(String[] args) {
        Event[] events = new Event[8];
        String[] options = {"Sort by Event Number", "Sort by Number of Guests", "Sort by Event Type"};

        // Input event data
        for (int i = 0; i < events.length; i++) {
            String eventNumber = JOptionPane.showInputDialog("Enter Event Number:");
            int numOfGuests = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Guests:"));
            String phoneNumber = JOptionPane.showInputDialog("Enter Phone Number:");
            int eventType = Integer.parseInt(JOptionPane.showInputDialog("Enter Event Type (0=Wedding, 1=Baptism, 2=Birthday, 3=Corporate, 4=Other):"));
            events[i] = new Event(eventNumber, numOfGuests, phoneNumber, eventType);
        }

        // Continue sorting and displaying until user chooses to quit
        boolean continueSorting = true;
        while (continueSorting) {
            String choice = (String) JOptionPane.showInputDialog(null, "Choose sorting option:", "Sort Events", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case "Sort by Event Number":
                    Arrays.sort(events, Comparator.comparing(Event::getEventNumber));
                    break;
                case "Sort by Number of Guests":
                    Arrays.sort(events, Comparator.comparingInt(Event::getNumOfGuests));
                    break;
                case "Sort by Event Type":
                    Arrays.sort(events, Comparator.comparingInt(Event::getEventType));
                    break;
                default:
                    continueSorting = false;
                    break;
            }

            // Display sorted events
            StringBuilder output = new StringBuilder();
            for (Event event : events) {
                output.append(event.toString()).append("\n-------------------\n");
            }
            JOptionPane.showMessageDialog(null, output.toString(), "Sorted Events", JOptionPane.INFORMATION_MESSAGE);

            // Ask if the user wants to continue sorting
            int response = JOptionPane.showConfirmDialog(null, "Do you want to continue sorting?", "Continue", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION) {
                continueSorting = false;
            }
        }
    }
}
