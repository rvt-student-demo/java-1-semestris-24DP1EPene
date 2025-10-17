package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        names.add("Hello"); names.add("World!"); 
        remove_last(names);
        System.out.println(names);
        scanner.close();
    }

    public static void only_theese_numbers(Scanner scanner) {
        int input = Integer.valueOf(scanner.nextLine());
        List<Integer> nums = new java.util.ArrayList<>();
        while (input != -1) {
            nums.add(input);
            input = Integer.valueOf(scanner.nextLine());
        }
        System.out.print("Enter the end: ");
        int end = Integer.valueOf(scanner.nextLine()) + 1;
        System.out.print("Enter the start: ");
        for (int i = Integer.valueOf(scanner.nextLine()); i < end; i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
    }

    public static void size_of_list(Scanner scanner) {
        List<String> names = new java.util.ArrayList<>();
        String input = "No name";
        while (!input.equals("")) {
            input = scanner.nextLine();
            names.add(input);
        }
        System.out.println(names.size() - 1);
    }
    public static void is_there(Scanner scanner) {
        List<String> names = new java.util.ArrayList<>();
        String input = "No name";
        while (!input.equals("")) {
            input = scanner.nextLine();
            names.add(input);
        }
        System.out.print("Enter the name to search for: ");
        System.out.println(names.contains(scanner.nextLine()) ? "The name was found!" : "The name wasn't found!");
    }
    public static void remove_last(List<?> names) {
        if (names.size() != 0) {
            names.remove(names.size() - 1);
        }
    }
}