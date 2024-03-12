package forth_problem;

public class Car {
    private String make;
    private String model;
    private  int year;
    private  double price;

    public Car (){
        this.make = "";
        this.model = "";
        this.year = 0;
        this.price = 0.0;
    }

    public Car (String a, String b){
        this.make = a;
        this.model = b;
        this.year = 0;
        this.price = 0.0;
    }

    public Car (String a, String b, int c, double d){
        this.make = a;
        this.model = b;
        this.year = c;
        this.price = d;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void displayCarInfo (){
        System.out.println(this.make);
        System.out.println(this.model);
        System.out.println(this.year);
        System.out.println(this.price);

    }
}
