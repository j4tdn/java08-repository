package java08.view;

import java08.bean.Trader;
import java08.bean.Transaction;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Transactional {
    public static void main(String[] args) {
        List<Trader> traders = getTraders();
        List<Transaction> transactions = getTransactions(traders);

        // 1. Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> first = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        // 2. Find all transactions have value greater than 300 and sort them by trader’s city
        List<Transaction> second = transactions.stream()
                .filter(t -> t.getValue() > 300)
                .sorted(comparing(t -> t.getTrader().getCity()))
                .collect(toList());

        // 3. What are all the unique cities where the traders work?
        List<String> three = traders.stream()
                .map(Trader::getCity)
                .distinct().collect(toList());

        // 3.1 What are all the unique transactions where the traders work?
        transactions.stream()
                .collect(toMap(Transaction::getId,
                        Function.identity(),
                        (t1, t2) -> t1,
                        LinkedHashMap::new));

        Set<Integer> uniqueTrans = new HashSet<>();
        transactions.stream()
                .filter(distinctByKey(Transaction::getId))
                .collect(toList()).forEach(System.out::println);

        // 3.2
        List<Integer> numbers = Arrays.asList(2, 1, 1, 2, 3, 3, 4);
        Map<Integer, Long> qtyMap = numbers.stream()
                .collect(groupingBy(Function.identity(), counting()));
        System.out.println(qtyMap);

//        qtyMap.entrySet().stream().filter(entry)

        // 4. Find all traders from Cambridge and sort them by name desc.
        traders.stream().filter(t -> "Cambridge".equals(t.getCity()))
                .sorted(comparing(Trader::getName).reversed())
                .collect(toList());

        // 5. Return a string of all traders’ names sorted alphabetically.
        String fifth = traders.stream()
                .map(Trader::getName)
                .sorted()
                .collect(joining(", "));
        System.out.println("Trader's name: " + fifth);

        // 6. Are any traders based in Milan?
        boolean isMilanBased = traders.stream().anyMatch(t -> "Milan".equals(t.getCity()));
        System.out.println("Milan Based ?: " + isMilanBased);

        // 7. Count the number of traders in Milan.
        long count = traders.stream().filter(t -> "Milan".equals(t.getCity())).count();
        System.out.println("Milan: " + count);

        // 8. Print all transactions’ values from the traders living in Cambridge.
        transactions.stream()
                .filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .collect(toList());

        // 9. What’s the highest value of all the transactions?
        Integer max = transactions.stream()
                .max(comparing(Transaction::getValue))
                .map(Transaction::getValue).orElse(Integer.MIN_VALUE);

//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        Optional<Integer> optional = Optional.ofNullable(max);
        System.out.println("optional: " + optional);

        //Stream<Integer> = Stream<T>
        Integer max2 = transactions.stream()
                .map(Transaction::getValue)
                .max(comparing(Function.identity()))
                .orElse(Integer.MIN_VALUE);

        // IntStream, DoubleStream, LongStream: Primitive Stream
        Integer max3 = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .orElse(Integer.MIN_VALUE);

        // 11. Sum of Transaction value in year 2021
        int sum = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .mapToInt(Transaction::getValue)
                .sum();

        transactions.stream()
                .map(Transaction::getValue)
//                .reduce((o1, o2) -> o1 + o2)
                .reduce(Integer::sum);

        Integer a = transactions.stream()
                .map(Transaction::getValue)
//                .reduce(Integer::max)
                .reduce((o1, o2) -> o1 > o2 ? o1 : o2)
                .orElse(Integer.MIN_VALUE);

        System.out.println("a: " + a);

    }

    private static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
        Set<R> uniqueTrans = new HashSet<>();
        return t -> uniqueTrans.add(func.apply(t));
    }


    private static List<Transaction> getTransactions(List<Trader> traders) {
        return List.of(new Transaction(1, traders.get(0), 2011, 300),
                new Transaction(1, traders.get(1), 2012, 1000),
                new Transaction(2, traders.get(0), 2011, 400),
                new Transaction(2, traders.get(1), 2012, 710),
                new Transaction(5, traders.get(3), 2012, 700),
                new Transaction(5, traders.get(2), 2012, 950));

    }

    private static List<Trader> getTraders() {
        return List.of(new Trader("Raoul", "Cambridge"),
                new Trader("Mario", "Milan"),
                new Trader("Alan", "Cambridge"),
                new Trader("Alan", "Cambridge"),
                new Trader("Brian", "Cambridge"));

    }
}
