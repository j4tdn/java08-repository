package java08.immutable;

public class Ex01 {
    public static void main(String[] args) {
        // String literal
        String l1 = "hello";
        String l2 = "hello";
        System.out.println("isEqual: " + l1.equals(l2));
        System.out.println( "== Address: " + (l1==l2));

        System.out.println("=====================");
        // String immutable
        String o1 = new String("welcome");
        String o2 = new String("welcome");
        System.out.println("isEqual: " + o1.equals(o2));
        System.out.println("== Address: " + (o1==o2));
    }
}
