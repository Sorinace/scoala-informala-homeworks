package ro.scoalainformala.gr8.java;

public class Customer {
    private String name;
    private String address;
    private int founds;
    private Dealership[] dealer;
    private List list;
    private PurcaseOrder order;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Customer() {

        this("", "");
    }

    public boolean itIsEnoughFonds(int cost) {
        if (cost < founds) {
            return true;
        }
        return false;
    }

    public PurcaseOrder getAnBonusOrder(Car car, Dealership dealership) {

        return dealership.getAnBonusOrder(car, this);
    }

    public PurcaseOrder getAnFullPriceOrder(Car car, Dealership dealership) {

        return dealership.getAnFullPriceOrder(car, this);
    }

    public List getList(){
        List list = new List(new Stock[100]);
        for(Dealership item : dealer){
            list.addToList(item.getList());
        }
        return list;
    }
}
