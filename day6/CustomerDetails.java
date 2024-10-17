package day6;

public class CustomerDetails implements BonusPoints, DoorDelivery {
    private String customerName;
    private long phoneNumber;
    private String streetName;
    private double billAmount;
    private int distance;

    public CustomerDetails(String customerName, long phoneNumber, String streetName, double billAmount, int distance) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.streetName = streetName;
        this.billAmount = billAmount;
        this.distance = distance;
    }

    public CustomerDetails() {}

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double deliveryCharge() {
        if (distance >= 25) {
            return distance * 8;
        } else if (distance >= 15 && distance < 25) {
            return distance * 5;
        } else {
            return distance * 2;
        }
    }

    @Override
    public double calculateBonusPoints() {
        if (billAmount >= 250) {
            return billAmount / 10;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Customer Name: " + customerName + "\nPhone Number: " + phoneNumber + "\nStreet Name: " + streetName
                + "\nBonus Points: " + calculateBonusPoints() + "\nDelivery Charge: " + deliveryCharge();
    }
}

