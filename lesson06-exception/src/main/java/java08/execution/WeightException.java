package java08.execution;

import java.io.Serializable;

public class WeightException extends Exception implements
        Serializable {
    private static final long serialVersionUID = 4774057843684110798L;

    public WeightException() {
        super();
    }

    public WeightException(String s) {
        super(s);
    }


}
