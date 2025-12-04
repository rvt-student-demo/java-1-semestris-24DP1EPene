package rvt;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Et et = new Et();
        ex_8(et);
    }
    public static void ex_1(Et et) {
            String name = et.input("Enter your name: ").trim();
            int space_index = name.indexOf(" ");
            int second_space_index = 0;
            while (true) { // Keeps looking for more spaces until there aren't anymore
                second_space_index = name.indexOf(" ", second_space_index + 1);
                if (second_space_index != -1) { space_index = second_space_index; } else { break; }
            }
            if (space_index != -1) {
                System.out.println(name.substring(0, space_index).concat(name.substring(space_index, name.length()).toUpperCase())); // Outputs only the last name in capital. Literarily the last word in the line
            }
            else {
                System.out.println(name);
            }
    }

    public static void ex_2(Et et) {
        String string = et.input("Enter a string: ");
        int len_string = string.length();
        for (int i = 0; i < len_string; i++) {
            System.out.println(string.charAt(i));
        }
    }

    public static void ex_3(Et et) {
        String[] MALE_NAMES = {"Elroy", "Fred", "Graham"};
        String[] FEMALE_NAMES = {"Amy", "Buffy", "Cathy"};
        String name = et.input("Enter your name: ");
        for (int gender = 0; gender < 2; gender++)
            for (int i = 0; i < 3; i++) {
                if (name.startsWith(gender == 0 ? MALE_NAMES[i] : FEMALE_NAMES[i])) {
                    System.out.print((gender == 0 ? "Mr. " : "Ms. "));
                }
            }
        System.out.println(name);
    }

    public static void ex_4(Et et) {
        int DISPLAY_LENGTH = 4; // Doesn't work with ood numbers, because sections are exactly 2 character long.

        String cook_time = et.input("Enter the cook time: ");
        int cook_time_len = cook_time.length();

        int start_index = 0; // Had to define this outside the conditional, because java had conditional level local scopes?
        if (cook_time_len < DISPLAY_LENGTH) {
            int empty_sections = (DISPLAY_LENGTH - cook_time_len) / 2;
            for (int i = 0; i < empty_sections; i++) {
                System.out.print("0".repeat(2) + ":");
            }
            if ((DISPLAY_LENGTH - cook_time_len + 1) / 2 != empty_sections) {
                System.out.print("0" + cook_time.charAt(0));
                start_index = 1;
                if (start_index != cook_time_len) {
                    System.out.print(":");
                }
            }
        }
        while (start_index != cook_time_len) {
            System.out.print(cook_time.substring(start_index, start_index + 2));
            start_index += 2;
            if (start_index != cook_time_len) {
                System.out.print(":");
            }
        }
        System.out.println();

    }

    public static void ex_5(Et et) {
        try {
            Scanner scanner = new Scanner(Paths.get(et.input("Enter the name of the file: ")));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("//")) {
                    System.out.println(line);
                }
         
            }
            scanner.close();
        }

        catch (IOException e) {
            System.out.println("No such file! | Error: " + e);
        }
    }

    public static void ex_6(Et et) {
        // Upgrade this program later at school.
        try {
            Scanner scanner = new Scanner(Paths.get(et.input("Enter the name of the file: ")));
            boolean multiline_comment = false;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("/*")) {
                    multiline_comment = true;
                }
                if (line.startsWith("*/")) {
                    multiline_comment = false;
                }
                if (line.startsWith("//") || multiline_comment) {
                    System.out.println(line);
                }
         
            }
            scanner.close();
        }

        catch (IOException e) {
            System.out.println("No such file! | Error: " + e);
        }
    }

    public static void ex_7(Et et) {
        // I found 2 sub-solutions to this exercise, but neither were the ones the author expected.

        boolean upper_case = false;
        boolean lower_case = false;

        System.out.println("Your password, must contain:\n1. At least 7 characters.\n2. Both lower and upper case letters.\n3. At least 1 digit.");
        String password = et.input("Enter an password: ");

        while (true) {
            for (int i = 0; i < password.length(); i++) {

                /*  First solution check each character and comparing to an upper or lower case of itself.
                    This solutions also requires you check whether the character you are checking is a number or not.
                    For some reason Java unfortunately doesn't have a built-in string method for doing so. So I supplemented by own.
                    Second solutions that I found was to instead of comparing String, you can check the unicode of the character,
                    an upper and lower case letter of the same letter is 32 int apart. For example a -> 97 and A -> 65. Also
                    all the number are between 48(including) and 58(excluding). */
                String character = password.substring(i, i + 1);
                try {
                    Integer.valueOf(character);
                    continue;
                }
                catch (Exception e) {}
                if (character.toUpperCase().equals(character)) {
                    upper_case = true;
                }
                if (character.toLowerCase().equals(character)) {
                    lower_case = true;
                }
            }
            if (upper_case && lower_case && password.length() >= 7) {
                System.out.println("Acceptable password!");
                break;
            }
            System.out.println("Unacceptable password!");
            password = et.input("Enter an password: ");
        }
        
    }

    public static void ex_8(Et et) {
        String input = et.input("Enter you word: ");

        int input_len = input.length();
        int max_iterations = (input_len / 2) + (input_len % 2 == 1 ? 1 : 0); // To now waster resources recalculating it every time.
        for (int i = 0; i < max_iterations; i++) {
            System.out.println(" ".repeat(i) + input.substring(i, input_len - i) + " ".repeat(i));
        }
    }
}