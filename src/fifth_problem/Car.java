package fifth_problem;

public class Car {
    protected int registrationNr;
    protected String type;
    protected int year;
    protected int mileage;
    protected double consumption;
    protected  double price;

    public Car(int registrationNr, String type, int year, int mileage, double consumption) {
        this.registrationNr = registrationNr;
        this.type = type;
        this.year = year;
        this.mileage = mileage;
        this.consumption = consumption;
    }
    public double costJourney (int distance){
        return distance*price*consumption/100;
    }

}
