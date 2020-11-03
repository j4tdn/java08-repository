package bean;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

import java.util.Arrays;

public class Transactional {
	public static void main(String[] args) {
		List<Trader> traders = getTrader();
		List<Transaction> transactions = getTransaction(traders);

		// cau 1
		List<Transaction> first = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());

		// cau2
		List<Transaction> second = transactions.stream().filter(t -> t.getValue() > 300)
				.sorted(Comparator.comparing(t -> t.getTrader().getCity())).collect(Collectors.toList());

		// cau3
		// c1
		List<String> third = traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList());

		// 3.1 what are all the unique transaction
		transactions.stream()
				.collect(Collectors.toMap(Transaction::getId, 
						Function.identity(), 
						(e1, e2) -> e1, 
						LinkedHashMap::new));
		
		
		transactions.stream().filter(distinctByKey(Transaction::getId)).collect(Collectors.toList()).forEach(System.out::println);
		//3,2
		List<Integer> numbers=Arrays.asList(11,2,1,2,4);
		Map<Integer, Long>qtyMap= numbers.stream()
		.collect(groupingBy(Function.identity(),Collectors.counting()));
	}

	private static <T,R> Predicate<T> distinctByKey(Function<T, R >function) {
		Set<R> uniqueTrans=new HashSet<>();
		return t->uniqueTrans.add(function.apply(t));
	}
	private static List<Transaction> getTransaction(List<Trader> traders) {
		return List.of(new Transaction(1, traders.get(0), 2011, 300),
				new Transaction(2, traders.get(1), 2012, 1000),
				new Transaction(3, traders.get(0), 2011, 400), 
				new Transaction(4, traders.get(1), 2012, 710),
				new Transaction(3, traders.get(3), 2012, 700), 
				new Transaction(4, traders.get(2), 2012, 950));

	}

	private static List<Trader> getTrader() {
		return List.of(new Trader("Raoul", "Cambridge"), new Trader("Mario", "Milan"), new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));
	}

}
