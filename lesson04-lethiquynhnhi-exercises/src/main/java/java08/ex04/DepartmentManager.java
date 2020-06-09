package java08.ex04;

import java.util.Scanner;

public class DepartmentManager extends People {
    private int amountOfStaffs;

    public DepartmentManager() {
    }

    public DepartmentManager(String fullname, int birthYear, double coefficientsSalary, int amountOfStaffs) {
        super(fullname, birthYear, coefficientsSalary);
        this.amountOfStaffs = amountOfStaffs;
    }

    public int getAmountOfStaffs() {
        return amountOfStaffs;
    }

    public void setAmountOfStaffs(int amountOfStaffs) {
        this.amountOfStaffs = amountOfStaffs;
    }

    @Override
    protected void inputInfo() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter name of Department Manager: ");
        this.setFullname(ip.nextLine());

        System.out.print("Enter Birth Year of Department Manager: ");
        this.setBirthYear(Integer.parseInt(ip.nextLine()));

        System.out.print("Enter Coefficients Salary: ");
        this.setCoefficientsSalary(Double.parseDouble(ip.nextLine()));

        System.out.print("Enter Amount Of Staffs: ");
        this.setAmountOfStaffs(Integer.parseInt(ip.nextLine()));
    }

    @Override
    protected double calculateSalary() {
        return (this.getCoefficientsSalary()) * 2200000;
    }

    @Override
    public String toString() {
        return "DepartmentManager{" + "fullname= " + this.getFullname()
                + ", birthYear= " + this.getBirthYear() + ", coefficientsSalary= " + this.getCoefficientsSalary()
                + ", amountOfStaffs= " + amountOfStaffs + ", Salary= " + this.calculateSalary() +
                '}';
    }
}
