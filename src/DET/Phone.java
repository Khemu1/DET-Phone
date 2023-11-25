package DET;

public class Phone {
    String phoneNumber;
    boolean hasAddedValueServices;

    public Phone(String phoneNumber, boolean hasAddedValueServices) {
        this.phoneNumber = phoneNumber;
        this.hasAddedValueServices = hasAddedValueServices;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean hasAddedValueServices() {
        return hasAddedValueServices;
    }
}
