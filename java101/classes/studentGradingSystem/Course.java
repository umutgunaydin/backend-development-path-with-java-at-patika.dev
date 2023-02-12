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
        if (teacher.branch.equals(this.name)) {
            this.teacher = teacher;
        }else{
            System.out.println("Branch of teacher is not matching with the course!");
        }
    }
    public void printTeacherInfo(){
        this.teacher.print();
    }

}
