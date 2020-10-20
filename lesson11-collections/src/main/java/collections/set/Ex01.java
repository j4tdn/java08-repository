package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {

        //Customize equality-checking mechanism
        // List<T> : equals
        // Set<T> : equals
              //      hashcode => convert object to hash value
        //                     => store hash value

        // hash code ban dau cua object la dia chi cua doi tuong , nhung
        //sau do vi li do gi do thi ho overide lai tren may subclass, nen khong phai la dia chi bo nho nua
        // vi du nhu String


        String a = new String("a");



        Set<Integer> digits = new HashSet<>();
        digits.add(13);
        digits.add(7);
        digits.add(18);
        digits.add(10);

        System.out.println("size" + digits.size());

       Integer firstDigit =   digits.iterator().next();
        System.out.println("first digits : " +firstDigit );
    }
}
