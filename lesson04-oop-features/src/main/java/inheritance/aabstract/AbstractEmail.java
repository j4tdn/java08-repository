package inheritance.aabstract;

public abstract class AbstractEmail {

	public abstract void login();// ham bat buoc ke thua trong lop con

	public void login2Steps() {
System.out.println(getClass().getName()+" login2steps.......");
	}

}
