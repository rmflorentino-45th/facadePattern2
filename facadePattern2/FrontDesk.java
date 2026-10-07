package facadePattern2;

public class FrontDesk {
    private HotelService hotelService;

    public FrontDesk(HotelService hotelService) {
        this.hotelService = hotelService;
    }
    
    public void pickUpVehicle(String plateNumber) {
        hotelService.pickUpVehicle(plateNumber);
    }
}