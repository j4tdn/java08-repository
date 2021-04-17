package persistence;

import java.util.List;
import java.util.Map.Entry;

public class ProjectDTORawData {
	private String deptName;
	private String proName;
	private Double Bubget;
	
	public ProjectDTORawData() {
	// TODO Auto-generated constructor stub
	}

	public String getDept_name() {
		return deptName;
	}

	public void setDept_name(String dept_name) {
		this.deptName = dept_name;
	}

	

	public String getPro_name() {
		return proName;
	}

	public void setPro_name(String pro_name) {
		this.proName = pro_name;
	}

	public Double getBubget() {
		return Bubget;
	}

	public void setBubget(Double Bubget) {
		this.Bubget = Bubget;
	}

	

	/**
	 * @param dept_name
	 * @param pro_name
	 * @param totalOfBubget
	 */
	public ProjectDTORawData(String dept_name, String pro_name, Double Bubget) {
		super();
		this.deptName = dept_name;
		this.proName = pro_name;
		this.Bubget = Bubget;
	}

	@Override
	public String toString() {
		return "ProjectDTORawData [dept_name=" + deptName + ", proName=" + proName + ", Bubget="
				+ Bubget + "]";
	}

	

}
