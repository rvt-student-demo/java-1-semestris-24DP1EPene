package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        double num = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the second num: ");
        double num_2 = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter the third num: ");
        double num_3 = Integer.valueOf(scanner.nextLine());
        System.out.println("Avarage of three nums = " + ((num + num_2 + num_3) / 3));
    }
}
