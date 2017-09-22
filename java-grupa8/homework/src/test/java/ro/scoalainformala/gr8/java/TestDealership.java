package ro.scoalainformala.gr8.java;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestDealership {
    @Test
    public void testIsCarInStock() {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setName("Masina1");
        car2.setName("Masina2");
        ArrayList<Stock> stock = new ArrayList<Stock>();

        stock.add(new Stock(car1,1,30000));
        stock.add(new Stock(car2,0,30000));

        Dealership dealer = new Dealership("",stock);

        assertEquals(true, dealer.isCarInStock(car1));
        assertEquals(false, dealer.isCarInStock(car2));
    }
}
