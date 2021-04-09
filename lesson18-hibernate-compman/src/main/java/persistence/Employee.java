package persistence;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    private String employeeId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "salary")
    private Double salary;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private Department department;

    public Employee() {
    }

    public Employee(String employeeId, String empName, Integer age, Double salary) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
