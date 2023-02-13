package java101.classes.salaryCalculator;

public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee("Mikel Jackson",100_000,30,1980);

        double tax= employee.tax();
        double bonus= employee.bonus();

        System.out.println(employee);
        System.out.println("bonus = " + bonus);
        System.out.println("tax = " + tax);

        employee.raiseSalary();
        System.out.println(employee);

    }
}
