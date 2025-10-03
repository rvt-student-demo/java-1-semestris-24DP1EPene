package rvt;

import java.util.Scanner;

public class Chapter_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exercise_7(scanner);
        scanner.close();
        
    }
    public static String input(Scanner scanner, String text) {
        System.out.print(text);
        String results = scanner.nextLine();
        return results;
    }
    public static void exercise_1(Scanner scanner) {
        int end = Integer.valueOf(input(scanner, "Enter the end: "));
        for (int i = Integer.valueOf(input(scanner, "Enter the start: ")); i < end; i++) {
            System.out.println(i);
        }
    }
    public static void exercise_2(Scanner scanner) {
        int n = Integer.valueOf(input(scanner, "Enter n: "));
        double function_sum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }
        System.out.println("Function sum: " + function_sum + "\nLoop sum: " + sum);
    }
    public static void exercise_3(Scanner scanner) {
        int n = Integer.valueOf(input(scanner, "Enter n: "));
        double function_sum = (n * (n + 1) * (2 * n + 1)) / 6;
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            sum += i * i;
        }
        double cubes_function_sum = ((n * (n + 1)) / 2) * ((n * (n + 1)) / 2);
        int cubes_sum = 0;
        for (int i = 0; i < n + 1; i++) {
            cubes_sum += i * i * i;
        }
        System.out.println("Function sum: " + function_sum + "\nLoop sum: " + sum + "\n\nCUBES:\n\nFunction sum: " + cubes_function_sum + "\nLoop sum: " + cubes_sum);
    }
    public static void exercise_4(Scanner scanner) {
        
        int low = Integer.valueOf(input(scanner, "Enter low: "));
        int high = Integer.valueOf(input(scanner, "Enter high: "));
        int count = high - low + 1;
        double function_sum = count * (low + high) / 2;
        System.out.println(function_sum);

    }
    public static void exercise_5(Scanner scanner) {
        
        String word = input(scanner, "Enter the word: ");
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word);
        }

    }
    public static void exercise_6(Scanner scanner) {
        
        String word = input(scanner, "Enter the word: ");
        String second_word = input(scanner, "Enter the second word: ");
        System.out.println(word + ".".repeat(30 - word.length() - second_word.length()) + second_word);

    }
    public static void exercise_7(Scanner scanner) {
        
        String word = input(scanner, "Enter the word: ");
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

    }
}