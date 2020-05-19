package inheritance.aabstract;

public abstract class AbstractEmail { //co the chua ham truu tuong va ko truu tuong
	
	public abstract void login(); //ham truu tuong
	
	public void login2steps() {
		System.out.println(getClass().getName() + " => login2steps ...");
	}
}
