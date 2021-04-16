package persistence;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;


public class ProjectDTO {
	private String departmentName;
	private List<SimpleEntry<String, Double>> proBuds;
	private Double totalOfBudget;
	
	public ProjectDTO() {
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public List<SimpleEntry<String, Double>> getProBuds() {
		return proBuds;
	}

	public void setProBuds(List<SimpleEntry<String, Double>> proBuds) {
		this.proBuds = proBuds;
	}

	public Double getTotalOfBudget() {
		return totalOfBudget;
	}

	public void setTotalOfBudget(Double totalOfBudget) {
		this.totalOfBudget = totalOfBudget;
	}

	@Override
	public String toString() {
		return "ProjectDTO [departmentName=" + departmentName + ", proBuds=" + proBuds + ", totalOfBudget="
				+ totalOfBudget + "]";
	}
}
