package java101.classes.studentGradingSystem;

public class Teacher {

    String name;
    int phoneNumber;
    String branch;

    public Teacher(String name, int phoneNumber, String branch) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    public void print(){
        System.out.println("Name: "+this.name);
        System.out.println("Phone Number: "+this.phoneNumber);
        System.out.println("Branch: "+this.branch);
    }
}
