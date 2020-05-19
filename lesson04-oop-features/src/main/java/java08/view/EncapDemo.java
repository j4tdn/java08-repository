package java08.view;

import java08.encapsulation.Employee;

public class EncapDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setYear(1997);
        // access modifier: default | protected
        // System.out.println("Age: " + emp.getAge());
    }
}
