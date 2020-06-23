package inheritance.aabstract;

public class Email extends AbstractEmail {

	@Override
	public void login() {
		System.out.println("hello there ");
		System.out.println("i am overiding method of abstract class ");
		
	}

}
