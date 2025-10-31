package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics statistics_odd = new Statistics();
        Statistics statistics_even = new Statistics();
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        while (input != -1) {
            if (input % 2 == 0) {
                statistics_even.addNumber(input);
            }
            else {
                statistics_odd.addNumber(input);
            }
            statistics.addNumber(input);
            input = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum() + "\nOdd sum: " + statistics_odd.sum() + "\nEven sum: " + statistics_even.sum());
        System.out.println("Average: " + statistics.average());

    }
}