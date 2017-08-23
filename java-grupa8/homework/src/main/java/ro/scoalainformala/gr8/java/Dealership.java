package ro.scoalainformala.gr8.java;

public class Dealership {
    private String name;
    private Manufacturer[] manufacturer;
    private Stock[] stocks;
    private Customer[] customers;
    private PurcaseOrder[] orders = new PurcaseOrder[1000];
    private int purchaseNo = 0;

    public List getList() {

        return new List(stocks);
    }

    public String getName() {

        return name;
    }

    public boolean isCarInStock(Car car) {
        for (Stock item : stocks) {
            if (car.equals(item.getCarName())) {
                if (item.getNumber() > 0) {
                    return true;
                }
            }
        }
        return true;
    }

    public PurcaseOrder getAnBonusOrder(Car car, Customer customer) {

        PurchaseWithBonus order;


        return null;
    }

    public boolean getBonus() {

        return true;
    }
}
