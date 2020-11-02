package transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class App {
	private static String nameTrader = "";

	public static void main(String[] args) {
		List<Transaction> transactions = getListTransactions();

		// 1. transactions in the year 2011 and sort them by value (small to high)
		List<Transaction> require1 = transactions.stream().filter(t -> {
			return t.getYear() == 2011;
		}).sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		// 2. transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> require2 = transactions.stream().filter(t -> {
			return t.getValue() > 300;
		}).sorted((Transaction o1, Transaction o2) -> {
			String city1 = o1.getTrader().getCity();
			String city2 = o2.getTrader().getCity();
			if (city1 == null) {
				return city1 == null ? 0 : 1;
			}

			if (city2 == null) {
				return -1;
			}
			return city1.compareTo(city2);
		}).collect(Collectors.toList());

		// 3. the unique cities where the traders work
		List<Transaction> require3 = transactions.stream().filter(distinctByKey(t -> t.getTrader().getCity()))
				.collect(Collectors.toList());

		// 3.1 the unique cities where the traders work
//		transactions.stream()
//				.collect(Collectors.toMap(Transaction::getId, Function.identity(), (t1, t2) -> t1, LinkedHashMap::new));

//		Set<Integer> uniqueTrans = new HashSet<>();
//		transactions.stream().filter(t -> uniqueTrans.add(t.getId())).collect(Collectors.toList());
		
		// 3.2 
		List<Integer> numbers = Arrays.asList(2,1,1,2,1,3,3,4);
		Map<Integer,Long> qtyMap = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// 4. all traders from Cambridge and sort them by name desc.
		
		
		List<Transaction> require4 = transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.sorted((o1, o2) -> {
					String name1 = o1.getTrader().getName();
					String name2 = o2.getTrader().getName();
					if (name1 == null) {
						return o2 == null ? 0 : 1;
					}
					if (name2 == null) {
						return -1;
					}
					return name1.compareTo(name2);
				}).collect(Collectors.toList());

		List<Transaction> require5 = transactions.stream().filter(distinctByKey(t -> t.getTrader().getCity()))
				.sorted((o1, o2) -> {
					String name1 = o1.getTrader().getName();
					String name2 = o2.getTrader().getName();
					if (name1 == null) {
						return o2 == null ? 0 : 1;
					}
					if (name2 == null) {
						return -1;
					}
					return name1.compareTo(name2);
				}).collect(Collectors.toList());
		boolean require6 = transactions.stream().filter(distinctByKey(t -> t.getTrader().getName()))
				.anyMatch(t -> t.getTrader().getCity().equals("Milan"));

		long require7 = transactions.stream().filter(distinctByKey(t -> t.getTrader().getName()))
				.filter(t -> t.getTrader().getCity().equals("Milan")).count();

		List<Transaction> require8 = transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.collect(Collectors.toList());
		Transaction require9 = transactions.stream().max(Comparator.comparing(Transaction::getValue)).get();
		Transaction require10 = transactions.stream().min(Comparator.comparing(Transaction::getValue)).get();

		System.out.println("\n1. Transactions in the year 2011 and sort them by value (small to high): ");
		require1.forEach(t -> System.out.println(t));
		System.out.println("\n2. Transactions have value greater than 300 and sort them by trader’s city: ");
		require2.forEach(t -> System.out.println(t));
		System.out.println("\n3. All the unique cities where the traders work: ");
		require3.forEach(t -> System.out.println(t));
		System.out.println("\n4. All traders from Cambridge and sort them by name desc: ");
		require4.forEach(t -> System.out.println(t));
		System.out.println("\n5. All traders’ names sorted alphabetically: ");
		require5.forEach(t -> {
			nameTrader = nameTrader + t.getTrader().getName() + ", ";
		});
		System.out.println(nameTrader);
		System.out.println("\n6. Are any traders based in Milan? ");
		System.out.println(require6);
		System.out.println("\n7. Number of traders in Milan: ");
		System.out.println(require7);
		System.out.println("\n8. All transactions’ values from the traders living in Cambridge.: ");
		require8.forEach(t -> System.out.println(t));
		System.out.println("\n9. The highest value of all the transactions : ");
		System.out.println(require9);
		System.out.println("\n10. The transaction with the smallest value : ");
		System.out.println(require10);
	}

//	private static List<Trader> getTraders(List<Trader> traders) {
//		 = new 
//		Trader raoul = new Trader("Raoul", "Cambridge");
//		Trader mario = new Trader("Mario", "Milan");
//		Trader alan = new Trader("Alan", "Cambridge");
//		Trader brian = new Trader("Brian", "Cambridge");
//
//	}

	public static List<Transaction> getListTransactions() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		return transactions;
	}

	public static Predicate<Transaction> distinctByKey(Function<Transaction, ?> keyExtractor) {
		Map<Object, Boolean> seen = new HashMap<>();
		return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}
