public class FrontDesk {
    private Valet valetService;
    private HouseKeeping housekeepingService;
    private Cart cartService;

    public FrontDesk() {
        valetService = new Valet();
        housekeepingService = new HouseKeeping();
        cartService = new Cart();
    }

    public void requestValetService() {
        System.out.println("Welcome to the Valet Service.");
        valetService.inputId();
        valetService.activateService();
        valetService.status();
        System.out.println();
    }

    public void requestHouseKeepingService() {
        System.out.println("Welcome to the Housekeeping Service.");
        housekeepingService.inputId();
        housekeepingService.activateService();
        housekeepingService.status();
        System.out.println();
    }

    public void requestCartService() {
        System.out.println("Welcome to the Luggage Cart Service.");
        cartService.inputId();
        cartService.activateService();
        cartService.status();
        System.out.println();
    }
}