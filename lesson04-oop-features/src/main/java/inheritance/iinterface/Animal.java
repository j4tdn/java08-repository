package inheritance.iinterface;

public interface Animal {

	// Method has 2 parts
	// 1. declaration : phan khai bao
	// 2. implementation: phan thuc thi

	// abstract method: ham truu tuong: only has declaration (ham khong co body)
	// method's access modifier default in interface is public
	void move();

	void eat();
}
