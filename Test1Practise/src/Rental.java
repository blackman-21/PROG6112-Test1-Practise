public class Rental {
    private String contractNumber;
    private double price;
    private int rentalHours;
    private int equipmentType;

    // Array of equipment types
    public static final String[] EQUIPMENT_TYPES = {"Personal Watercraft", "Pontoon Boat", "Rowboat", "Canoe", "Kayak", "Beach Chair", "Umbrella", "Other"};

    // Constructor
    public Rental(String contractNumber, int rentalHours, int equipmentType) {
        this.contractNumber = contractNumber;
        this.rentalHours = rentalHours;
        this.price = rentalHours * 40.0; // Price is $40 per hour
        this.setEquipmentType(equipmentType);
    }

    // Getters and Setters
    public String getContractNumber() {
        return contractNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getRentalHours() {
        return rentalHours;
    }

    // Set and Get Equipment Type
    public void setEquipmentType(int equipmentType) {
        if (equipmentType < 0 || equipmentType >= EQUIPMENT_TYPES.length) {
            this.equipmentType = EQUIPMENT_TYPES.length - 1; // Set to "Other" if invalid
        } else {
            this.equipmentType = equipmentType;
        }
    }

    public int getEquipmentType() {
        return equipmentType;
    }

    public String getEquipmentTypeString() {
        return EQUIPMENT_TYPES[this.equipmentType];
    }

    @Override
    public String toString() {
        return "Contract Number: " + contractNumber +
                "\nRental Hours: " + rentalHours +
                "\nPrice: $" + price +
                "\nEquipment Type: " + getEquipmentTypeString();
    }
}
