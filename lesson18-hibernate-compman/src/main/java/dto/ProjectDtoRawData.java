package dto;

import java.util.List;
import java.util.Map.Entry;

public class ProjectDtoRawData {
	public static final String DEPT_NAME = "deptName";
	public static final String PRO_NAME = "proName";
	public static final String BUDGET = "budget";
	
	private String deptName;
	private String proName;
	private Double budget;
	
	public ProjectDtoRawData() {
	}

	public ProjectDtoRawData(String deptName, String proName, Double budget) {
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
		return "Depart " +deptName+ " Project " + proName + " Budget: " + budget;
	}
	
}
