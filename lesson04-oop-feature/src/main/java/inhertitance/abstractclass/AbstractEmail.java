package inhertitance.abstractclass;

public abstract class AbstractEmail {
	public abstract void login();

	public void login2steps() {
		System.out.println(getClass().getName() + " => login 2 steps ...");
	}
}
