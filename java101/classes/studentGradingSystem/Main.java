package java101.classes.studentGradingSystem;

public class Main {
    public static void main(String[] args) {

        Teacher t1=new Teacher("Mahmood", 9_050_000,"History");
        Teacher t2=new Teacher("Graham Bell", 9_050_001,"Physics");
        Teacher t3=new Teacher("Grand Teacher", 9_050_002,"Biology");

        Course hist=new Course("History","101","Hist");
        hist.addTeacher(t1);

        Course phys=new Course("Physics","102","Phys");
        phys.addTeacher(t2);

        Course biol=new Course("Biology","103","Biol");
        biol.addTeacher(t3);

        Student s1=new Student(hist,phys,biol,"Shaban","123","4");
        s1.addBulkExamNote(90,80,45);
        s1.isPass();

    }
}
