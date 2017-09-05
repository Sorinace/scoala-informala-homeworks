package ro.scoalainformala.gr8.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestDealership {
    @Test
    public void testIsCarInStock() {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setName("Masina1");
        car2.setName("Masina2");
        Stock[] stock = {new Stock(car1,1,30000), new Stock(car2,0,30000)};
        Dealership dealer = new Dealership("",stock);

        assertEquals(true, dealer.isCarInStock(car1));
        assertEquals(false, dealer.isCarInStock(car2));
    }
}
