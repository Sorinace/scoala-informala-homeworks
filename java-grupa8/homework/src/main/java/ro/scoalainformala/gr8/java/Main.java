package ro.scoalainformala.gr8.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer buyer = new Customer("The Buyer", 50000);
        PurchaseOrder order;
        ArrayList<Dealership> dealers = new ArrayList<Dealership>();
        int bonus = 0;

        setData(buyer, dealers);

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
        System.out.print("\nDo you want to sort list?\n(P - sort by price,R - sort by range by charges, H - sort by horsepower ): ");

        char c = in.next().toLowerCase().charAt(0);
        switch (c) {
            case 'p':
                Collections.sort(buyer.getList(), Stock.SortByPrice);
                break;
            case 'r':
                Collections.sort(buyer.getList(), Stock.SortByRangeByCharge);
                break;
            case 'h':
                Collections.sort(buyer.getList(), Stock.SortByHorsepower);
                break;
            default:
                break;
        }
        printList(buyer);

        System.out.print("\nDo you want to purchase a car at full price?(y/n): ");
        if (in.next().toLowerCase().equals("y")) {
            System.out.print("Please insert the car number: ");
            int no = in.nextInt();
            if (no > 0 && no <= buyer.getList().size()) {
                order = new PurchaseOrder(buyer.getList().get(--no), buyer);
                System.out.println(order.toString());
            }
        }
        System.out.print("\nDo you want to get Green Bonus?(y/n): ");
        if (in.next().toLowerCase().equals("y")) {
            System.out.print("Please insert the car number: ");
            int no = in.nextInt();
            if (no > 0 && no <= buyer.getList().size()) {
                Dealership bonusDealer = buyer.getDealer(buyer.getList().get(--no));
                try {
                    bonus = bonusDealer.getBonus(buyer.getList().get(no), buyer.getName());
                } catch (BonusException e) {

                }
                System.out.println("Bonus = "+bonus);
                order = new PurchaseOrder(buyer.getList().get(no), buyer, bonus);
                System.out.println(order.toString());
            }
        }

    }


    private static void printList(Customer buyer) {
        int i;
        i = 0;
        for (Stock item : buyer.getList()) {
            if (item != null) {
                System.out.println(++i + " " + item.getCarManufacturer() + ", " + item.getCarName() + ", it is new: " +
                        item.getNewStatus() + ", cars in stock = " + item.getNoOfCars() + ", price = "
                        + item.getCarPrice() + "$, range = " + item.getCar().getRange() +
                        " km, power = " + item.getCar().getHorsepower() + " HP");
            }
        }
    }

    private static void setData(Customer buyer, ArrayList<Dealership> dealers) {
        ArrayList<Stock> stock1 = new ArrayList<Stock>();
        stock1.add(new Stock(new Car("Manufactor 1", "Car 1.1", 2016, 75,
                90, 311, 30, 150, true, true),
                3, 33000));
        stock1.add(new Stock(new Car("Manufactor 1", "Car 1.2", 2016, 70,
                87, 255, 27, 180, true, true),
                1, 30000));
        stock1.add(new Stock(new Car("Manufactor 1", "Car 1.3", 2014, 55,
                65, 340, 27, 130, true, false),
                1, 14000));
        stock1.add(new Stock(new Car("Manufactor 1", "Car 1.4", 2017, 100,
                130, 590, 40, 310, false, true),
                3, 43000));
        stock1.add(new Stock(new Car("Manufactor 1", "Car 1.5", 2016, 80,
                97, 410, 37, 210, true, true),
                3, 38000));


        ArrayList<Stock> stock2 = new ArrayList<Stock>();
        stock2.add(new Stock(new Car("Manufactor 2", "Car 2.1", 2016, 75,
                92, 340, 30, 150, true, true),
                3, 33000));
        stock2.add(new Stock(new Car("Manufactor 2", "Car 2.2", 2016, 70,
                97, 390, 27, 180, true, true),
                1, 30000));
        stock2.add(new Stock(new Car("Manufactor 2", "Car 2.3", 2014, 55,
                75, 220, 27, 130, true, false),
                0, 14000));
        stock2.add(new Stock(new Car("Manufactor 2", "Car 2.4", 2017, 100,
                120, 500, 40, 310, false, true),
                3, 43000));
        stock2.add(new Stock(new Car("Manufactor 2", "Car 2.5", 2016, 80,
                92, 400, 37, 210, true, true),
                3, 38000));


        ArrayList<Stock> stock3 = new ArrayList<Stock>();
        stock3.add(new Stock(new Car("Manufactor 3", "Car 3.1", 2016, 75,
                95, 330, 30, 150, true, true),
                3, 33000));
        stock3.add(new Stock(new Car("Manufactor 3", "Car 3.2", 2016, 70,
                77, 380, 27, 180, true, true),
                1, 30000));
        stock3.add(new Stock(new Car("Manufactor 3", "Car 3.3", 2014, 55,
                70, 280, 27, 130, true, false),
                1, 14000));
        stock3.add(new Stock(new Car("Manufactor 3", "Car 3.4", 2017, 100,
                110, 580, 40, 310, false, true),
                3, 43000));
        stock3.add(new Stock(new Car("Manufactor 3", "Car 3.5", 2016, 80,
                88, 480, 37, 210, true, true),
                0, 38000));

        ArrayList<Stock> stock4 = new ArrayList<Stock>();
        stock4.add(new Stock(new Car("Manufactor 4", "Car 4.1", 2016, 75,
                100, 300, 30, 150, true, true),
                3, 33000));
        stock4.add(new Stock(new Car("Manufactor 4", "Car 4.2", 2016, 70,
                82, 350, 27, 180, true, true),
                1, 30000));
        stock4.add(new Stock(new Car("Manufactor 4", "Car 4.3", 2014, 55,
                62, 250, 27, 130, true, false),
                1, 14000));
        stock4.add(new Stock(new Car("Manufactor 4", "Car 4.4", 2017, 100,
                125, 550, 40, 310, false, true),
                3, 43000));
        stock4.add(new Stock(new Car("Manufactor 4", "Car 4.5", 2016, 80,
                111, 450, 37, 210, true, true),
                3, 38000));


        ArrayList<Stock> stock5 = new ArrayList<Stock>();
        stock5.add(new Stock(new Car("Manufactor 5", "Car 5.1", 2016, 75,
                89, 310, 30, 150, true, true),
                3, 33000));
        stock5.add(new Stock(new Car("Manufactor 5", "Car 5.2", 2016, 70,
                99, 450, 27, 180, true, true),
                1, 30000));
        stock5.add(new Stock(new Car("Manufactor 5", "Car 5.3", 2014, 55,
                113, 240, 27, 130, true, false),
                1, 14000));
        stock5.add(new Stock(new Car("Manufactor 5", "Car 5.4", 2017, 100,
                122, 510, 40, 310, false, true),
                0, 43000));
        stock5.add(new Stock(new Car("Manufactor 5", "Car 5.5", 2016, 80,
                81, 460, 37, 210, true, true),
                3, 38000));

        dealers.add(new Dealership("dealer1", stock1));
        dealers.add(new Dealership("dealer2", stock2));
        dealers.add(new Dealership("dealer3", stock3));
        dealers.add(new Dealership("dealer4", stock4));
        dealers.add(new Dealership("dealer5", stock5));
        buyer.setDealer(dealers);
    }


}
