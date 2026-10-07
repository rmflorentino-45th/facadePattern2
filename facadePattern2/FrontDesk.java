package facadePattern2;

public class FrontDesk {
    private HotelService hotelService;

    public FrontDesk(HotelService hotelService) {
        this.hotelService = hotelService;
    }
    
    public void pickUpVehicle(String plateNumber) {
        hotelService.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(String roomNumber) {
        hotelService.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        hotelService.requestCart(numberOfCarts);
    }
}