package java08.ex01;

import java.io.Serializable;

public class StringException extends Exception implements
        Serializable {

    private static final long serialVersionUID = 4774057843684110798L;

    public StringException() {
        super();
    }

    public StringException(String s) {
        super(s);
    }
}
