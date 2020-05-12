package java08.datatype;

public class Ex04ObjectEx {
    public static void main(String[] args) {
        /*char c = 'x';
        System.out.println("isDigit: " + isDigit(c));
        System.out.println("isDigit: " + Character.isDigit(c));*/

        //Ex
        Integer a = 10;
        System.out.println("a: " + a);
        System.out.println("a system hashcode: " + System.identityHashCode(a));
        modified(a);
        System.out.println("a: " + a);
        System.out.println("==================");

        Integer x = new Integer(17);
        Integer y = new Integer(22);
        x = swap(y, y = x);
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        //Co bao nhieu cach tao doi tuong trong java
    }

    private static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    private static void modified(Integer a) {
        System.out.println("a1 system hashcode: " + System.identityHashCode(a));
        a = 20;
        System.out.println("a2 system hashcode: " + System.identityHashCode(a));

    }

    private static Integer swap(Integer a, Integer b) {
        return a;
    }

}

