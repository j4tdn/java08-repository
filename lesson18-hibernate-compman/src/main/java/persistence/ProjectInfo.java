package persistence;

public class ProjectInfo {
	
	public static String DEPT_NAME = "deptName";
	public static String PROJECT_DETAILS = "projectDetails";
	public static String BUDGET = "budget";
	
	private String deptName;

	private String projectDetails;

	private Double budget;

	@Override
	public String toString() {
		return deptName + " | " + projectDetails + " | " + budget;
	}

}
