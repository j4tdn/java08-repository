package collections.set;

public class HashcodeEquals {
    // phong van lun lun hoi
    public static void main(String[] args) {

        // hashcode vs identityHashcode
        // hashcode :   +convert object value to hash value by function
                //      +able to override

        // identityHashcode : object memory address
                            // cannot override

        String s1 = new String("hello");
        String s2 = "hello";

        System.out.println("E1 : "+ (s1==s2));
        System.out.println("s1 hashcode " +s1.hashCode());
        System.out.println("s2 hashcode " + s2.hashCode());

        System.out.println("+++++++++++++++");
        System.out.println("s1 identityHashCode  " + System.identityHashCode(s1));
        System.out.println("s1 identityHashCode  " + System.identityHashCode(s2));



    }
}
