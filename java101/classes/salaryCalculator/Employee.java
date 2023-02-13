package java101.classes.salaryCalculator;

public class Employee {
    String fullName;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String fullName, double salary, int workHours, int hireYear) {
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public double tax(){
        if (salary<1000){
            return 0.0;
        }else{
            return salary*0.03;
        }
    }

    public double bonus(){
        if (workHours>40){
            return (workHours-40)*30;
        }else {
            return 0;
        }
    }

    public void raiseSalary(){
        int workingYear=2023-hireYear;
        if (workingYear>20){
            this.salary=this.salary+this.salary*0.15;
        } else if (workingYear > 10) {
            this.salary=this.salary+this.salary*0.10;
        }else {
            this.salary=this.salary+this.salary*0.05;
        }
    }
}
