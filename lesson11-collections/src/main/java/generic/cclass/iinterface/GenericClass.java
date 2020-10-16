package generic.cclass.iinterface;

import generic.Conditional;

public class GenericClass {
    public static void main(String[] args) {
    // reflecttion
        System.out.println("class : " + GenericClass.class.getSimpleName());

        JavaList<String> sequences = new JavaList<>();

        sequences.add("phd");
        sequences.add("hello");
        sequences.add("cath11");


        System.out.println("size" + sequences.getSize());
        System.out.println(sequences);

//        System.out.println(sequences.count(new Conditional<String>() {
//            @Override
//            public boolean test(String digit) {
//                return digit.equals("phd");
//            }
//        }));
        System.out.println(sequences.count(sequence -> sequence.equals("phd")));
    }
}
