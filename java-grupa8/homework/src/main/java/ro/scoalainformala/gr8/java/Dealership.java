package ro.scoalainformala.gr8.java;

public class Dealership {
    private String name;
    private Stock[] stocks;

    /**
     * Dealership constructor
     *
     * @param name, the name of the dealership.
     */
    public Dealership(String name, Stock[] stocks) {
        this.name = name;
        this.stocks = stocks;
    }

    /**
     * Get the stock list of this dealer;
     *
     * @return a stock list of cars which this dealer is sealing;
     */
    public List getList() {
        return new List(stocks);
    }

    /**
     * Check if the car chosen is in stock on the dealer;
     *
     * @param car the chosen car which stock number is checked;
     * @return true if the car is in stock of false if is not;
     */
    public boolean isCarInStock(Car car) {
        for (Stock item : stocks) {
            if (car.equalsName(item.getCarName())) {
                if (item.getCarNumber() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
