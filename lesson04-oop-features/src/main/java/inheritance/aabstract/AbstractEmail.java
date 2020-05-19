package inheritance.aabstract;

public abstract class AbstractEmail {
	public abstract void login() ;   // hàm trừu tượng, khi được kế thừa thì bắt buộc overing
	
	public void login2Steps() {
		System.out.println(getClass().getName()+ " => login2steps ...");
	}
}
