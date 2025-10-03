package rvt;

public class App {
    public static void divisibleByThreeInRange(int start, int end) {
        if (start == 0) {
            start++;
        }
        for (int i = start; i < end + 1; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }        
        }
    }
    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
}