package inheritance.multiple;

public interface Interface01 {
	
	void method01(); //abstract
	
	default void log(String str) {
		System.out.println("Interface01: "+ str);
	}
	
	static void display() { //thuoc pham vi cha, nen ko duoc override lai
		System.out.println("Interface01: display()");
	}
}
