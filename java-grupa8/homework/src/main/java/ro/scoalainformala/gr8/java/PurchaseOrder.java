package ro.scoalainformala.gr8.java;

/**
 * @author Sorin
 */
public class PurchaseOrder {
    private Customer buyer;
    private Car selectedCar;
    private float price;

    /**
     * It is constructor of the PurchaseOrder class;
     *
     * @param stock is the stock of chosen car;
     * @param buyer is the customers which buy this car;
     */
    public PurchaseOrder(Stock stock, Customer buyer) throws OutOfStockException, EnoughFoundsException {
        if (stock.getCarNumber() < 1) {
            throw new OutOfStockException("This car it out of stock");
        } else if (!buyer.itIsEnoughFonds(stock.getCarPrice())) {
            throw new EnoughFoundsException("You don't have enough money for this car!");
        } else {
            this.buyer = buyer;
            this.selectedCar = stock.getCar();
            this.price = stock.getCarPrice();
        }
    }

    /**
     * It is constructor of the PurchaseOrder class;
     *
     * @param stock is the stock of chosen car;
     * @param buyer is the customers which buy this car;
     */
    public PurchaseOrder(Stock stock, Customer buyer, int bonus) throws OutOfStockException, EnoughFoundsException {
        if (stock.getCarNumber() < 1) {
            throw new OutOfStockException("This car it out of stock");
        } else if (!buyer.itIsEnoughFonds(stock.getCarPrice() - bonus)) {
            throw new EnoughFoundsException("You don't have enough money for this car!");
        } else {
            this.buyer = buyer;
            this.selectedCar = stock.getCar();
            this.price = stock.getCarPrice() - bonus;
        }
    }

    @Override
    public String toString() {
        return "Purchase Order" +
                "\nbuyer = " + buyer.getName() +
                "\nselected car = " + selectedCar.getCarName() +
                "\nprice = " + price + " $";
    }
}
