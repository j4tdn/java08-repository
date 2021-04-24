package dto;

public class EmployeeDepartmentDTO {
	public static final String DEPT_ID = "deptId";
	public static final String DEPT_NAME = "deptName";
	public static final String EMP_ID = "empId";
	public static final String EMP_NAME = "empName";
	public static final String AGE = "age";
	public static final String SALARY = "salary";
	private String deptId;
	private String deptName;
	private String empId;
	private String empName;
	private Integer age;
	private Double salary;
	
	public EmployeeDepartmentDTO() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDepartmentDTO(String deptId, String deptName, String empId, String empName, Integer age,
			Double salary) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
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
	
	
	

}
