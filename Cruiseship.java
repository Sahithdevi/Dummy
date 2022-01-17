public class Cruiseship extends ship {
static String [] availablepackage = {"Vizag","Mumbai","Goa"};
static int[] price ={65000,25000,30000};
boolean adventureActivity;


public Cruiseship(Passenger passenger,boolean adventureActivity) {
    super(passenger);
    this.adventureActivity = adventureActivity;
}
@Override
public void calculateBill(String cuisine) {
    boolean value = super.getPassenger().validatePassengerDetails();

    if(value == false) {
        this.setBookingId("NA");
        this.setBillAmount(-1.0);
    } else {
        for (int i = 0;i < availablepackage.length;i++) {
            if(availablepackage[i] == super.getPassenger().getPackageType()) {

            }
        }

    }

}
    
}
