package fifth_problem;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(555, "V", 2003, 50000, 3.0);
        Taxi taxi = new Taxi(123, "Volvo", 2013, 200000, 2.5,
                "GHKJG", 123);

        System.out.println(car.costJourney(100));
        System.out.println(taxi.taxiJourneyPrice(100));
    }
}
