package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter screw amount: ");
        int screws = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter nut amount: ");
        int nuts = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter plate amount: ");
        int plates = Integer.valueOf(scanner.nextLine());
        scanner.close();
        System.out.println(String.format("Screw amount: %d\nNuts amount: %d\nPlates amount: %d\nCheck: %s", screws, nuts, plates, nuts == screws ? (nuts * 2 == plates ? "No errors!" : "Not enough plates!") : nuts > screws ? "Not enough screws" : "Not enough nuts"));
    }
}