package view;

import dao.AccountDao;
import dao.EmployeeDao;
import dao.HibernateAccountDao;
import dao.HibernateEmployeeDao;
import persistence.jointable.Account;
import persistence.jointable.Employee;

public class DemoFkAssociation {
    private static AccountDao accountDao;
    private static EmployeeDao employeeDao;

    static {
        accountDao = new HibernateAccountDao();
        employeeDao = new HibernateEmployeeDao();
    }

    public static void main(String[] args) {
        Account account = new Account(123, "123-456-789");

        accountDao.save(account);
//

//	}
        Employee employee = new Employee(1, "Le", "Na", "le_teo@gmail.com",account);
        employeeDao.save(employee);

        Employee result =	employeeDao.get(1);
        System.out.println(result);


        // tuy de lazy nhung hibernate no cache lai giup minh nen khi dung getAccount thi van ra account cua employee
        Account accountResult = result.getAccount();
        System.out.println("account result " +accountResult.getId());



    }
}
