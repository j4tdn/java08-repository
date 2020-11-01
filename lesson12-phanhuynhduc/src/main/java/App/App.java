package App;

import Bean.Trader;
import Bean.Transaction;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        // data source ;
        List<Transaction> transactions = getData();


        // 1
        List<Transaction> ex01 = transactions.stream().filter(t -> t.getYear() == 2011).sorted((o1, o2) -> o1.getValue() - o2.getValue()).collect(Collectors.toList());
//            ex01.forEach(t -> System.out.println(t));
        System.out.println(ex01.getClass());

        //2
        List<Transaction> ex02 = transactions.stream().filter(t -> t.getValue() > 300).sorted((o1, o2) -> {
            if (o1.getTrader().getCity().compareTo(o2.getTrader().getCity()) == 0) {
                return o1.getValue() - o2.getValue();
            }
            return o1.getTrader().getCity().compareTo(o2.getTrader().getCity());
        }).collect(Collectors.toList());
//        ex02.forEach(t -> System.out.println(t));



        //3
       List<String> ex03 = transactions.stream().map(new Function<Transaction, String>() {
           @Override
           public String apply(Transaction transaction) {
               return transaction.getTrader().getCity();
           }
       }).distinct().collect(Collectors.toList());
//        ex03.forEach(t -> System.out.println( "ex03" +t));

        //4
        List<Trader> ex04 = transactions.stream().map(t -> t.getTrader()).filter(t -> t.getCity().equals("Cambridge")).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
        Set<Trader> ex044 = new LinkedHashSet<>(ex04);
//        ex044.forEach(t -> System.out.println(t));
//        ex04.forEach(t -> System.out.println(t));


        //5
        List<String> ex05 = transactions.stream().map(transaction -> transaction.getTrader().getName()).sorted(String::compareTo).collect(Collectors.toList());
        Set<String> ex055 = new LinkedHashSet<>(ex05);
//        ex055.forEach(t -> System.out.println(t));

        // 6 7
        List<Trader> traders = transactions.stream().map(Transaction::getTrader).collect(Collectors.toList());
        Set<Trader> traderSet = new LinkedHashSet<>(traders);
        traderSet.forEach(System.out::println);

         long traderMilan  =traderSet.stream().filter(trader -> trader.getCity().equals("Milan")).count();
        System.out.println(traderMilan);

       // 8
        List<Integer> ex08 = transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge")).map(transaction -> transaction.getValue()).collect(Collectors.toList());
        ex08.forEach(System.out::println);


        // 9
        Optional<Transaction> highestValue = transactions.stream().max((t1, t2) -> t1.getValue() - t2.getValue());

        highestValue.ifPresent(System.out::println);

        // 10
        Optional<Transaction> smallestValue = transactions.stream().min((t1,t2) -> t1.getValue() - t2.getValue());
        smallestValue.ifPresent(System.out::println);



    }









    private static List<Transaction> getData(){
        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan  = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");


        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
                );


        return transactions ;
    }


}
