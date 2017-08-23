package ro.scoalainformala.gr8.java;

public class List {
    private Stock[] stock;
    private int numbersOfCar = 0;

    public List(Stock[] stock) {
        this.stock = stock;
    }

    public void addToList(List list) {
        int i = 0;
        for(Stock item : list.stock){
            this.stock[numbersOfCar + i].copy(list.stock[i]);
            i++;
        }
    }
}
