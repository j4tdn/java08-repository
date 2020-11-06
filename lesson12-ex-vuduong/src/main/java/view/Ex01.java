package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Ex01 {
	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Brian", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 700),
				new Transaction(raoul, 2012, 100), new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950)

		);

		// 1. Find all transactions in the year 2011 and sort them by value (small to
		// high).
		List<Transaction> transactions1 = transactions.stream().filter(x -> x.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue).reversed()).collect(Collectors.toList());
		;
		print(transactions1);

		// 2. Find all transactions have value greater than 300 and sort them by
		// trader’s city
		List<Transaction> transactions2 = transactions.stream().filter(x -> x.getValue() > 300)
				.sorted((o1, o2) -> o1.getTrader().getCity().compareTo(o2.getTrader().getCity()))
				.collect(Collectors.toList());
		;
		print(transactions2);

		// 3. What are all the unique cities where the traders work?
		Set<String> traders3 = traders.stream().map(Trader::getCity).collect(Collectors.toSet());
		traders3.forEach(System.out::println);
		System.out.println("===================================");

		// 4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> traders4 = traders.stream().filter(x -> x.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName).reversed()).collect(Collectors.toList());
		print(traders4);

		// 5. Return a string of all traders’ names sorted alphabetically.
		List<String> traders5 = traders.stream().map(Trader::getName).distinct()
				.sorted(Comparator.comparing(Function.identity())).collect(Collectors.toList());
		print(traders5);

		// 6. Are any traders based in Milan?
		boolean isBasedMilan = traders.stream().map(Trader::getCity).collect(Collectors.toList()).contains("Milan");
		System.out.println(isBasedMilan);
		System.out.println("===================================");

		// 7. Count the number of traders in Milan.
		int numberTraderInMilan = traders.stream().filter(x -> x.getCity().equals("Milan")).collect(Collectors.toList())
				.size();
		System.out.println(numberTraderInMilan);
		System.out.println("===================================");

		// 8. Print all transactions’ values from the traders living in Cambridge.
		List<Transaction> transactions8 = transactions.stream().filter(x -> x.getTrader().getCity().equals("Cambridge"))
				.collect(Collectors.toList());
		print(transactions8);

		// 9. What’s the highest value of all the transactions?
		int highestValue = transactions.stream().mapToInt(x -> x.getValue()).max().orElse(0);
		System.out.println(highestValue);
		System.out.println("===================================");

		// 10. Find the transaction with the smallest value.
		Transaction smallestValueTransaction = transactions.stream().sorted(Comparator.comparing(Transaction::getValue))
				.collect(Collectors.toList()).get(0);
		System.out.println(smallestValueTransaction);

		transactions.parallelStream().map(Transaction::getValue).reduce((o1, o2) -> o1 + o2);	
	}

	private static <T> void print(List<T> list) {
		list.forEach(System.out::println);
		System.out.println("===================================");
	}

}
