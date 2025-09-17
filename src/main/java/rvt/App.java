package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second num: ");
        int num_2 = Integer.valueOf(scanner.nextLine());
        System.out.println(String.valueOf(num) + " + " + String.valueOf(num_2) + " = " + (num + num_2));
    }
}
