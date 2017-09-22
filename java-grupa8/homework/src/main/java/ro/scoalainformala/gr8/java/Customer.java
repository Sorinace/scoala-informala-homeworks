package ro.scoalainformala.gr8.java;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int founds;
    private Dealership[] dealer;
    private List list = new List(new ArrayList<Stock>());

    /**
     * Constructor for customers;
     *
     * @param name   the buyer name;
     * @param founds haw many money the customer have for buying the car;
     */
    public Customer(String name, int founds) {
        this.name = name;
        this.founds = founds;
    }

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
     * Seating the customer dealers.
     *
     * @param dealer is the dealer array.
     */
    public void setDealer(Dealership[] dealer) {
        this.dealer = dealer;
    }

    /**
     * Ask each dealer for the cars list they seal, and copy to a list;
     */
    public void getListFromDealer() {
        for (Dealership item : dealer) {
            list.addToList(item.getList());
        }
    }

    /**
     * Get list and the stock with all the cars.
     *
     * @return the stock list;
     */
    public ArrayList<Stock> getList() {
        return list.getStock();
    }

    /**
     * Filter the list and take out the old cars;
     */
    public void filterNewCars() {
        list.filterNewCars();
    }

    /**
     * Filter the list and take out the car which are not in stock;
     */
    public void filterCarInStock() {
        list.filterCarInStock();
    }
}
