package java08.polymorphism.object;

public class Man extends Person {
    @Override
    public String getGender() {
        return "Male";
    }

    @Override
    public String toString() {
        return "Man ==> toString";
    }
}
