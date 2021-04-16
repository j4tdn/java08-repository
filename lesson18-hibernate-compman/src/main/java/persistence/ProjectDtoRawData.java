package persistence;

public class ProjectDtoRawData {
	public static final String DEPT_NAME = "departmentName";
	public static final String PRO_NAME = "projectName";
	public static final String BUDGET = "budget";
	
	private String departmentName;
	private String projectName;
	private Double budget;
	
	

	public ProjectDtoRawData() {
	}


	public ProjectDtoRawData(String departmentName, String projectName, Double budget) {
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



	public Double getBudget() {
		return budget;
	}


	public void setBudget(Double budget) {
		this.budget = budget;
	}


	@Override
	public String toString() {
		return "ProjectDtoRawData [departmentName=" + departmentName + ", projectName=" + projectName + ", budget="
				+ budget + "]";
	}

}
