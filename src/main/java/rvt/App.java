package rvt;
import java.util.Scanner;

    public class App {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of the gift: ");
        double gift = Double.valueOf(scanner.nextLine());
        if (gift < 5000) {
            System.out.println("No tax!");
        }
        else {
            System.out.print("Tax: ");
        }
        if (gift >= 5000 && gift <= 25000) {
            System.out.println(100 + (gift - 5000) * 0.08);
        }
        else if (gift > 25000 && gift <= 55000) {
            System.out.print(1700 + (gift - 25000) * 0.10);
        }
        else if (gift > 55000 && gift <= 200000) {
            System.out.print(4700 + (gift - 55000) * 0.12);
        }
        else if (gift > 200000 && gift <= 1000000) {
            System.out.print(22100 + (gift - 200000) * 0.15);
        }
        else if (gift > 1000000) {
            System.out.print(142100 + (gift - 1000000) * 0.17);
        }



        scanner.close();

    }
}