package java08.ex05;

public class ReferenceBook extends Book{
    private double tax;

    public ReferenceBook() {
    }

    public ReferenceBook(String id, double pice, String publisher, double tax) {
        super(id, pice, publisher);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
