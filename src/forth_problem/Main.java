package forth_problem;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("Blade", "Rom");
        Car car2 = new Car("Bool", "Limit", 2023, 555555);

        car.displayCarInfo();
        car1.displayCarInfo();
        car2.displayCarInfo();

        System.out.println(car.getMake());

    }
}
