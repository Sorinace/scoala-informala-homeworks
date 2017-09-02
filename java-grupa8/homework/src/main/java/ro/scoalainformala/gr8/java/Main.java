package ro.scoalainformala.gr8.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer buyer = new Customer("The Buyer", 50_000);

        setData(buyer);
        buyer.getListFromDealer();
        System.out.println("Print the list of cars:");
        printList(buyer);
        Scanner in = new Scanner(System.in);
        System.out.print("\nDo you want to see only the new cars?(y/n): ");
        if (in.next().toLowerCase().equals("y")) {
            buyer.filterNewCars();
            printList(buyer);
        }
        System.out.print("\nDo you want to see only the car in stock?(y/n): ");
        if (in.next().toLowerCase().equals("y")) {
            buyer.filterCarInStock();
            printList(buyer);
        }
    }

    private static void printList(Customer buyer) {
        int i;
        i = 0;
        for (Stock item : buyer.getList()) {
            if (item != null) {
                System.out.println(++i + " " + item.getCarManufacturer() + ", " + item.getCarName() + ", " + item.getCarPrice());
            }
        }
    }

    private static void setData(Customer buyer) {
        Stock[] stock1 = {new Stock(new Car("Manufactor 1", "Car 1.1", 2016, 75,
                90, 300, 30, 150, true, true),
                3, 33_000),
                new Stock(new Car("Manufactor 1", "Car 1.2", 2016, 70,
                        87, 350, 27, 180, true, true),
                        1, 30_000),
                new Stock(new Car("Manufactor 1", "Car 1.3", 2014, 55,
                        65, 250, 27, 130, true, false),
                        1, 14_000),
                new Stock(new Car("Manufactor 1", "Car 1.4", 2017, 100,
                        130, 550, 40, 310, false, true),
                        3, 43_000),
                new Stock(new Car("Manufactor 1", "Car 1.5", 2016, 80,
                        97, 450, 37, 210, true, true),
                        3, 38_000),
        };

        Stock[] stock2 = {new Stock(new Car("Manufactor 2", "Car 2.1", 2016, 75,
                90, 300, 30, 150, true, true),
                3, 33_000),
                new Stock(new Car("Manufactor 2", "Car 2.2", 2016, 70,
                        87, 350, 27, 180, true, true),
                        1, 30_000),
                new Stock(new Car("Manufactor 2", "Car 2.3", 2014, 55,
                        65, 250, 27, 130, true, false),
                        0, 14_000),
                new Stock(new Car("Manufactor 2", "Car 2.4", 2017, 100,
                        130, 550, 40, 310, false, true),
                        3, 43_000),
                new Stock(new Car("Manufactor 2", "Car 2.5", 2016, 80,
                        97, 450, 37, 210, true, true),
                        3, 38_000),
        };

        Stock[] stock3 = {new Stock(new Car("Manufactor 3", "Car 3.1", 2016, 75,
                90, 300, 30, 150, true, true),
                3, 33_000),
                new Stock(new Car("Manufactor 3", "Car 3.2", 2016, 70,
                        87, 350, 27, 180, true, true),
                        1, 30_000),
                new Stock(new Car("Manufactor 3", "Car 3.3", 2014, 55,
                        65, 250, 27, 130, true, false),
                        1, 14_000),
                new Stock(new Car("Manufactor 3", "Car 3.4", 2017, 100,
                        130, 550, 40, 310, false, true),
                        3, 43_000),
                new Stock(new Car("Manufactor 3", "Car 3.5", 2016, 80,
                        97, 450, 37, 210, true, true),
                        0, 38_000),
        };

        Stock[] stock4 = {new Stock(new Car("Manufactor 4", "Car 4.1", 2016, 75,
                90, 300, 30, 150, true, true),
                3, 33_000),
                new Stock(new Car("Manufactor 4", "Car 4.2", 2016, 70,
                        87, 350, 27, 180, true, true),
                        1, 30_000),
                new Stock(new Car("Manufactor 4", "Car 4.3", 2014, 55,
                        65, 250, 27, 130, true, false),
                        1, 14_000),
                new Stock(new Car("Manufactor 4", "Car 4.4", 2017, 100,
                        130, 550, 40, 310, false, true),
                        3, 43_000),
                new Stock(new Car("Manufactor 4", "Car 4.5", 2016, 80,
                        97, 450, 37, 210, true, true),
                        3, 38_000),
        };

        Stock[] stock5 = {new Stock(new Car("Manufactor 5", "Car 5.1", 2016, 75,
                90, 300, 30, 150, true, true),
                3, 33_000),
                new Stock(new Car("Manufactor 5", "Car 5.2", 2016, 70,
                        87, 350, 27, 180, true, true),
                        1, 30_000),
                new Stock(new Car("Manufactor 5", "Car 5.3", 2014, 55,
                        65, 250, 27, 130, true, false),
                        1, 14_000),
                new Stock(new Car("Manufactor 5", "Car 5.4", 2017, 100,
                        130, 550, 40, 310, false, true),
                        0, 43_000),
                new Stock(new Car("Manufactor 5", "Car 5.5", 2016, 80,
                        97, 450, 37, 210, true, true),
                        3, 38_000),
        };

        Dealership[] dealers = {new Dealership("dealer1", stock1), new Dealership("dealer2", stock2),
                new Dealership("dealer3", stock3), new Dealership("dealer4", stock4),
                new Dealership("dealer5", stock5)};
        buyer.setDealer(dealers);
    }


}