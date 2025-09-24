package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product: ");
        String product = scanner.nextLine();
        System.out.print("Enter the price of the product: ");
        Double price = Double.valueOf(scanner.nextLine());
        System.out.print("Use express delivery? [1/0] ");
        double delivery = ((Integer.valueOf(scanner.nextLine()) == 1 ? true : false) ? 3 + (price >= 10 ? -3 : 2) : 0);
        scanner.close();
        System.out.println(String.format("Check: \n%s:%f\nDelivery: %f\nFull price: %f", product, price, delivery, delivery + price));
    }
}