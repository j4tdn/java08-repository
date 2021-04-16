package dto;

public class ProjectDtoRawData {
	public static final String DEPT_NAME = "departmentName";
	public static final String PRO_NAME = "projectName";
	public static final String BUDGET = "budget";
	
	private String departmentName;
	private String projectName;
	private Integer budget;
	
	public ProjectDtoRawData() {
	}

	public ProjectDtoRawData(String departmentName, String projectName, Integer budget) {
		super();
		this.departmentName = departmentName;
		this.projectName = projectName;
		this.budget = budget;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	
	
}
