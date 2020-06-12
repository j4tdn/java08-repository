package java08.inheritance.aabstract;

public abstract class AbstractEmail {
    public abstract void login();

    void login2steps() {
        System.out.println(getClass().getName() + "=> login2steps ...");
    }
}
