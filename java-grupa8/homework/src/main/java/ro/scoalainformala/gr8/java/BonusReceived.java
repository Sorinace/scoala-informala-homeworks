package ro.scoalainformala.gr8.java;

public class BonusReceived {
    private String customerName;
    private String dealershipName;
    private String carManufacturer;
    private String carModel;

    public BonusReceived(String customerName, String dealershipName, String carManufacturer, String carModel) {
        this.customerName = customerName;
        this.dealershipName = dealershipName;
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
    }

    public void add(BonusReceived bonus) {
        this.customerName = bonus.customerName;
        this.dealershipName = bonus.dealershipName;
        this.carManufacturer = bonus.carManufacturer;
        this.carModel = bonus.carModel;
    }
}
