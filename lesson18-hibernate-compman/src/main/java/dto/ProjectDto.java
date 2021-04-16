package dto;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map.Entry;

public class ProjectDto {


	
	private String departmentName;
	private List<SimpleEntry<String, Integer>> proBuds;
	private Integer totalOfBudget;

	public ProjectDto() {
		// TODO Auto-generated constructor stub
	}

	public ProjectDto(String departmentName, List<SimpleEntry<String, Integer>> proBuds, Integer totalOfBudget) {
		super();
		this.departmentName = departmentName;
		this.proBuds = proBuds;
		this.totalOfBudget = totalOfBudget;
	}

	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<SimpleEntry<String, Integer>> getProBuds() {
		return proBuds;
	}

	public void setProBuds(List<SimpleEntry<String, Integer>> proBuds) {
		this.proBuds = proBuds;
	}

	public Integer getTotalOfBudget() {
		return totalOfBudget;
	}

	public void setTotalOfBudget(Integer totalOfBudget) {
		this.totalOfBudget = totalOfBudget;
	}

	@Override
	public String toString() {
		return "ProjectDto [departmentName=" + departmentName + ", proBuds=" + proBuds + ", totalOfBudget="
				+ totalOfBudget + "]";
	}

}
