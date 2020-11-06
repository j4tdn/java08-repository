package view;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;
import static java.util.stream.Collectors.*;

import java.util.Arrays;

import static java.util.Comparator.*;

public class Transactional {
	public static void main(String[] args) {
		List<Trader> traders = getTrader();
		List<Transaction> transactions = getTransaction(traders);
		
		// 1. Find all transactions in the year 2011 and sort them by value asc
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
		List<String> third = traders.stream().map(Trader::getCity).distinct().collect(toList());
		
		// 3.1 What are all the unique transactions. distinct by property
		// C1
		transactions.stream()
				.collect(toMap(Transaction::getId, Function.identity(), (t1,t2) -> t1, LinkedHashMap::new));
		
		// C2
		transactions.stream()
					.filter(distinctByKey(Transaction::getId))
					.collect(toList()).forEach(System.out::println);
		
		// 3.2
		List<Integer> numbers = Arrays.asList(2,1,2,1,3,3,4);
		Map<Integer, Long> qtyMap = numbers.stream()
											.collect(groupingBy(Function.identity(), counting()));
		
		System.out.println("Qty map: " + qtyMap);
		
		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> fourth = traders.stream().filter(t -> t.getCity().equals("Cambridge"))
												.sorted(comparing(Trader::getName).reversed())
													.collect(toList());
		
		// 5. Return a string of all traders’ names sorted alphabetically.
		String fifth = traders.stream().map(Trader::getName).sorted(reverseOrder()).collect(joining(", "));
		System.out.println("Trader's name: " + fifth);
		
		// 6. Are any traders based in Milan?
		boolean isMilanBased = traders.stream().anyMatch(t -> "Milan".equals(t.getCity()));
		System.out.println("Is Milan based ? " + isMilanBased);
		
		// 8. Print all transactions’ values from the traders living in Cambridge.
		transactions.stream().filter(t -> "Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue).collect(toList());
		
		// 9. What’s the highest value of all the transactions?
		Integer max = transactions.stream().max(comparing(Transaction::getValue)).map(Transaction::getValue).orElse(Integer.MIN_VALUE);
		Optional<Integer> optional = Optional.ofNullable(max);
		System.out.println(optional);
		
		// 9.2
		Integer max2 = transactions.stream().map(Transaction::getValue).max(comparing(Function.identity())).orElse(Integer.MIN_VALUE);
		
		// 9.3: Stream<T>
		//	  : IntStream, DoubleStream, LongStream: Primitive Stream
		// Stream<Integer> != IntStream -> different data type
		// unboxing, boxing
		transactions.stream().mapToInt(Transaction::getValue).max().orElse(Integer.MIN_VALUE);
		
		// 11. Sum of Transaction value in 2011
		System.out.println("Sum value in 2011: " + transactions.stream().filter(t -> t.getYear() == 2011).mapToInt(Transaction::getValue).sum());
		
		// 11.
		transactions.stream().map(Transaction::getValue)		// Stream<Integer>
							 .reduce(0, Integer::sum);
	}
	
	// type reference
	private static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
		Set<R> uniqueTrans = new HashSet<>();
		return t -> uniqueTrans.add(func.apply(t));
	}
	
	public static List<Trader> getTrader() {
		return List.of(
				new Trader("Raoul", "Cambridge"),
				new Trader("Mario", "Milan"),
				new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));       
	}
	
	public static List<Transaction> getTransaction(List<Trader> traders) {
		return List.of( 
		        new Transaction(1, traders.get(0), 2011, 300),
		        new Transaction(2, traders.get(1), 2012, 1000),
		        new Transaction(3, traders.get(0), 2011, 400),
		        new Transaction(4, traders.get(1), 2012, 710),
		        new Transaction(3, traders.get(3), 2012, 700),
		        new Transaction(6, traders.get(2), 2012, 950));
	}
		
}
