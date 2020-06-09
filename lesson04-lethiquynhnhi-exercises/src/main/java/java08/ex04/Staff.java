package java08.ex04;

import java.util.Scanner;

public class Staff extends People {
    private int birthDay;
    private String departmentName;

    public Staff() {
    }

    public Staff(String fullname, double coefficientsSalary, int birthDay, String departmentName) {
        super(fullname, coefficientsSalary);
        this.birthDay = birthDay;
        this.departmentName = departmentName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getDepartment() {
        return departmentName;
    }

    public void setDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    protected void inputInfo() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter name of staff: ");
        this.setFullname(ip.nextLine());
        System.out.print("Enter Birth Day: ");
        this.setBirthDay(Integer.parseInt(ip.nextLine()));
        System.out.print("Enter Coefficients Salary: ");
        this.setCoefficientsSalary(Double.parseDouble(ip.nextLine()));
        System.out.print("Enter Department Name: ");
        this.setDepartment(ip.nextLine());
    }

    @Override
    protected double calculateSalary() {
        return (this.getCoefficientsSalary()) * 1250000;
    }

    @Override
    public String toString() {
        return "Staff{" + "fullname= " + this.getFullname() +
                ", birthDay= " + birthDay +
                ", coefficientsSalary= " + this.getCoefficientsSalary() +
                ", department= " + departmentName + ", Salary= " + this.calculateSalary() +
                '}';
    }
}
