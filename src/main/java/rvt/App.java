package rvt;

public class App {

    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        int suma = 0;
        for(int i = 0; i < numbers.length; i ++){
           suma += numbers[i];
        }
        System.out.println(suma);
    }
    
}