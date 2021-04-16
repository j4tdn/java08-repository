package persistence;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.Map.Entry;

public class ProjectDto {
	private String deptName;
	private List<SimpleEntry<String, Double>> proBuds;
	private Double totalOfBudget;

	public ProjectDto() {
	}

	public ProjectDto(String deptName, List<SimpleEntry<String, Double>> proBuds, Double totalOfBudget) {
		super();
		this.deptName = deptName;
		this.proBuds = proBuds;
		this.totalOfBudget = totalOfBudget;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
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
		return "ProjectDto [deptName=" + deptName + ", proBuds=" + proBuds + ", totalOfBudget=" + totalOfBudget + "]";
	}

}
