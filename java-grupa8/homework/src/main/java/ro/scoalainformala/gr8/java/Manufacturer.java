package ro.scoalainformala.gr8.java;

public class Manufacturer {
    private String name;
    private String address;

    public void copy(Manufacturer manufacturer) {
        this.name = manufacturer.name;
        this.address = manufacturer.address;
    }
}
