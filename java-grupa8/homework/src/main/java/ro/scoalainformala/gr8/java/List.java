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
            stock[numbersOfCar].copy(list.stock[i], dealer);
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
}
