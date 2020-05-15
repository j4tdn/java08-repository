package j4t.view;

import java.lang.reflect.Method;

public class Ex04Client {
	public static void main(String[] args) throws Exception, SecurityException {
		Ex03Device.android();
		Ex03Device c = new Ex03Device();
		Method m = Ex03Device.class.getDeclaredMethod("iphone");
		// Using setAccessible() method
		m.setAccessible(true);
		// Using invoke() method
		m.invoke(c);
	}
}
	