package java101.classes.studentGradingSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }

    public void addTeacher(Teacher teacher){
        this.teacher=teacher;
    }
    public void printTeacherInfo(){
        this.teacher.print();
    }

}
