package view;

public class EqualsDemo {
    public static void main(String[] args) {
        // primitive type
        int a = 10;
        int b = 5;
        System.out.println("a==b:" + (a == b));

        Integer ia = 10;
        Integer ib = 5;
        Integer ic = 5;
        Integer id = new Integer(20);
        Integer ie = new Integer(20);
        System.out.println("ia code: " + System.identityHashCode(ia));
        System.out.println("ib code: " + System.identityHashCode(ib));
        System.out.println("ic code: " + System.identityHashCode(ic));

        System.out.println("ia==ib:" + (ia == ib));
        System.out.println("ib==ic:" + (ib == ic));
        System.out.println("id==ie:" + (id.equals(ie)));

        String sa = "hello";
        String sb = "xinchao";
        System.out.println("sa==sb: " + (sa == sb));
        System.out.println("sa==sb: " + sa.equals(sb));

        /** Integer, String, Float, Double
         * Literal: constant pool (heap)
         * Object: heap (not constant pool)
         */

    }
}
