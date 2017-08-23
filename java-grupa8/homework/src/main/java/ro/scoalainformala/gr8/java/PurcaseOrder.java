package ro.scoalainformala.gr8.java;

public class PurcaseOrder {
    private Customer buyer;
    private Car selectedCar;
    private int price;

    public PurcaseOrder(Car selectedCar, Customer buyer, int price) {
        this.buyer = buyer;
        this.selectedCar = selectedCar;
        this.price = price;
    }

    /*public PurcaseOrder newBonusOrder() {
        price -= 10_000;
        return new PurcaseOrder(selectedCar, buyer, price);
    }

    public PurcaseOrder newFullPriceOrder() {
        return new PurcaseOrder(selectedCar, buyer, price);
    }
*/
}
