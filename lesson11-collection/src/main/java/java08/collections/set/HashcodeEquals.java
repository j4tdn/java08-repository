package java08.collections.set;

public class HashcodeEquals {
    public static void main(String[] args) {
        //hashcode vs identityHashCode
        /**
         * hashcode: convert object value to hash value by function
         : able to override

         identitiyHashcode: object memory
         : cann't override
         **/

        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println("E1: " + (s1 == s2));
        System.out.println("s1 code: " + s1.hashCode());
        System.out.println("s2 code: " + s2.hashCode());

        System.out.println("s1 icode: " + System.identityHashCode(s1));
        System.out.println("s2 icode: " + System.identityHashCode(s2));
    }
}
