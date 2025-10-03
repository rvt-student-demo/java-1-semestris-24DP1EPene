package rvt;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void guessing_game(Scanner scanner) {
        Random random = new Random();
        int pc_pick = random.nextInt(10) + 1;
        boolean won = false;

        System.out.println("Try to guess a number the computer picked from 1-10, inclusive.");
        for (int i = 0; i < 3; i++) {
            System.out.print("Guess: ");
            if (scanner.nextInt() == pc_pick) {
                System.out.println("You won!");
                won = true;
                break;
            }
            else {
                System.out.println("Wrong guess!\nTry again.");
            }
        }
        if (!won) {
            System.out.println("You lost!");
        }
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        guessing_game(scanner);
    }
}