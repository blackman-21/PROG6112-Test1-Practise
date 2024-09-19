public class Die {
    private int value;

    public Die() {
        this.value = 1 + (int)(Math.random() * 6); // Set value from 1 to 6
    }

    public int getValue() {
        return value;
    }
}
