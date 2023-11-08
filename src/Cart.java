import java.util.Scanner;

public class Cart implements HotelService {
    private int numberOfCarts;

    public void inputId() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of luggage carts needed: ");
        numberOfCarts = scan.nextInt();
    }

    public void activateService() {
        requestCart(numberOfCarts);
    }

    public void status() {
        System.out.println("Status: Luggage cart service for " + numberOfCarts + " cart(s) has been finished.");
    }

    private void requestCart(int numberOfCarts) {
        System.out.println("Status: Requesting luggage cart service for " + numberOfCarts + " cart(s)...");
        try {
            Thread.sleep(3000); // Simulate the luggage cart request process for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}