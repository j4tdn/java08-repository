package inheritance.multiple;

public interface Interface02 {
void method02();
	
default void log(String str) {
	System.out.println("interface 02: =>"+str);
}

static void display() {
	System.out.println("interface 02: => display");
}

}
