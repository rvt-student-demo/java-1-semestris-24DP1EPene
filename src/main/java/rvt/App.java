package rvt;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ieraksti punktus:");
int punkti = Integer.valueOf(scanner.nextLine());
scanner.close();

if (punkti < 0) {
System.out.println("Impossible!");
}
else if (punkti < 50) {
System.out.println("failed");
}
else if (punkti < 60) {
System.out.println("1");
}
else if (punkti < 70) {
System.out.println("2");
}
else if (punkti < 80) {
System.out.println("3");
}
else if (punkti < 90) {
System.out.println("4");
}
else if (punkti < 100) {
System.out.println("5");
}
else {
System.out.println("Incredible");
}

}
}