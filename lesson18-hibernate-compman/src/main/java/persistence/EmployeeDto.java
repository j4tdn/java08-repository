package persistence;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDto {
	
	public static String DEPT_ID = "deptId";
	public static String DEPT_NAME = "deptName";
	public static String EMP_ID = "empId";
	public static String EMP_NAME = "empName";
	public static String AGE = "age";
	public static String SALARY = "salary";
	
	private String deptId;

	private String deptName;

	private String empId;

	private String empName;

	private Integer age;

	private Double salary;

}
