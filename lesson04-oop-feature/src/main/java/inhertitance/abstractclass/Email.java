package inhertitance.abstractclass;

public class Email extends AbstractEmail{

	@Override
	public void login() {
		System.out.println(getClass().getName() + " => login");
	}

}
