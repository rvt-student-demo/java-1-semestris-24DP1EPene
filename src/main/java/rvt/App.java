package rvt;

public class App {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
        
    }
    public static void printArrayInStars(int[] array){
        for(int i = 0; i < array.length; i ++){
            System.out.println("*".repeat(array[i]));
        }
    }
}