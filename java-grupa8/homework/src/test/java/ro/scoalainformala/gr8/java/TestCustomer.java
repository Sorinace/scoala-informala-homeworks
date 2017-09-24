package ro.scoalainformala.gr8.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class TestCustomer {
    @Test
    public void testItIsEnoughFonds() {
        Customer buyer = new Customer("John Don", 40000);

        assertEquals(true, buyer.itIsEnoughFonds(20000));
        assertEquals(false, buyer.itIsEnoughFonds(40001));
    }

    @Test
    public void testGetDealer() {
        Customer buyer = new Customer("Nelu", 10000);
        Stock car = new Stock(new Car("Manufactor 2", "Car 2.2", 2016, 70,
                97, 390, 27, 190, true, true),
                1, 30000);

        ArrayList<Dealership> dealer = new ArrayList<Dealership>();
        ArrayList<Stock> stock1 = new ArrayList<Stock>();
        stock1.add(new Stock(new Car("Manufactor 1", "Car 1.1", 2016, 75,
                90, 311, 30, 150, true, true),
                3, 33000));
        stock1.add(new Stock(new Car("Manufactor 1", "Car 1.2", 2016, 70,
                87, 255, 27, 180, true, true),
                1, 30000));


        ArrayList<Stock> stock2 = new ArrayList<Stock>();
        stock2.add(new Stock(new Car("Manufactor 2", "Car 2.1", 2016, 75,
                92, 340, 30, 130, true, true),
                3, 33000));
        stock2.add(new Stock(new Car("Manufactor 2", "Car 2.2", 2016, 70,
                97, 390, 27, 190, true, true),
                1, 30000));


        ArrayList<Stock> stock3 = new ArrayList<Stock>();
        stock3.add(new Stock(new Car("Manufactor 3", "Car 3.1", 2016, 75,
                95, 330, 30, 175, true, true),
                3, 33000));
        stock3.add(new Stock(new Car("Manufactor 3", "Car 3.2", 2016, 70,
                77, 380, 27, 179, true, true),
                1, 30000));

        dealer.add(new Dealership("dealer1", stock1));
        dealer.add(new Dealership("dealer2", stock2));
        dealer.add(new Dealership("dealer3", stock3));
        buyer.setDealer(dealer);

        assertEquals(true, dealer.contains(buyer.getDealer(car)));
    }
}
