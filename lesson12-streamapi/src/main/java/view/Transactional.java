package view;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
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

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> first = transactions.stream().filter(transaction -> transaction.getYear() == 2011)
				.sorted(comparing(Transaction::getValue)).collect(toList());

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		List<Transaction> second = transactions.stream().filter(t -> t.getValue() > 300)
				.sorted(comparing(t -> t.getTrader().getCity())).collect(Collectors.toList());

		// 3. What are all the unique cities where the traders work?
		List<String> three = traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList());

		// 3.1 What are all the unique transactions where the traders work?
		transactions.stream()
				.collect(Collectors.toMap(Transaction::getId, Function.identity(), (t1, t2) -> t1, LinkedHashMap::new));

		Set<Integer> uniqueTrans = new HashSet<>();
		transactions.stream().filter(distinctByKey(Transaction::getId)).collect(Collectors.toList())
				.forEach(System.out::println);

		// 3.2
		List<Integer> numbers = Arrays.asList(2, 1, 1, 2, 3, 3, 4);
		Map<Integer, Long> xx = numbers.stream().collect(groupingBy(Function.identity(), counting()));
		System.out.println("qty map" + xx);

		// 4.

		List<Trader> fourth = traders.stream().filter(t -> "Cambridge".equals(t.getCity()))
				.sorted(comparing(Trader::getName).reversed()).collect(toList());
		System.out.println("fourth" + fourth);

		// 5.
		String fifth = traders.stream().map(Trader::getName).sorted().collect(Collectors.joining(", "));
		System.out.println(fifth);
		// 6
		boolean isMilanBased = traders.stream().anyMatch(t -> "Milan".equals(t.getCity()));
		// 7
		long require7 = transactions.stream().filter(distinctByKey(t -> t.getTrader().getName()))
				.filter(t -> t.getTrader().getCity().equals("Milan")).count();

		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue)
				.collect(toList());

		List<Transaction> test = Arrays.asList();
		Optional<Integer> optional = test.stream().max(comparing(Transaction::getValue)).map(Transaction::getValue);
//		if (optional.isPresent()) {
//
//			System.out.println("Max : " + optional.get());
//		}
		System.out.println(optional.orElse(Integer.MIN_VALUE));// tra ve ne k bi null

		Integer number = test.stream().max(comparing(Transaction::getValue)).map(Transaction::getValue)
				.orElse(Integer.MIN_VALUE);
		Optional<Integer> optional2 = Optional.ofNullable(number);

		Integer max2 = test.stream().map(Transaction::getValue).max(Comparator.comparing(Function.identity()))
				.orElse(Integer.MIN_VALUE);

		// 9.3: Stream<T>
		// : IntStream, DoubleStream, LongStream : Primitive Stream
		// Stream<Integer> # IntStream
		int max3 = transactions.stream().mapToInt(Transaction::getValue).max().orElse(Integer.MIN_VALUE);

		// 10. Sum of Transaction value in year 2011

		int sum = transactions.stream().filter(t -> t.getYear() == 2011).mapToInt(Transaction::getValue).sum();
		int sum2 = transactions.stream().filter(t -> t.getYear() == 2011).mapToInt(Transaction::getValue)
//				.reduce((o1, o2) -> o1 + o2).getAsInt();
				.reduce(Integer::sum).getAsInt();

		int sum3 = transactions.stream().filter(t -> t.getYear() == 2011).mapToInt(Transaction::getValue).reduce(0,
				Integer::sum);
		System.out.println(sum2);
	}

	// type reference
	private static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
		Set<R> uniqueTrans = new HashSet<>();
		return t -> uniqueTrans.add(func.apply(t));
	}

	private static List<Transaction> getTransactions(List<Trader> traders) {
		return List.of(new Transaction(1, traders.get(0), 2011, 300), new Transaction(1, traders.get(1), 2012, 1000),
				new Transaction(2, traders.get(0), 2011, 400), new Transaction(2, traders.get(1), 2012, 710),
				new Transaction(5, traders.get(3), 2012, 700), new Transaction(5, traders.get(2), 2012, 950));

	}

	private static List<Trader> getTraders() {
		return List.of(new Trader("Raoul", "Cambridge"), new Trader("Mario", "Milan"), new Trader("Alan", "Cambridge"),
				new Trader("Alan", "Cambridge"), new Trader("Brian", "Cambridge"));

	}
}
