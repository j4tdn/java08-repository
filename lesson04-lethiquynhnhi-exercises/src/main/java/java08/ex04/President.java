package java08.ex04;

import java.util.Scanner;

public class President extends People {
    private double positionCoefficient;

    public President() {
    }

    public President(String fullname, int birthYear, double coefficientsSalary, double positionCoefficient) {
        super(fullname, birthYear, coefficientsSalary);
        this.positionCoefficient = positionCoefficient;
    }

    public double getPositionCoefficient() {
        return positionCoefficient;
    }

    public void setPositionCoefficient(double positionCoefficient) {
        this.positionCoefficient = positionCoefficient;
    }

    @Override
    protected void inputInfo() {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Name of President: ");
        this.setFullname(ip.nextLine());
        System.out.print("Enter Birth Year of President: ");
        this.setBirthYear(Integer.parseInt(ip.nextLine()));
        System.out.print("Enter Coefficients Salary: ");
        this.setCoefficientsSalary(Double.parseDouble(ip.nextLine()));
        System.out.print("Enter Position Coefficient: ");
        this.setPositionCoefficient(Double.parseDouble(ip.nextLine()));
    }

    @Override
    protected double calculateSalary() {
        return (this.getCoefficientsSalary() + this.getPositionCoefficient()) * 3000000;
    }

    @Override
    public String toString() {
        return "President{" +
                "fullname= " + this.getFullname() + ", birthYear= " + this.getBirthYear()
                + ", coefficientsSalary= " + this.getCoefficientsSalary() +
                ", positionCoefficient= " + positionCoefficient + ", Salary= " + this.calculateSalary() +
                '}';
    }
}
