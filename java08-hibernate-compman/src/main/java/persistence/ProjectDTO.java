package persistence;

import java.util.List;
import java.util.Map.Entry;

public class ProjectDTO {
	private String dept_name;
	private List<Entry<String , Double>> proBubs;
	private Double totalOfBubget;
	
	public ProjectDTO() {
	// TODO Auto-generated constructor stub
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public List<Entry<String, Double>> getProBubs() {
		return proBubs;
	}

	public void setProBubs(List<Entry<String, Double>> proBubs) {
		this.proBubs = proBubs;
	}

	public Double getTotalOfBubget() {
		return totalOfBubget;
	}

	public void setTotalOfBubget(Double totalOfBubget) {
		this.totalOfBubget = totalOfBubget;
	}

	/**
	 * @param dept_name
	 * @param proBubs
	 * @param totalOfBubget
	 */
	public ProjectDTO(String dept_name, List<Entry<String, Double>> proBubs, Double totalOfBubget) {
		super();
		this.dept_name = dept_name;
		this.proBubs = proBubs;
		this.totalOfBubget = totalOfBubget;
	}

	@Override
	public String toString() {
		return "ProjectDTO [dept_name=" + dept_name + ", proBubs=" + proBubs + ", totalOfBubget=" + totalOfBubget + "]";
	}
	
	

}
