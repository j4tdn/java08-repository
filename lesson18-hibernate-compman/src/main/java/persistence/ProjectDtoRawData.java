package persistence;

public class ProjectDtoRawData {

	public static String DEPT_NAME = "deptName";
	public static String PROJECT_DETAILS = "projectDetails";
	public static String BUDGET = "budget";

	private String deptName;

	private String projectDetails;

	private Double budget;

	public ProjectDtoRawData() {
	}

	public ProjectDtoRawData(String deptName, String projectDetails, Double budget) {
		this.deptName = deptName;
		this.projectDetails = projectDetails;
		this.budget = budget;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return deptName + " | " + projectDetails + " | " + budget;
	}

}
