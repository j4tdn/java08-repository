package dto;

public class ProjectDto {
	private String departmentName;
	private String projectName;
	private Integer budget;

	public ProjectDto() {
		// TODO Auto-generated constructor stub
	}

	public ProjectDto(String departmentName, String projectName, Integer budget) {
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
