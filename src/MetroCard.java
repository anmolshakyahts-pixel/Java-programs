import java.util.Scanner;

public class MetroCard {
    String cardNumber;
    double balance;
    double travelFare;

    void getCardDetails() {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Card Number: ");
        cardNumber = r.nextLine();
        System.out.print("Enter Current Balance: ");
        balance = r.nextDouble();
        System.out.print("Enter Travel Fare: ");
        travelFare = r.nextDouble();
    }

    void processJourney() {
        if (balance < travelFare) {
            System.out.println("Journey Denied: Insufficient Balance!");
            System.out.println("Current Balance: ₹" + balance);
        }
        else if (balance >= travelFare) {
            System.out.println("Journey Successful!");
        }

    }
    void displayCardStatus() {
        balance = balance - travelFare;
        System.out.println("\n--- Metro Card Details ---");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Travel Fare: ₹" + travelFare);
        if (balance < 50) {
            System.out.println("Low Balance Warning: Your remaining balance is below ₹50!");
        }
        System.out.println("Remaining Balance: ₹" + balance);}

    public static void main(String[] args) {
        MetroCard card = new MetroCard();
        card.getCardDetails();
        System.out.println("\n--- Processing Journey ---");
        card.processJourney();
        card.displayCardStatus();
    }
}