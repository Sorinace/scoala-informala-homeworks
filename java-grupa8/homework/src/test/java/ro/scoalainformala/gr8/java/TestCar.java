package ro.scoalainformala.gr8.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCar {

    @Test
    public void testCarMethods() {
        Car car1 = new Car("manufactor", "Car", 1971, 100, 100,
                177, 32,133, false, true);;
        Car car2 = new Car(car1);

        assertEquals(true, car1.getCarName().equals(car2.getCarName()));
        assertEquals(true, car1.getNewStatus() == car2.getNewStatus());
        assertEquals(true,car1.getCarManufacturer() == car2.getCarManufacturer());
        assertEquals(true,car1.equalsName(car2.getCarName()));
        assertEquals(true,car1.equals(car1));
    }

}

