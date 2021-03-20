package view;

import dao.EmployeeDao;
import persistences.Account;
import persistences.Employee;

import java.util.Arrays;
import java.util.HashSet;

public class DemoFkAssociation {
    public static void main(String[] args) {

        EmployeeDao dao = new EmployeeDao();

        Employee emp = new Employee(69,"phduc.10010@gmail.com","Teo","Le",
                new HashSet<Account>(Arrays.asList(new Account(1,"phd"),new Account(2,"sdfsdf"))));

        dao.save(emp);

    }
}
