package java08.bean;

public class Student {
    private String fullname;
    private int age;
    private String classStudent;

    public Student() {
    }

    public Student(String fullname, int age, String classStudent) {
        this.fullname = fullname;
        this.age = age;
        this.classStudent = classStudent;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }
}
