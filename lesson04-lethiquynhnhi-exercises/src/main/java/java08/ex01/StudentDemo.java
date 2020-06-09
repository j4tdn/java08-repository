package java08.ex01;

import java.util.Scanner;

public class StudentDemo {
    private static final String MSSV = "Ma Sinh Vien";
    private static final String FULL_NAME = "Ho Ten";
    private static final String THEORETICAL_POINT = "Diem Ly Thuyet";
    private static final String PRACTICE_POINT = "Diem Thuc Hanh";
    private static final String AVERAGE_POINT = "Diem Trung Binh";
    private static final Scanner ip  =new Scanner(System.in);
    public static void main(String[] args) {
        Student sv1  = new Student(1, "Nhi Le", 7.8f, 9);
        Student sv2 = new Student(2, "Na Le", 7.5f, 8 );
        Student sv3 = new Student();
        inputInformationStudent(sv3);
        printStudentList(sv1, sv2,sv3);
    }

    private static void inputInformationStudent(Student sv3){
        System.out.print("Enter MSSV: ");
        int mssv = Integer.parseInt(ip.nextLine());
        System.out.print("Enter Full Name: ");
        String fullName = ip.nextLine();

        System.out.print("Enter Theoretical Point: ");
        float theoreticalPoint = Float.parseFloat(ip.nextLine());

        System.out.print("Enter Practice Point: ");
        float practicePoint = Float.parseFloat(ip.nextLine());

        sv3.setMssv(mssv);
        sv3.setFullname(fullName);
        sv3.setTheoreticalPoint(theoreticalPoint);
        sv3.setPracticePoint(practicePoint);

    }

    private static void printStudentList(Student ... students){
        System.out.format("%10s %12s %15s %20s %20s",MSSV, FULL_NAME, THEORETICAL_POINT, PRACTICE_POINT, AVERAGE_POINT);
        System.out.println("\n===============================================================================================");
        for(Student student:students){
            System.out.format("%10s %12s %15s %20s %20s\n", student.getMssv(), student.getFullname(), student.getTheoreticalPoint(), student.getPracticePoint(), student.calculateAveragePoint());
        }
    }
}
