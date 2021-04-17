package persistence;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;

public class ProjectDto {

	public static String DEPT_NAME = "deptName";
	public static String PROJECT_DETAILS = "projectDetails";
	public static String BUDGET = "budget";

	private String deptName;

	private List<SimpleEntry<String, Double>> projectDetails;

	private Double budget;

	public ProjectDto() {
	}

	public ProjectDto(String deptName, List<SimpleEntry<String, Double>> projectDetails, Double budget) {
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

	public List<SimpleEntry<String, Double>> getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(List<SimpleEntry<String, Double>> projectDetails) {
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
