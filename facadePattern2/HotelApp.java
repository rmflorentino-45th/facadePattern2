package facadePattern2;

public class HotelApp {

    public static void main(String[] args) {

        Valet helper = new Valet();

        FrontDesk facade1 = new FrontDesk(helper);

        facade1.pickUpVehicle("NBC 1234");
    }
    
}