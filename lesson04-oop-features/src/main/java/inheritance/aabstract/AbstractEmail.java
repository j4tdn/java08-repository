package inheritance.aabstract;

public abstract class AbstractEmail {
	public abstract void login();
	public void login2steps() {
		System.out.println(getClass().getName() + " => login2steps ...");
		
	}

}