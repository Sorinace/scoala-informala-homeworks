package ro.scoalainformala.gr8.java;

import java.util.ArrayList;

/**
 * @author Sorin
 */
public class Dealership {
    private String name;
    GreenBonusProgram program = new GreenBonusProgram();
    private ArrayList<Stock> stocks;

    /**
     * Dealership constructor
     *
     * @param name, the name of the dealership.
     */
    public Dealership(String name, ArrayList<Stock> stocks) {
        this.name = name;
        this.stocks = stocks;
    }

    /**
     * Get the stock list of this dealer;
     *
     * @return a stock list of cars which this dealer is sealing;
     */
    public ArrayList<Stock> getList() {
        return stocks;
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

    /**
     * This method get the bonus.
     *
     * @param stock is the stock car customer want to buy;
     * @param buyer the name of the customer;
     * @return the value of the bonus;
     */
    public int getBonus(Stock stock, Customer buyer) throws BonusException, UsedCarException {
        if (!stock.getNewStatus()) {
            throw new UsedCarException("Green Bonus program didn't allow you to buy old electrical cars!");
        } else if (program.checkFoundsEnough()) {
            return program.getGreenBonus(new BonusReceived(buyer.getName(), name, stock.getCar().getCarManufacturer(), stock.getCarName()));
        } else {
            throw new BonusException("Green Bonus program has no money!");
        }
    }
}
