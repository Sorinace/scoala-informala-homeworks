package ro.scoalainformala.gr8.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

import static org.junit.Assert.*;

public class TestDealership {
    @Test
    public void testIsCarInStock() {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setName("Masina1");
        car2.setName("Masina2");
        ArrayList<Stock> stock = new ArrayList<Stock>();

        stock.add(new Stock(car1, 1, 30000));
        stock.add(new Stock(car2, 0, 30000));

        Dealership dealer = new Dealership("", stock);

        assertEquals(true, dealer.isCarInStock(car1));
        assertEquals(false, dealer.isCarInStock(car2));
    }

    @Test(expected = BonusException.class)
    public void testGetBonus() throws BonusException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 1000; i++) {
            BonusTray task = new BonusTray();
            executor.execute(task);
        }
        executor.shutdown();

        while (!executor.isTerminated()) {
            Thread.sleep(100);
        }

        Stock st = new Stock(new Car("Manufactor", "Logan", 2014, 55,
                65, 340, 27, 130, true, true),
                1, 14_000);
        ArrayList<Stock> stoks = new ArrayList<Stock>();
        stoks.add(st);
        Dealership dealer = new Dealership("Dealer", stoks);
        Customer buyer = new Customer("Nelu", 20_000);

        try {
            dealer.getBonus(st, buyer);
        } catch (UsedCarException e) {
            e.printStackTrace();
        }
    }


    class BonusTray implements Runnable {
        @Override
        public void run() {
            Stock st = new Stock(new Car("Manufactor", "Logan", 2014, 55,
                    65, 340, 27, 130, true, true),
                    1, 14_000);
            ArrayList<Stock> stoks = new ArrayList<Stock>();
            stoks.add(st);
            Dealership dealer = new Dealership("Dealer", stoks);
            Customer buyer = new Customer("Nelu", 20_000);

            try {
                dealer.getBonus(st, buyer);
            } catch (UsedCarException e) {
                e.printStackTrace();
            } catch (BonusException e) {
                e.printStackTrace();
            }
        }

    }


    @Test(expected = UsedCarException.class)
    public void testGetBonusOnUsedCar() throws UsedCarException {
        Stock st = new Stock(new Car("Manufactor", "Logan", 2014, 55,
                65, 340, 27, 130, true, false),
                1, 14_000);
        ArrayList<Stock> stoks = new ArrayList<Stock>();
        stoks.add(st);
        Dealership dealer = new Dealership("Dealer", stoks);
        Customer buyer = new Customer("Nelu", 20_000);

        try {
            dealer.getBonus(st, buyer);
        } catch (BonusException e) {
            e.printStackTrace();
        }
    }
}
