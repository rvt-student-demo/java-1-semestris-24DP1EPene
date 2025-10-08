package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[4];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;

        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index = index + 1;
        }
        int index_1 = scanner.nextInt();
        int index_2 = scanner.nextInt();
        int value_1 = numbers[index_1];
        int value_2 = numbers[index_2];
        numbers[index_1] = value_2;
        numbers[index_2] = value_1;

        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index = index + 1;
        }
        scanner.close();
    }
}