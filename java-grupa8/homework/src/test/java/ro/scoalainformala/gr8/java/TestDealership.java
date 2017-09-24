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

    @Test(expected = BonusException.class)
    public void testGetBonus() throws BonusException {
        Stock st = new Stock(new Car("Manufactor", "Logan", 2014, 55,
                65, 340, 27, 130, true, false),
                1, 14000);
        ArrayList<Stock> stoks = new ArrayList<Stock>();
        stoks.add(st);
        Dealership dealer = new Dealership("Dealer",stoks);

        for (int i=0; i<1001;i++){
            dealer.getBonus(st,"Nelu");
        }
    }
}
