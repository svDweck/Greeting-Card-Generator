import java.util.*;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instructions for the User
        System.out.println("Choose greeting card type:");
        System.out.println("1: Loss \n 2: Birthday \n 3: Marriage");

        int cardType = scanner.nextInt();   // User inputs the card type
        scanner.nextLine();

        System.out.println("Name of recipient:");

        String person = scanner.nextLine(); // User inputs the recipient's name

        // Creates a GreetingCard object
        GreetingCard card = new GreetingCard(cardType, person);

        // Prints the resulting greeting card
        System.out.println(card.generateCard(card.getT(), card.getP()));




    }
}