package ro.scoalainformala.gr8.java;

public class List {
    private Stock[] stock;
    private int numbersOfCar = 0;

    /**
     * It is constructor of the List class;
     *
     * @param stock it is the stocks contain in this list (it is a list of stocks);
     */
    public List(Stock[] stock) {
        this.stock = stock;
    }

    /**
     * The parameter list is added (copied) in this one;
     *
     * @param list   it is stock list from one dealer;
     * @param dealer it is the dealer from where is this stock;
     */
    public void addToList(List list, Dealership dealer) {
        for (int i = 0; i < list.stock.length; i++) {
            stock[numbersOfCar] = new Stock();
            stock[numbersOfCar].copy(list.stock[i]);
            numbersOfCar++;
        }
    }

    /**
     * Is getting the list of stocks of all dealers;
     *
     * @return the stock array;
     */
    public Stock[] getStock() {
        return stock;
    }

    /**
     * Get one stock, find on the specific position in array;
     *
     * @param position the position of the stock request;
     * @return the stock find on the specific position in array;
     */
    public Stock getStockItem(int position) {
        return stock[position];
    }

    /**
     * Delete the car which ar not in stock;
     */
    public void filterCarInStock() {
        for (Stock item : stock) {
            if (item != null) {
                if (item.getCarNumber() < 1) {
                    delete(item);
                }
            }
        }
    }

    /**
     * Delete the car which ar not new;
     */

    public void filterNewCars() {
        for (Stock item : stock) {
            if (item != null && item.getCar() != null) {
                if (!item.getNewStatus()) {
                    delete(item);
                }
            }
        }
    }

    /**
     * Delete the car from list;
     */
    private void delete(Stock item) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == item) {
                if (i < stock.length - 1) {
                    for (int j = i; j < stock.length - 1; j++) {
                        stock[j] = stock[j + 1];
                    }
                } else {
                    stock[i] = null;
                }
            }
        }
        stock[stock.length - 1] = null;
    }
}
