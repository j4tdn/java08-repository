package view;

import static java.util.Comparator.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Trader;
import bean.Transaction;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Transactional {

	public static void main(String[] args) {
		List<Trader> traders = getTraders();
		List<Transaction> transaction = getTransaction(traders);
		
		//1
		List<Transaction> first = transaction.stream()
		      .filter(t -> t.getYear() == 2011)
		      .sorted(comparing(Transaction::getValue))
		      .collect(toList());
		List<Transaction> second = transaction.stream()
			      .filter(t -> t.getValue() >= 300)
			      .sorted(comparing(t -> t.getTrader().getCity()))
			      .collect(toList());
		List<String> third = traders.stream().map(Trader::getCity).distinct().collect(toList());
		
		//What are the unique transactions, distinct by property: không trùng nhau theo Id
		//c1
		transaction.stream().collect(toMap(Transaction::getId, Function.identity(), (t1, t2) -> t1, LinkedHashMap::new));
		//c2
		Set<Integer> uniqueTrans = new HashSet<>();
		transaction.stream().filter(t -> uniqueTrans.add(t.getId())).collect(toList()).forEach(System.out::println);
		//c3
		transaction.stream().filter(distinctByKey(Transaction::getId)).collect(toList()).forEach(System.out::println);
		//3.2
		List<Integer> numbers = Arrays.asList(2,1,2,2,4,3);
		Map<Integer, Long> qtyMap = numbers.stream().collect(groupingBy(Function.identity(), counting()));

	}
	
	private static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
		Set<R> uniqueTrans = new HashSet<>();
		return t -> uniqueTrans.add(func.apply(t));
	}
	private static List<Trader> getTraders(){
		return List.of(new Trader("Raoul", "Cambridge"), new Trader("Mario", "Milan"), new Trader("Alan", "Cambridge"), new Trader("Brian", "Cambridge"));
	}
	
	private static List<Transaction> getTransaction(List<Trader> traders){
		return List.of(new Transaction(1, traders.get(0), 2011, 300),
		        new Transaction(2, traders.get(1), 2012, 1000),
		        new Transaction(3, traders.get(0),2011, 400),
		        new Transaction(4, traders.get(1), 2012, 710),
		        new Transaction(5, traders.get(3), 2012, 700),
		        new Transaction(6, traders.get(2), 2012, 950));
	}

}
