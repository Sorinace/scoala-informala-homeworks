package ro.scoalainformala.gr8.java;

import java.util.Comparator;

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
     * @param stock it contain the stock values;
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

    /**
     * It is price comparator, which will help to order the ArrayList
     */
    public static Comparator<Stock> SortByPrice = new Comparator<Stock>() {
        public int compare(Stock st1, Stock st2) {
            if (st1.price < st2.price) {
                return -1;
            }
            return 0;
        }
    };
    /**
     * It is range per charge comparator, which will help to order the ArrayList
     */
    public static Comparator<Stock> SortByRangeByCharge = new Comparator<Stock>() {
        public int compare(Stock st1, Stock st2) {
            if (st1.carType.getRange() < st2.carType.getRange()) {
                return -1;
            }
            return 0;
        }
    };
    /**
     * It is horse power comparator, which will help to order the ArrayList
     */
    public static Comparator<Stock> SortByHorsepower = new Comparator<Stock>() {
        public int compare(Stock st1, Stock st2) {
            if (st1.carType.getHorsepower() < st2.carType.getHorsepower()) {
                return -1;
            }
            return 0;
        }
    };

    /**
     * @return the number of cars in stock;
     */
    public int getNoOfCars() {
        return noOfCars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Stock))
            return false;

        Stock stock = (Stock) o;

        if (getNoOfCars() != stock.getNoOfCars())
            return false;
        if (Float.compare(stock.price, price) != 0)
            return false;
        return carType != null ? carType.equals(stock.carType) : stock.carType == null;
    }

    @Override
    public int hashCode() {
        int result = carType != null ? carType.hashCode() : 0;
        result = 31 * result + getNoOfCars();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        return result;
    }
}
