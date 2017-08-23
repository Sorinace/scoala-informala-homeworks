package ro.scoalainformala.gr8.java;

public class Stock {
    private Car carType;
    private String dealershipName;
    private int strockNo;
    private int price;

    public void addToStock(int numberOfCars) {

        strockNo += numberOfCars;
    }

    public void soldCars(int numbersOfCars) {

        strockNo -= numbersOfCars;
    }

    public String getCarName() {

        return carType.getCarName();
    }

    public int getNumber() {

        return strockNo;
    }

    public void copy(Stock stock) {
        this.carType.copy(stock.carType);
        this.dealershipName = stock.dealershipName;
        this.strockNo = stock.strockNo;
        this.price = stock.price;
    }
}
