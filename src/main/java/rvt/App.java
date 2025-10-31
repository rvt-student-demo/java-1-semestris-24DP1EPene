package rvt;

public class App {
    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println(String.format("Paul: %s\nMatt: %s", paulsCard.toString(), mattsCard.toString()));
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println(String.format("Paul: %s\nMatt: %s", paulsCard.toString(), mattsCard.toString()));
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println(String.format("Paul: %s\nMatt: %s", paulsCard.toString(), mattsCard.toString()));
    }
}