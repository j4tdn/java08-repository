package view;

import dao.EmployeeDao;
import persistences.Account;
import persistences.Employee;
import persistences.Project;

import java.util.Arrays;
import java.util.HashSet;

public class DemoFkAssociation {
    public static void main(String[] args) {


        Employee emp1 = new Employee(1,"phduc.10010@gmail.com","e1","e1");
        Employee emp2 = new Employee(2,"phduc.dfsdfsd@gmail.com","e2","e2");


        Project pro1 = new Project(1,"desc1 " , 234);
        Project pro2 = new Project(2,"desc2",543);

        emp1.setProjects(new HashSet<Project>(Arrays.asList(pro1)));

        emp2.setProjects(new HashSet<Project>(Arrays.asList(pro2)));

        EmployeeDao dao = new EmployeeDao();


        dao.save(emp1);
        dao.save(emp2);
    }
}
