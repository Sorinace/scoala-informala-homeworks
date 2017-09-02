package ro.scoalainformala.gr8.java;

public class Dealership {
    private String name;
    private Stock[] stocks;
    private PurchaseOrder order;
    private String error;
    private GreenBonusProgram program = new GreenBonusProgram();

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
            if (car.equals(item.getCarName())) {
                if (item.getCarNumber() > 0) {
                    return true;
                }
            }
        }
        return true;
    }

    /**
     * Get a Purchase Order for new car (with bonus) from the dealer;
     *
     * @param stock is the chosen car stock;
     * @param buyer it is the customers.
     * @return the Purchase Order or null is some error is appear at the check;
     */
    public PurchaseOrder getPurchaseOrder(Stock stock, Customer buyer) {
        if (isCarInStock(stock.getCar())) {
            if (stock.getCar().getNewStatus()) {
                if (program.checkFoundsEnough()) {
                    program.getGreenBonus(new BonusReceived(buyer.getName(), name, stock.getCarName(),
                            stock.getCarManufacturer()));
                    stock.setCarPrice(stock.getCarPrice() - 10_000);
                    if (buyer.itIsEnoughFonds(stock.getCarPrice())) {
                        order = new PurchaseOrder(stock, buyer);
                        setNewNoOfCars(stock.getCar());
                        return order;
                    } else {
                        error = "The customer don't have enough money!";
                    }
                } else {
                    error = "It is not enough founds for bonus!";
                }
            } else {
                error = "You can't get bonus because the car is not NEW!";
            }
        } else {
            error = "The car is not in stock!";
        }
        return null;
    }

    /**
     * Get a Purchase Order for a car (without bonus) from the dealer;
     *
     * @param stock is the chosen car stock;
     * @param buyer it is the customers.
     * @return the Purchase Order or null is some error is appear at the check;
     */
    public PurchaseOrder getPurchaseFullPriceOrder(Stock stock, Customer buyer) {
        if (isCarInStock(stock.getCar())) {
            if (buyer.itIsEnoughFonds(stock.getCarPrice())) {
                order = new PurchaseOrder(stock, buyer);
                setNewNoOfCars(stock.getCar());
                return order;
            } else {
                error = "The customer don't have enough money!";
            }
        } else {
            error = "The car is not in stock!";
        }
        return null;
    }

    /**
     * Get the error which appear during the Purchase Order process.
     *
     * @return the error explanation;
     */
    public String getError() {
        return error;
    }

    /**
     * Change the number of cars (decrease with one) if the car in bayed;
     *
     * @param car the chosen car;
     */
    public void setNewNoOfCars(Car car) {
        for (Stock item : stocks) {
            if (car.getCarName().equals(item.getCar().getCarName())) {
                item.setNoOfCars();
                break;
            }
        }
    }
}
