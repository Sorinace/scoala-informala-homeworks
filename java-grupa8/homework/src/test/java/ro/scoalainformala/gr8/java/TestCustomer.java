package ro.scoalainformala.gr8.java;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCustomer {
    @Test
    public void testItIsEnoughFonds() {
        Customer buyer = new Customer("John Don", 40000);

        assertEquals(true, buyer.itIsEnoughFonds(20000));
        assertEquals(false,buyer.itIsEnoughFonds(40001));
    }
}
