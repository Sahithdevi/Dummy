abstract public class ship {
    static int counter = 500;
    String bookingId;
    double billAmount;
    Passenger passenger;
    public ship(String bookingId, double billAmount, Passenger passenger) {
        this.bookingId = bookingId;
        this.billAmount = billAmount;
        this.passenger = passenger;
    }
    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        ship.counter = counter;
    }
    public String getBookingId() {
        return bookingId;
    }
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    public double getBillAmount() {
        return billAmount;
    }
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public Integer IdentifyDiscountPercentage(double cost) {
        if(cost >= 50000 && cost <= 80000) {
            return 10;
        } else if(cost > 80000) {
            return 15;
        }
        return 0;
    }
    @Override
    public String toString() {
        return "ship [billAmount=" + billAmount + ", bookingId=" + bookingId + ", passenger=" + passenger + "]";
    }
     

    
}
