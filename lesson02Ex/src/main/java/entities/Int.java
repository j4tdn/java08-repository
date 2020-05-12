package entities;

public class Int {
    public int value;

    public Int(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
