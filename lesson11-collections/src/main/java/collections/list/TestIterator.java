package collections.list;

import java.util.*;

public class TestIterator {
    public static void main(String[] args) {

        List<Integer> hello = TestIterator.getArrList();

        Iterator<Integer> iterator = hello.iterator();

        System.out.println(iterator.hasNext());


        while(iterator.hasNext()){
            Integer digit = iterator.next();
            if(digit == 1){
                iterator.remove();
            }
        }

        hello.forEach(t -> System.out.println(t));


        Optional<Integer> hi = hello.stream().findFirst();
        Integer integer = hi.get();

        List<Integer> digits = Arrays.asList(new Integer(5), new Integer(10));

        digits.add(new Integer(10));

        System.out.println(digits.getClass());

        digits.forEach(t -> System.out.println(t));


    }

    private static List<Integer> getArrList(){
        List<Integer> hello = new ArrayList<>();
        hello.add(1);
        hello.add(1);
        hello.add(4);
        hello.add(5);
        return hello ;
    }

}
