package ro.scoalainformala.gr8.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStock {
    @Test
    public void testStockCopy(){
        Stock stock1 = new Stock(new Car(),3,33000);
        Stock stock2 = new Stock();

        stock2.copy(stock1);

        assertEquals(true, stock1.getCarPrice() == stock2.getCarPrice());
        assertEquals(true, stock1.getCarNumber() == stock2.getCarNumber());
    }
}
