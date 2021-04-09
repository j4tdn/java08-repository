package view;

import dao.EmployeeDao;
import persistence.Account;
import persistence.Employee;

public class DemoFkAssociation {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        Employee emp = new Employee(12, "ab@gmail.com", "Teo", "Le");
        Account a1 = new Account(1, "1111");
        Account a2 = new Account(2, "1111");
        emp.getAccounts().add(a1);
        emp.getAccounts().add(a2);

        dao.save(emp);
        System.out.println(emp);
        System.out.println(emp.getAccounts().size());
    }
}
