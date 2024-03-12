package sixth_problem;

public class Car extends Vehicle{
    protected int nrSeat;
    public Car(int nrWheel, long milage, int nrSeat) {
        super(nrWheel, milage);
        this.nrSeat = nrSeat;
    }

    public  void  display (){
        System.out.println(nrSeat);
    }

}
