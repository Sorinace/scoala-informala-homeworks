package ro.scoalainformala.gr8.java;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestList {
    @Test
    public void testFilterCarInStock() {
        ArrayList<Stock> stock = new ArrayList<Stock>();
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.1", 2016, 75,
                90, 300, 30, 150, true, true),
                3, 33000));
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.2", 2016, 70,
                87, 350, 27, 180, true, true),
                0, 30000));
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.3", 2014, 55,
                65, 250, 27, 130, true, false),
                1, 14000));
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.4", 2017, 100,
                130, 550, 40, 310, false, true),
                3, 43000));
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.5", 2016, 80,
                97, 450, 37, 210, true, true),
                3, 38000));
        stock.add(new Stock());

    List list = new List(stock);

    assertEquals(true,list.getStockItem(1).

    getCarName().

    equals("Car 1.2"));
        list.filterCarInStock();

    assertEquals(true,list.getStockItem(1).

    getCarName().

    equals("Car 1.3"));
}

    @Test
    public void testFilterNewCar() {
        ArrayList<Stock> stock = new ArrayList<Stock>();
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.1", 2016, 75,
                90, 300, 30, 150, true, true),
                3, 33000));
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.2", 2016, 70,
                87, 350, 27, 180, true, true),
                0, 30000));
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.3", 2014, 55,
                65, 250, 27, 130, true, false),
                1, 14000));
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.4", 2017, 100,
                130, 550, 40, 310, false, true),
                3, 43000));
        stock.add(new Stock(new Car("Manufactor 1", "Car 1.5", 2016, 80,
                97, 450, 37, 210, true, true),
                3, 38000));
        List list = new List(stock);

        assertEquals(false, list.getStockItem(2).getNewStatus());
        list.filterNewCars();
        assertEquals(true, list.getStockItem(2).getNewStatus());
    }
}
