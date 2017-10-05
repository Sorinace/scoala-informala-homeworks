package ro.scoalainformala.gr8.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Sorin
 */
public class Main {
    public static void main(String[] args) {
        Customer buyer = new Customer("The Buyer", 40000);
        PurchaseOrder order = null;
        ArrayList<Dealership> dealers = new ArrayList<>();
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
            try {
                order = new PurchaseOrder(buyer.getList().get(--no), buyer);
                System.out.println(order.toString());
            } catch (OutOfStockException outOfStockException) {
                System.out.println("\nSORRY!\nThis car it is out of stock!");
            } catch (EnoughFoundsException founds) {
                System.out.println("\nSORRY!\nYou don't have enough money for this car!");
            }
        }
        System.out.print("\nDo you want to get Green Bonus?(y/n): ");
        if (in.next().toLowerCase().equals("y")) {
            System.out.print("Please insert the car number: ");
            int no = in.nextInt();
            if (no > 0 && no <= buyer.getList().size()) {
                Dealership bonusDealer = buyer.getDealer(buyer.getList().get(--no));
                try {
                    bonus = bonusDealer.getBonus(buyer.getList().get(no), buyer);
                    try {
                        order = new PurchaseOrder(buyer.getList().get(no), buyer, bonus);
                        System.out.println("Bonus = " + bonus);
                        System.out.println(order.toString());
                    } catch (OutOfStockException outOfStock) {
                        System.out.println("\nSORRY!\nThis car it is out of stock!");
                    } catch (EnoughFoundsException founds) {
                        System.out.println("\nSORRY!\nYou don't have enough money for this car!");
                    }
                } catch (BonusException e) {
                    System.out.println("\nWe can't offer you a bonus.\nThe Green Bonus program has no money!");
                } catch (UsedCarException used) {
                    System.out.println("\nWe can't offer you a bonus for a used car!");
                }
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
        ArrayList<Stock> stock1 = new ArrayList<>();
        ArrayList<Stock> stock2 = new ArrayList<>();
        ArrayList<Stock> stock3 = new ArrayList<>();
        ArrayList<Stock> stock4 = new ArrayList<>();
        ArrayList<Stock> stock5 = new ArrayList<>();
        String csvFile = "src/main/cars.csv";
        String line = "";
        String splitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] cars = line.split(splitBy);
                Stock st = new Stock(new Car(cars[0], cars[1], Integer.valueOf(cars[2]), Integer.valueOf(cars[3]),
                        Integer.valueOf(cars[4]), Integer.valueOf(cars[5]), Integer.valueOf(cars[6]),
                        Integer.valueOf(cars[7]), Boolean.valueOf(cars[8]), Boolean.valueOf(cars[9])),
                        Integer.valueOf(cars[10]), Integer.valueOf(cars[11]));

                switch (cars[0]) {
                    case "Manufactor 1":
                        stock1.add(st);
                        break;
                    case "Manufactor 2":
                        stock2.add(st);
                        break;
                    case "Manufactor 3":
                        stock3.add(st);
                        break;
                    case "Manufactor 4":
                        stock4.add(st);
                        break;
                    case "Manufactor 5":
                        stock5.add(st);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        dealers.add(new Dealership("dealer1", stock1));
        dealers.add(new Dealership("dealer2", stock2));
        dealers.add(new Dealership("dealer3", stock3));
        dealers.add(new Dealership("dealer4", stock4));
        dealers.add(new Dealership("dealer5", stock5));
        buyer.setDealer(dealers);
    }
}
