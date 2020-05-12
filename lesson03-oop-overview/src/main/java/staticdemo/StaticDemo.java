package staticdemo;

public class StaticDemo {
    public static void main(String[] args) {

    }

    private static void printf(String s) {
        System.out.println("Value: " + s);
        //cout(s);
    }

    private void cout(String s) {
        System.out.println("Value: " + s);
        printf(s);
    }
}
