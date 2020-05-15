package bean;

public class Vehicle {
	private String idXe;
	private String tenXe;
	private Double giaXe;
	private String chuXe;
	private Double dungTich; 
	public Vehicle() {
		
	}

	public Vehicle(String idXe, String tenXe, Double giaXe, String chuXe, Double dungTich) {
		this.idXe = idXe;
		this.tenXe = tenXe;
		this.giaXe = giaXe;
		this.chuXe = chuXe;
		this.dungTich = dungTich;
	}

	public String getIdXe() {
		return idXe;
	}

	public void setIdXe(String idXe) {
		this.idXe = idXe;
	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public Double getGiaXe() {
		return giaXe;
	}

	public void setGiaXe(Double giaXe) {
		this.giaXe = giaXe;
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	
	
	public Double getDungTich() {
		return dungTich;
	}

	public void setDungTich(Double dungTich) {
		this.dungTich = dungTich;
	}

	public double thueTruocBa() {
		double thue;
		if (dungTich < 100) thue = giaXe*0.01;
			else if((dungTich >= 100) && (dungTich <= 200)) thue = giaXe*0.03;
			else thue = giaXe*0.05;
		
		return thue;
		
	}

	@Override
	public String toString() {
		return "Vehicle [idXe=" + idXe + ", tenXe=" + tenXe + ", giaXe=" + giaXe + ", chuXe=" + chuXe + ", dungTich="
				+ dungTich + "]";
	}
	public void in() {
		System.out.format("%-25s%-20s%15.2f%25.2f%25.2f \n", chuXe, tenXe, dungTich, giaXe, thueTruocBa());
	}
	
	
}
