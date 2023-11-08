import java.util.Scanner;

public class Valet implements HotelService {
    private String plateNumber;

    public void inputId() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please provide a plate number before activating valet service: ");
        plateNumber = scan.nextLine();
    }

    public void activateService() {
        pickUpVehicle(plateNumber);
    }

    public void status() {
        System.out.println("Status: Valet parking service for vehicle with plate number " + plateNumber + " has been finished.");
    }

    private void pickUpVehicle(String plateNumber) {
        System.out.println("Status: Valet is parking the vehicle with plate number " + plateNumber);
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}