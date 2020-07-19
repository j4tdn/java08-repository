package java08.ex02;

public class AccountException extends RuntimeException {
    public AccountException() {
        super();
    }

    public AccountException(String s) {
        super(s);
    }
}