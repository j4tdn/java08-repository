package Bai1; 

public class Student {
	
	private int id ;
	private String name ;
	private float diemLT ;
	private float diemTH;
	
	//constructor
	
	public Student() {
		this.id = 0 ;
		this.name = "";
		this.diemLT = 0;
		this.diemTH = 0;
	}
	public Student(int id, String name , float diemLT , float diemTH) {
		this.id = id; 
		this.name = name ;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	
	
	
	//method 
	
	public int getId() {
		return this.id ;
	}
	public void setId(int id) {
		this.id = id ;
		
	}
	
	public String getName() {
		return this.name ;
	}
	public void setName(String name) {
		this.name = name ;
	}
	
	public float getDiemLT() {
		return this.diemLT;
	}
	public void setDiemLT(float diem) {
		this.diemLT = diem;
	}
	
	public float getDiemTH() {
		return this.diemTH;
	}
	public void setDiemTH(float diem) {
		this.diemTH = diem;
	}
	
	public float calDiemTB() {
		return (this.diemLT + this.diemTH) /2;
	}
	
	
	@Override
	public String toString() {
		return this.id + "\t" + this.name + "\t" + this.diemLT + "\t" + this.diemTH + "\t" + this.calDiemTB();
	}
	
	
	
	
	
	
	
	
	
}