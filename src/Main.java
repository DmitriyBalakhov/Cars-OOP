import java.util.Scanner;

// This home task is designed as a short questionnaire with input field, so user can interact with the program.
// Custom exception InvalidInputException is implemented in the code

public class Main {

    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Welcome to our dealership!");
            System.out.println("We are official partners of Lexus and Toyota");

            String brand = askBrand(scanner);
            if (brand.equalsIgnoreCase("lexus")) {
                System.out.println("Please take a look at our catalog:");
                System.out.println("");
                System.out.println("Lexus RX350, 2024, Grey, SUV, 65 000 USD");
                System.out.println("Lexus ES300, 2024, Black, Sedan, 55 000 USD");
                System.out.println("");
            } else if (brand.equalsIgnoreCase("toyota")) {
                System.out.println("Please take a look at our catalog:");
                System.out.println("");
                System.out.println("Toyota Camry, 2023, Grey, Sedan, 35 000 USD");
                System.out.println("Toyota RAV4, 2023, Grey, SUV, 42 000 USD");
                System.out.println("");
            }

            boolean testDriveOption = TestDriveOption(scanner);
            if (testDriveOption) {
                boolean ageVerification = AgeVerification(scanner);
                if (ageVerification) {
                    PhoneNumberInput(scanner);
                }
            }

            System.out.println("Thanks for a visiting.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    static String askBrand(Scanner scanner) throws InvalidInputException {
        while (true) {
            System.out.print("What brand are you looking for? (Lexus/Toyota): ");
            String brand = scanner.nextLine().toLowerCase();
            switch (brand) {
                case "lexus":
                    System.out.println("You have exquisite taste!");
                    return brand;
                case "toyota":
                    System.out.println("Great choice!");
                    return brand;
                case "":
                    System.out.println("Please enter a brand.");
                    break;
                default:
                    System.out.println("Sorry, but currently we are not working with this brand.");
                    break;
            }
        }
    }


    static boolean TestDriveOption(Scanner scanner) throws InvalidInputException {
        while (true) {
            System.out.print("Would you like to book a free test drive? (Yes/No): ");
            String choice = scanner.nextLine().toLowerCase();
            switch (choice) {
                case "yes":
                    return true;
                case "no":
                    return false;
                case "":
                    System.out.println("Please answer Yes or No.");
                    break;
                default:
                    System.out.println("Please answer Yes or No.");
                    break;
            }
        }
    }


    static boolean AgeVerification(Scanner scanner) throws InvalidInputException {
        while (true) {
            System.out.print("Are you 18 years old or older? (Yes/No): ");
            String ageChoice = scanner.nextLine().toLowerCase();
            switch (ageChoice) {
                case "yes":
                    return true;
                case "no":
                    System.out.println("Sorry, but you are not allowed to join the test drive program.");
                    return false;
                case "":
                    System.out.println("Please answer Yes or No.");
                    break;
                default:
                    System.out.println("Please answer Yes or No.");
                    break;
            }
        }
    }

    static void PhoneNumberInput(Scanner scanner) throws InvalidInputException {
        while (true) {
            try {
                System.out.print("Please enter your phone number: ");
                String phoneNumber = scanner.nextLine();
                if (!phoneNumber.matches("\\d+")) {
                    throw new InvalidInputException("Please use only numbers for phone number(7 digits format)");
                }
                if (phoneNumber.length() != 7) {
                    throw new InvalidInputException("Phone number should contain at least 7 digits.");
                }
                System.out.println("Our manager will contact you shortly.");
                return;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
