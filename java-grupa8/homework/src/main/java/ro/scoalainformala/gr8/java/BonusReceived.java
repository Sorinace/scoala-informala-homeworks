package ro.scoalainformala.gr8.java;

/**
 * @author Sorin
 */
public class BonusReceived {
    private String customerName;
    private String dealershipName;
    private String carManufacturer;
    private String carModel;

    /**
     * It is constructor of this object;
     *
     * @param customerName    the name of buyer;
     * @param dealershipName  the name of dealership hwo ask for this bonus in the buyer name;
     * @param carManufacturer producer of the car;
     * @param carModel        car type / model;
     */
    public BonusReceived(String customerName, String dealershipName, String carManufacturer, String carModel) {
        this.customerName = customerName;
        this.dealershipName = dealershipName;
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
    }
}
