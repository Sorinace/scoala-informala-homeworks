package ro.scoalainformala.gr8.java;

public class Stock {
    private Dealership dealer = null;
    private Car carType;
    private int noOfCars;
    private float price;

    /**
     * It is the Stock constructor;
     *
     * @param carType  it is the Car;
     * @param noOfCars it is the numbers of those cars in stock;
     * @param price    it is the full price of this car;
     */
    public Stock(Car carType, int noOfCars, int price) {
        this.carType = carType;
        this.noOfCars = noOfCars;
        this.price = price;
    }

    /**
     * Get the numbers of cars in stock;
     *
     * @return the numbers of cars in stock;
     */
    public int getCarNumber() {
        return noOfCars;
    }

    /**
     * Copy the stock values in this stock;
     *
     * @param stock  it contain the stock values;
     * @param dealer it is the dealer where this stock exist;
     */
    public void copy(Stock stock, Dealership dealer) {
        this.carType.copy(stock.carType);
        this.noOfCars = stock.noOfCars;
        this.price = stock.price;
        this.dealer = dealer;
    }

    /**
     * Get the car object (all the data of this car);
     *
     * @return the car object;
     */
    public Car getCar() {
        return carType;
    }

    /**
     * Get the manufacturer name of this car;
     *
     * @return the manufacturer name;
     */
    public String getCarManufacturer() {
        return carType.getCarManufacturer();
    }

    /**
     * Get the price of this car;
     *
     * @return price of this car;
     */
    public float getCarPrice() {
        return price;
    }

    /**
     * Get the dealer name, which seal this car;
     *
     * @return the dealer name;
     */
    public Dealership getDealer() {
        return dealer;
    }

    /**
     * Decrease the number of car in stock with one;
     */
    public void setNoOfCars() {
        noOfCars--;
    }

    /**
     * Decrese the price of this car with the bonus value;
     *
     * @param bonus it is a bonus get for new electrical cars;
     */
    public void setCarPrice(float bonus) {
        price -= bonus;
    }

    /**
     * Get the car name / model name;
     *
     * @return car name;
     */
    public String getCarName() {
        return carType.getCarName();
    }
}
