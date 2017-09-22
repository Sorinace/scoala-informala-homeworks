package ro.scoalainformala.gr8.java;

import java.util.ArrayList;

public class List {
    private ArrayList<Stock> stock;

    /**
     * It is constructor of the List class;
     *
     * @param stock it is the stocks contain in this list (it is a list of stocks);
     */
    public List(ArrayList<Stock> stock) {
        this.stock = stock;
    }

    /**
     * The parameter list is added (copied) in this one;
     *
     * @param toAddStock it is stock array list from one dealer;
     */
    public void addToList(ArrayList<Stock> toAddStock) {
        for (Stock item : toAddStock) {
            stock.add(item);
        }
    }

    /**
     * Is getting the list of stocks of all dealers;
     *
     * @return the stock array;
     */
    public ArrayList<Stock> getStock() {
        return stock;
    }

    /**
     * Get one stock, find on the specific position in array;
     *
     * @param position the position of the stock request;
     * @return the stock find on the specific position in array;
     */
    public Stock getStockItem(int position) {
        return stock.get(position);
    }

    /**
     * Delete the car which ar not in stock;
     */
    public void filterCarInStock() {
        for (int i=0; i<stock.size(); i++) {
            if (stock.get(i) != null) {
                if (stock.get(i).getCarNumber() < 1) {
                    stock.remove(i);
                }
            }
        }
    }

    /**
     * Delete the car which ar not new;
     */

    public void filterNewCars() {
        for (int i=0; i<stock.size(); i++) {
            if (stock.get(i) != null && stock.get(i).getCar() != null) {
                if (!stock.get(i).getNewStatus()) {
                    stock.remove(i);
                }
            }
        }
    }
}