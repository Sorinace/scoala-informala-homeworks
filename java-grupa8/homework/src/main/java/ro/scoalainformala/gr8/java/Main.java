package ro.scoalainformala.gr8.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int positionOfCarInList = 0;
        Customer buyer = new Customer();
        PurchaseOrder order;
        int i;

        buyer.getListFromDealer();
        System.out.println("Print the list of cars:");
        i = 0;
        for (Stock item : buyer.getList()) {
            System.out.println(++i + item.getCarManufacturer() + item.getCarName() + item.getCarPrice());
        }
        // read position
        Scanner in = new Scanner(System.in);
        System.out.print("You choose the car from line number: ");
        positionOfCarInList = in.nextInt();
        positionOfCarInList--;
        System.out.print("Do you want a bonus for this car?(y/n): ");
        if (in.next().toLowerCase().equals("y")) {
            order = buyer.getAnBonusOrder(buyer.getStockItem(positionOfCarInList));
            if (order == null) {
                System.out.println(buyer.getTheError(buyer.getStockItem(positionOfCarInList)));
            } else {
                System.out.println("You can buy this car with bonus!");
            }
        } else {
            order = buyer.getAnFullPriceOrder(buyer.getStockItem(positionOfCarInList));
            if (order == null) {
                System.out.println(buyer.getTheError(buyer.getStockItem(positionOfCarInList)));
            } else {
                System.out.println("You can buy this car at full price!");
            }
        }
    }
}
