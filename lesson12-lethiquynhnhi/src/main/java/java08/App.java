package java08;

import java08.bean.Trader;
import java08.bean.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("1. Find all transactions in the year 2011 and sort them by value (small to high)");
        List<Transaction> sortedByValueTransactions = inYear2011Transactions(sortAscByValue(mockData()));
        printf(sortedByValueTransactions);
        System.out.println("=====================================");

        System.out.println("2. Find all transactions have value greater than 300 and sort them by trader’s city");
        List<Transaction> sortedByTraderCityTransactions = sortByTraderCity(mockData());
        printf(sortedByTraderCityTransactions);
        System.out.println("====================================");

        System.out.println("3. What are all the unique cities where the traders work?");
        Set<String> uniqueCitiesTransactions = uniqueCities(mockData());
        uniqueCitiesTransactions.forEach(System.out::println);
        System.out.println("====================================");

        System.out.println("4. Find all traders from Cambridge and sort them by name desc");
        List<Trader> sortByNameTraders = sortDesByNameCambridge(sortDesByName(mockData()));
        sortByNameTraders.forEach(System.out::println);
        System.out.println("=====================================");

        System.out.println("5. Return a string of all traders’ names sorted alphabetically");
        System.out.println(sortByNameTraderAlphabeticallly(sortAscByName(mockData())));
        System.out.println("=====================================");

        System.out.println("6. Are any traders based in Milan?");
        List<Trader> milanTraders = milanTraders(mockData());
        milanTraders.forEach(System.out::println);
        System.out.println("====================================");

        System.out.print("7. Count the number of traders in Milan: ");
        System.out.println(milanTraders.size());
        System.out.println("====================================");

        System.out.println("8. Print all transactions’ values from the traders living in Cambridge");
        List<Transaction> cambridgeTransactions = cambridgeTransactions(mockData());
        printf(cambridgeTransactions);
        System.out.println("====================================");

        System.out.println("9. What’s the highest value of all the transactions?");
        System.out.println(getOneValueTransaction(sortDesByValue(mockData())));
        System.out.println("====================================");

        System.out.println("10. Find the transaction with the smallest value");
        System.out.println(getOneValueTransaction(sortAscByValue(mockData())));
    }

    private static List<Transaction> mockData() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        return Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
    }


    private static List<Transaction> sortAscByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
    }

    private static List<Transaction> sortDesByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    // 1
    private static List<Transaction> inYear2011Transactions(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .collect(Collectors.toList());
    }

    private static List<Transaction> sortByTraderCity(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getValue() > 300)
                .sorted(Comparator.comparing(transaction -> transaction.getTrader().getCity()
                ))
                .collect(Collectors.toList());
    }

    private static Set<String> uniqueCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(Collectors.toSet());
    }

    private static List<Trader> sortAscByName(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
    }

    private static List<Trader> sortDesByName(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .sorted(Comparator.comparing(Trader::getName).reversed())
                .collect(Collectors.toList());
    }

    private static List<Trader> sortDesByNameCambridge(List<Trader> traders) {
        return traders.stream()
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .collect(Collectors.toList());
    }

    private static String sortByNameTraderAlphabeticallly(List<Trader> traders) {
        List<String> strings = traders.stream()
                .map(Trader::getName)
                .collect(Collectors.toList());
        strings.sort(Comparator.comparing(Function.identity()));
        return String.join(" ", strings);
    }

    private static List<Trader> milanTraders(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Milan"))
                .collect(Collectors.toList());
    }

    private static List<Transaction> cambridgeTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.toList());
    }

    private static long getOneValueTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getValue)
                .collect(Collectors.toList()).get(0);
    }

    private static void printf(List<Transaction> transactions) {
        transactions.forEach(System.out::println);
    }

}
