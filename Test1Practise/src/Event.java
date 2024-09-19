public class Event {
    private String eventNumber;
    private int numOfGuests;
    private double pricePerGuest;
    private double totalPrice;
    private String phoneNumber;
    private int eventType;

    // Array of event types
    public static final String[] EVENT_TYPES = {"Wedding", "Baptism", "Birthday", "Corporate", "Other"};

    // Constructor
    public Event(String eventNumber, int numOfGuests, String phoneNumber, int eventType) {
        this.eventNumber = eventNumber;
        this.numOfGuests = numOfGuests;
        this.pricePerGuest = 35.0;
        this.phoneNumber = phoneNumber;
        this.setEventType(eventType);  // Set the event type with validation
        this.totalPrice = this.numOfGuests * this.pricePerGuest;
    }

    // Getters and Setters
    public String getEventNumber() {
        return eventNumber;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Set and Get Event Type
    public void setEventType(int eventType) {
        if (eventType < 0 || eventType >= EVENT_TYPES.length) {
            this.eventType = EVENT_TYPES.length - 1; // Set to "Other" if invalid
        } else {
            this.eventType = eventType;
        }
    }

    public int getEventType() {
        return eventType;
    }

    public String getEventTypeString() {
        return EVENT_TYPES[this.eventType];
    }

    @Override
    public String toString() {
        return "Event Number: " + eventNumber +
                "\nGuests: " + numOfGuests +
                "\nPrice per Guest: $" + pricePerGuest +
                "\nTotal Price: $" + totalPrice +
                "\nPhone: " + phoneNumber +
                "\nEvent Type: " + getEventTypeString();
    }
}
