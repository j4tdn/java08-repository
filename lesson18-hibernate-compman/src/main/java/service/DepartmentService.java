package service;

import persistence.Department;
import persistence.DepartmentDao;

import java.util.List;

public class DepartmentService {
    private DepartmentDao departmentDao;

    public DepartmentService() {
        this.departmentDao = new DepartmentDao();
    }

    public List<Department> getDepartments() {
        return departmentDao.getDepartments();
    }
}
