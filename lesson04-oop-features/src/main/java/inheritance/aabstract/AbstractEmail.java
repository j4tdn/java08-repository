package inheritance.aabstract;

public abstract class  AbstractEmail {
	public abstract void login();
	
	
	public void login2Step() {
		System.out.println(getClass().getName() + "==> login2step");
	}
}
