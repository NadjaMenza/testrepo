package first_problem;

public class Employee {
    private String name;
    private int age;
    private double salaryP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaryP() {
        return salaryP;
    }

    public void setSalaryP(int salaryP) {
        this.salaryP = salaryP;
    }

    public void payRaise(){
        this.salaryP += 5000;
    }

    public void payRaise (int a){
        this.salaryP += a;

    }

    public void payRaise (double b){

        this.salaryP = salaryP * b / 100 + salaryP;
    }
}
