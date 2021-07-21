package pl.karolwesolowski;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        Party party = new Party();

        while(shouldContinue){
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gosci");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");

            int userChoice = scanner.nextInt();
            switch (userChoice){
                case 1:
                    party.displayGuests();
                    break;
                case 2:
                    party.addGuest();
                    break;
                case 3:
                    party.displayMeals();
                    break;
                case 4:
                    party.displayByPhoneNumber();
                    break;
                case 5:
                    shouldContinue = false;
                    break;
            }

        }

    }
}