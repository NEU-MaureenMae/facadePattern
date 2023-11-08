import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to SEBIES Hotel!");

        boolean continueUsingServices = true;
        while (continueUsingServices) {
            System.out.println("1. Valet Parking");
            System.out.println("2. Room Cleaning");
            System.out.println("3. Luggage Cart");
            System.out.print("Which service would you like to use? --> ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    frontDesk.requestValetService();
                    break;
                case 2:
                    frontDesk.requestHouseKeepingService();
                    break;
                case 3:
                    frontDesk.requestCartService();
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid service.");
                    break;
            }

            System.out.println("Would you like to use another service?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter choice --> ");
            int userChoice = scan.nextInt();
            scan.nextLine();

            if (userChoice == 2) {
                continueUsingServices = false;
                System.out.println("Thank you for choosing SEBIES Hotel.");
            }

        }
    }
}