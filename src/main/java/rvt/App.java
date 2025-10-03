package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int count = 0, even = 0, odd = 0;
        double sum = 0;

        System.out.println("Enter numbers:");
        while ((input = Integer.valueOf(scanner.nextLine())) != -1) {
            sum += input;
            count += 1;
            if (input % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
        }
        System.out.println(String.format("Thanks, bye bye!\nSum of numbers: %f\nAmount of numbers: %d\nThe avarage of numbers: %f\nEven and odd numbers: %d | %d", sum, count, sum / count, even, odd));
        scanner.close();
    }
}