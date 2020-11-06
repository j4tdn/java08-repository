package view;

import java.util.Comparator;
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

	private static List<Trader> getTraders() {
		return List.of(new Trader("Raoul", "Cambridge"), new Trader("Mario", "Milan"), new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));
	}

	private static List<Transaction> getTransactions(List<Trader> traders) {
		return List.of(new Transaction(1, traders.get(0), 2011, 300), new Transaction(2, traders.get(1), 2012, 1000),
				new Transaction(3, traders.get(0), 2011, 400), new Transaction(4, traders.get(1), 2012, 710),
				new Transaction(3, traders.get(3), 2012, 700), new Transaction(6, traders.get(2), 2012, 950));
	}

	public static void main(String[] args) {
		List<Trader> traders = getTraders();
		List<Transaction> transactions = getTransactions(traders);

		List<Transaction> first = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		List<Transaction> second = transactions.stream().filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity())).collect(Collectors.toList());

		List<String> third = traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList());

		transactions.stream()
				.collect(Collectors.toMap(Transaction::getId, Function.identity(), (t1, t2) -> t1, LinkedHashMap::new));

		Set<Integer> uniqueTrans = new HashSet();
		transactions.stream().filter(distinctByKey(Transaction::getId)).collect(Collectors.toList());

		List<Trader> four = traders.stream().filter(t -> t.getCity().equals("Cambridge"))
				.sorted(Comparator.comparing(Trader::getName).reversed()).collect(Collectors.toList());

		String five = traders.stream().map(Trader::getName).sorted(Comparator.reverseOrder())
				.collect(Collectors.joining(" - "));
	}

	private static <T, R> Predicate<T> distinctByKey(Function<T, R> function) {
		Set<R> uniqueTrans = new HashSet<>();
		return t -> uniqueTrans.add(function.apply(t));
	}
}
