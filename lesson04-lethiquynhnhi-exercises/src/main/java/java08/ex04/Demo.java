package java08.ex04;

public class Demo {
    public static void main(String[] args) {
        People president = new President();
        People departmentManager = new DepartmentManager();
        People staff1 = new Staff();
        People staff2 = new Staff();
        president.inputInfo();
        departmentManager.inputInfo();
        staff1.inputInfo();
        staff2.inputInfo();
        System.out.println("Information of President: " + president.toString());
        System.out.println("Information of Department Manager: " + departmentManager.toString());
        System.out.println("Information of Staff 1: " + staff1.toString());
        System.out.println("Information of Staff 2: " + staff2.toString());
    }
}
