package rvt;

public class App {

    public static void print_spaces(int number) {
        System.out.print(" ".repeat(number));
    }
    public static void print_stars(int number) {
        System.out.print("*".repeat(number));
    }
    public static void print_square(int length, int height,  int offset) {
        for (int i = 0; i < height; i++) {
            print_spaces(offset);
            print_stars(length);
            System.out.println();
        }
    }
    public static void print_two_side_triangle(int height) {
        height *= 2;
        for (int i = 1; i < height; i += 2) {
            print_spaces((height - i) / 2);
            print_stars(i);
            print_spaces((height - i) / 2);
            System.out.println();
        }
    }
    public static void print_christmass_tree(int height) {
        print_two_side_triangle(height);
        print_square(3, 2, ((1 + (height - 1) * 2) / 2) - 1);

    }

    public static void main(String[] args) {
        print_christmass_tree(10);
    }
}