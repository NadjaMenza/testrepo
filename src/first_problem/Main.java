package first_problem;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getSalaryP()); //0.0

        employee.payRaise();
        System.out.println(employee.getSalaryP()); //5000.0

        employee.payRaise(2500);
        System.out.println(employee.getSalaryP()); //7500.0

        employee.payRaise(5.0);
        System.out.println(employee.getSalaryP()); //7875.0
    }
}
