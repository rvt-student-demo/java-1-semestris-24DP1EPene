package rvt;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Iedod numuru:");
int numurs = Integer.valueOf(scanner.nextLine());

if (numurs % 2 == 0) {
System.out.println("Number " + numurs + " is even");
}
else {
System.out.println("Number" + numurs + " is odd");
}

}
}