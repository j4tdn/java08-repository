package persistence;


public class ProjectRawDto {
	public static final String DEPT_NAME = "deptName";
	public static final String PRO_NAME = "proName";
	public static final String BUDGET = "budget";
	private String deptName;
	private String proName;
	private Double budget;
	
	public ProjectRawDto() {
		
	}
	
	public ProjectRawDto(String deptName, String proName, Double budget) {
		super();
		this.deptName = deptName;
		this.proName = proName;
		this.budget = budget;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "ProjectDto " + deptName + ", " + proName + ", " + budget;
	}

}
