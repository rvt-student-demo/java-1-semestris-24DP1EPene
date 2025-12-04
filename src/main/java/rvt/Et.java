package rvt;

import java.util.Scanner;

class Et {
    private final Scanner scanner = new Scanner(System.in);

    String input(String text) {
        
        System.out.print(text);
        String result = scanner.nextLine();
        return result;
    }

    int input(String text, String type) {
        System.out.print(text);
        int result = Integer.valueOf(scanner.nextLine());
        return result;
    }
}
