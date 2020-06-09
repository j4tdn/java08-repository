package java08.ex04;

public class People {

    private String fullname;
    private int birthYear;
    private double coefficientsSalary;

    public People() {
    }

    public People(String fullname, double coefficientsSalary) {
        this.fullname = fullname;
        this.coefficientsSalary = coefficientsSalary;
    }

    public People(String fullname, int birthYear, double coefficientsSalary) {
        this.fullname = fullname;
        this.birthYear = birthYear;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    protected void inputInfo(){

    }

    protected double calculateSalary(){
        return 0;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", birthYear=" + birthYear +
                ", coefficientsSalary=" + coefficientsSalary +
                '}';
    }
}
