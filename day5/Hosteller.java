package day5;

public class Hosteller extends Student {
    private int roomNumber;
    private char blockName;
    private String roomType;

    // Constants for room type fees
    private static final double ROOM_TYPE_FEE_AC = 8000;
    private static final double ROOM_TYPE_FEE_NON_AC = 0; // Non-AC rooms have no additional fee

    public Hosteller() {
        super();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public char getBlockName() {
        return blockName;
    }

    public void setBlockName(char blockName) {
        this.blockName = blockName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Hosteller(int studentId, String studentName, String department, String gender, String category,
                     double collegeFee, int roomNumber, char blockName, String roomType) {
        super(studentId, studentName, department, gender, category, collegeFee);
        this.roomNumber = roomNumber;
        this.blockName = blockName;
        this.roomType = roomType;
    }

    @Override
    public double calculateTotalFee() {
        double hostelFee = 0;

        // Define the hostel fees based on blockName
        if (blockName == 'A') {
            hostelFee = 60000;
        } else if (blockName == 'B') {
            hostelFee = 50000;
        } else if (blockName == 'C') {
            hostelFee = 40000;
        }

        // Determine room type fee
        double roomTypeFee = roomType.equals("AC") ? ROOM_TYPE_FEE_AC : ROOM_TYPE_FEE_NON_AC;

        return collegeFee + hostelFee + roomTypeFee;
    }
}
