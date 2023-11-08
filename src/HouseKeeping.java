import java.util.Scanner;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public void inputId() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the room number: ");
        roomNumber = scan.nextInt();
    }

    public void activateService() {
        cleanRoom(roomNumber);
    }

    public void status() {
        System.out.println("Status: Room cleaning service for room number " + roomNumber + " has been finished.");
    }

    private void cleanRoom(int roomNumber) {
        System.out.println("Status: Housekeeping is cleaning room number " + roomNumber);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}