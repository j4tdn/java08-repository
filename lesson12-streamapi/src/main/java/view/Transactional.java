package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Transactional {

	public static void main(String[] args) {
		List<Trader> traders = getTraders();
		List<Transaction> transactions = getTransactions(traders);
		
		transactions.stream().collect(Collectors.toMap(Transaction::getId, Function.identity(), (t1,t2) -> t1, LinkedHashMap::new));
		
		Set<Integer> uniqueTrans = new HashSet<>();
		transactions.stream().filter(t -> uniqueTrans.add(t.getId())).collect(Collectors.toList()).forEach(System.out::println);
		
		//C2: 
		transactions.stream().filter(distinctByKey(Transaction::getValue)).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,3,4,2,2,1);
	var x =	numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
	
	private static <T, R> Predicate<T> distinctByKey(Function<T, R> func){
		Set<R> uniqueTrans = new HashSet<>();
		return t -> uniqueTrans.add(func.apply(t));
	}
	
	private static List<Transaction> getTransactions(List<Trader> traders) {
        return List.of(new Transaction(1, traders.get(0), 2011, 300),
                new Transaction(1, traders.get(1), 2012, 1000),
                new Transaction(2, traders.get(0), 2011, 400),
                new Transaction(3, traders.get(1), 2012, 710),
                new Transaction(4, traders.get(3), 2012, 700),
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
