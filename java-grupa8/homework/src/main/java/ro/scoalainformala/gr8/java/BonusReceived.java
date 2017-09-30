package ro.scoalainformala.gr8.java;

public class BonusReceived {
    private String customerName;
    private String dealershipName;
    private String carManufacturer;
    private String carModel;

    /**
     * It is constructor of this object;
     *
     * @param customerName    the name of buyer;
     * @param dealershipName  the name of dealership hwo ask for this bonus in the byer name;
     * @param carManufacturer producer of the car;
     * @param carModel        car type / model;
     */
    public BonusReceived(String customerName, String dealershipName, String carManufacturer, String carModel) {
        this.customerName = customerName;
        this.dealershipName = dealershipName;
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
    }

    /**
     * This method add the data in the Green Bonus history;
     *
     * @param bonus it is identify who get the bonus, the name of customers, dealer, manufacturer and car model;
     */
    public void add(BonusReceived bonus) {
        this.customerName = bonus.customerName;
        this.dealershipName = bonus.dealershipName;
        this.carManufacturer = bonus.carManufacturer;
        this.carModel = bonus.carModel;
    }
}
