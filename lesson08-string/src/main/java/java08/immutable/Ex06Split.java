package java08.immutable;

import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex06Split {
    public static void main(String[] args) {
        String student = "LeNa-LeTeo-HoangNa-VanTeo";
        String[] studentInfo = student.split("-", 2);

        System.out.println("lenght: " + studentInfo.length);
        for (String info : studentInfo) {
            System.out.println(info);
        }

        System.out.println("==================");
        /*String[] studentInfoPattern = Pattern.compile("-").split(student);
        for(String info:studentInfoPattern){
            System.out.println(info);
        }*/

        Stream<String> studentInfoPattern = Pattern.compile("-").splitAsStream(student);

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String info) {
                System.out.println("-> " + info);
            }
        };
        //Stream#forEach
        studentInfoPattern.forEach(consumer);

        //Ex06Split#forEach
        forEach(studentInfo, consumer);
    }

    private static void forEach(String[] students, Consumer<String> consumer){
        for(String student :students){
            //will call accept method at runtime
            consumer.accept(student);
        }
    }
}
