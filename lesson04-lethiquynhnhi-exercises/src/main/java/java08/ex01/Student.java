package java08.ex01;

public class Student {
    private int mssv;
    private String fullname;
    private float theoreticalPoint;
    private float practicePoint;

    public Student() {
    }

    public Student(int mssv, String fullname, float theoreticalPoint, float practicePoint) {
        this.mssv = mssv;
        this.fullname = fullname;
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoint = practicePoint;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(float theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public float getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(float practicePoint) {
        this.practicePoint = practicePoint;
    }

    public float calculateAveragePoint(){
        return (this.getTheoreticalPoint() + this.getPracticePoint()) / 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mssv=" + mssv +
                ", fullname='" + fullname + '\'' +
                ", theoreticalPoint=" + theoreticalPoint +
                ", practicePoint=" + practicePoint +
                '}';
    }
}
