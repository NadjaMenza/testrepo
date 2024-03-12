package fifth_problem;

public class Taxi extends Car {
    protected String companyName;
    protected double charge;


    public Taxi(int registrationNr, String type, int year, int mileage, double consumption, String companyName, double charge) {
        super(registrationNr, type, year, mileage, consumption);
        this.companyName = companyName;
        this.charge = charge;
    }

    public double taxiJourneyPrice (int distance){
        return charge*distance;
    }
}
