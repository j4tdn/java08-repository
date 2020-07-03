package java08.ex01;


import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(102, "Nam", "C"),
                new Student(104, "Hoàng", "D"),
                new Student(109, "Lan", "A"),
                new Student(103, "Nam", "B"),
                new Student(105, "Minh", "A"),
        };

        Student[] distinctStudents = getStudentsRegisterOnce(students);
        for(Student student : distinctStudents){
            System.out.println(student);
        }

        System.out.println("===========================================");

        Student[] studentsHaveAGrade = getStudentsHaveAGrade(distinctStudents);
        for(Student student : studentsHaveAGrade){
            System.out.println(student);
        }
    }

    private static Student[] getStudentsRegisterOnce(Student[] students) {
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < students.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < students.length; j++) {
                if (students[j].getName().equals(students[i].getName()) && i != j) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                studentList.add(students[i]);
            }
        }
        Student[] result = studentList.toArray(new Student[studentList.size()]);
        return result;
    }

    private static Student[] getStudentsHaveAGrade(Student[] students){
        List<Student> studentList = new ArrayList<Student>();
        for(Student student :students){
            if(student.getGrade().equals("A")){
                studentList.add(student);
            }
        }
        Student[] result = studentList.toArray(new Student[studentList.size()]);
        return result;
    }
}
