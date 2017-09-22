package ro.scoalainformala.gr8.java;

public class Stock {
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
     * It is the null Stock constructor;
     */
    public Stock() {
        this.carType = null;
        this.noOfCars = 0;
        this.price = 0;
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
     */
    public void copy(Stock stock) {
        this.carType = new Car();
        this.carType.copy(stock.carType);
        this.noOfCars = stock.noOfCars;
        this.price = stock.price;
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
     * Get the car name / model name;
     *
     * @return car name;
     */
    public String getCarName() {
        return carType.getCarName();
    }

    /**
     * Get the new status.
     *
     * @return true if the car is new.
     */
    public boolean getNewStatus() {
        return carType.getNewStatus();
    }
}
