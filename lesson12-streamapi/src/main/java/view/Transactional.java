package view;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
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
		
		// 1.Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> first = transactions.stream()
			.filter(t -> t.getYear() == 2011)
			.sorted(comparing(Transaction::getValue))
			.collect(toList());
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> second = transactions.stream()
			.filter(t -> t.getValue() > 300)
			.sorted(comparing(t -> t.getTrader().getCity()))
			.collect(toList());
		
		// 3. What are all the unique cities where the traders work?
		List<String> third = traders.stream()
			.map(Trader::getCity)
			.distinct()
			.collect(toList());
		
		// 3.1. What are all the unique transactions, distinct by property
		// C1:
		transactions.stream()
			.collect(toMap(Transaction::getId,
					Function.identity(),
					(t1, t2) -> t1,
					LinkedHashMap::new));
		
		// C2:
		transactions.stream()
			.filter(distinctByKey(Transaction::getValue))
			.collect(toList()).forEach(System.out::println);
		
		// 3.2.
		List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 3, 4);
		numbers.stream().collect(groupingBy(
				Function.identity(),
				counting()));
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> forth = traders.stream()
			.filter(t -> t.getCity().equals("Cambridge"))
			.sorted(comparing(Trader::getName).reversed())
			.collect(toList());
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		String fifth = traders.stream()
			.sorted(comparing(Trader::getName))
			.map(Trader::getName)
			.collect(joining(", "));
		
		// 6. Are any traders based in Milan?
		boolean sixth = traders.stream()
				.anyMatch(t -> t.getCity().equals("Milan"));
		
		// 7. Count the number of traders in Milan.
		long seventh = traders.stream()
				.filter(t -> t.getCity().equals("Milan"))
				.count();
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		transactions.stream()
			.filter(t -> t.getTrader().getCity().equals("Cambridge"))
			.collect(toList())
			.forEach(System.out::println);
		
		// 9. What’s the highest value of all the transactions?
		Transaction nineth = transactions.stream()
			.max(Comparator.comparing(Transaction::getValue))
			.orElse(null);
		
		
		// 10. Find the transaction with the smallest value.
		Transaction tenth = transactions.stream()
			.min(Comparator.comparing(Transaction::getValue))
			.orElse(null);
	}
	
	// type reference
	private static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
		Set<R> uniqueTrans = new HashSet<>();
		return t -> uniqueTrans.add(func.apply(t));
	}
	
	private static List<Transaction> getTransactions(List<Trader> traders) {
		return List.of(new Transaction(1, traders.get(0), 2011, 300),
                new Transaction(2, traders.get(1), 2012, 1000),
                new Transaction(3, traders.get(0), 2011, 400),
                new Transaction(4, traders.get(1), 2012, 710),
                new Transaction(3, traders.get(3), 2012, 700),
                new Transaction(6, traders.get(2), 2012, 950));
	}
	
	private static List<Trader> getTraders() {
		return List.of(new Trader("Raoul", "Cambridge"),
				new Trader("Mario", "Milan"),
				new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));
	}

}
