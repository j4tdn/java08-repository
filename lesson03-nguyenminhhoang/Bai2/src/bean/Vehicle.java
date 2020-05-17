package bean;

public class Vehicle {
	private String chuXe;
	private String tenXe;
	private float dungTich;
	private float giaXe;

	public Vehicle() {

	}

	public Vehicle(String chuXe, String tenXe, float dungTich, float giaXe) {
		this.chuXe = chuXe;
		this.tenXe = tenXe;
		this.dungTich = dungTich;
		this.giaXe = giaXe;
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}

	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public float getDungTich() {
		return dungTich;
	}

	public void setDungTich(float dungTich) {
		this.dungTich = dungTich;
	}

	public float getGiaXe() {
		return giaXe;
	}

	public void setGiaXe(float giaXe) {
		this.giaXe = giaXe;
	}

	public float thueTruocBa() {
		if (dungTich < 100) {
			return giaXe * 0.01f;
		} else if (dungTich <= 200) {
			return giaXe * 0.03f;
		} else {
			return giaXe * 0.05f;
		}
	}

	public String toString() {
		return chuXe + "\t\t" + tenXe + "\t\t" + dungTich + "\t\t" + giaXe + "   \t" + thueTruocBa();
	}

}
