package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        for (int input = -1; input != 0;) {
            System.out.print(String.format("Enter the %d number: ", count));
            input = Integer.valueOf(scanner.nextLine());
            count++;
            sum += input;
        }
        System.out.println(String.format("Entered %d numbers\nThe sum of those numbers is %d", count, sum));
        scanner.close();
    }
}