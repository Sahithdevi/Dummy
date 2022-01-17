public class Passenger {
    String psngrName;
    static int age;
    String packageType;
    double noOfPassengers;
    public String getPsngrName() {
        return psngrName;
    }
    public void setPsngrName(String psngrName) {
        this.psngrName = psngrName;
    }
    public static int getAge() {
        return age;
    }
    public static void setAge(int age) {
        Passenger.age = age;
    }
    public String getPackageType() {
        return packageType;
    }
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }
    public double getNoOfPassengers() {
        return noOfPassengers;
    }
    public void setNoOfPassengers(double noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
    public Passenger(String psngrName, String packageType, double noOfPassengers) {
        this.psngrName = psngrName;
        this.packageType = packageType;
        this.noOfPassengers = noOfPassengers;
    }

    public Boolean validatePassengerDetails() {
        return null;
    }
    @Override
    public String toString() {
        return "Passenger [noOfPassengers=" + noOfPassengers + ", packageType=" + packageType + ", psngrName="
                + psngrName + "]";
    }

    
}