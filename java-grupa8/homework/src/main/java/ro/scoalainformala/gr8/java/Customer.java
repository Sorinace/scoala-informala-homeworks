package ro.scoalainformala.gr8.java;

public class Customer {
    private String name;
    private int founds = 30_000;
    private Dealership[] dealer;
    private List list = new List(new Stock[100]);
    private PurchaseOrder order;

    /**
     * Check if the customers have enough money to buy the car;
     *
     * @param cost it is the car cost;
     * @return true if costumer have enough money and false if not;
     */
    public boolean itIsEnoughFonds(float cost) {
        if (cost <= founds) {
            return true;
        }
        return false;
    }

    /**
     * Make an order and ask for the bonus!
     *
     * @param stock is the stock of the chosen car.
     * @return the order for this car or null if something go's wrong;
     */
    public PurchaseOrder getAnBonusOrder(Stock stock) {
        order = stock.getDealer().getPurchaseOrder(stock, this);
        return order;
    }

    /**
     * Make an order at the full price, without asking for the bonus!
     *
     * @param stock is the stock of the chosen car.
     * @return the order for this car or null if something go's wrong;
     */
    public PurchaseOrder getAnFullPriceOrder(Stock stock) {
        order = stock.getDealer().getPurchaseFullPriceOrder(stock, this);
        return order;
    }

    /**
     * Ask each dealer for the cars list they seal, and copy to a list;
     */
    public void getListFromDealer() {
        for (Dealership item : dealer) {
            list.addToList(item.getList(), item);
        }
    }

    /**
     * Get list and the stock with all the cars the customers ask for.
     *
     * @return the stock list;
     */
    public Stock[] getList() {
        return list.getStock();
    }

    /**
     * Get the car, price and number of chosen car;
     *
     * @param position the position in the customer list;
     * @return get the stock (the car, price and number) of chosen car;
     */
    public Stock getStockItem(int position) {
        return list.getStockItem(position);
    }

    /**
     * Get the car model name;
     *
     * @return the car model name;
     */
    public String getName() {
        return name;
    }

    /**
     * Get the error from Purchase Order, the explanation why it is not possible
     * to make an Purchase Order;
     *
     * @param stock the stock (the car, price and number) of chosen car;
     * @return the error explanation;
     */
    public String getTheError(Stock stock) {
        return stock.getDealer().getError();
    }
}
