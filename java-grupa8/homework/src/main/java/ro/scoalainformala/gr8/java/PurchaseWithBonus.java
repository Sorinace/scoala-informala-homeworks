package ro.scoalainformala.gr8.java;

public class PurchaseWithBonus extends PurcaseOrder {

    public PurchaseWithBonus(Car selectedCar, Customer buyer, int price) {
        super(selectedCar, buyer, price);
    }

    public PurcaseOrder newBonusOrder() {
        super.price -= 10_000;
        return new PurchaseWithBonus(selectedCar, buyer, price);
    }
}
