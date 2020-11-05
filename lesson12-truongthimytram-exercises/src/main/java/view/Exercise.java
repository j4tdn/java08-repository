package view;

import static java.util.Comparator.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import static java.util.stream.Collectors.*;

import java.util.Collections;
import java.util.LinkedHashMap;
public class Exercise {

	public static void main(String[] args) {
		List<Trader> traders = getTraders();
		List<Transaction> transaction = getTransaction(traders);
		
		//1. Find all transactions in the year 2011 and sort them by value (small to high).
		List<Transaction> first = transaction.stream()
		      .filter(t -> t.getYear() == 2011)
		      .sorted(comparing(Transaction::getValue))
		      .collect(toList());
		
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		List<Transaction> second = transaction.stream()
			      .filter(t -> t.getValue() >= 300)
			      .sorted(comparing(t -> t.getTrader().getCity()))
			      .collect(toList());
		
		//3. What are all the unique cities where the traders work?
		List<String> third = traders.stream().map(Trader::getCity).distinct().collect(toList());
		
		transaction.stream().collect(toMap(Transaction::getId, Function.identity(), (t1, t2) -> t1, LinkedHashMap::new));
		
		//4. Find all traders from Cambridge and sort them by name desc.
		List<Trader> fourth = traders.stream()
			      .filter(t -> t.getCity().equals("Cambridge"))
			      .sorted(comparing(t -> t.getName(), Collections.reverseOrder()))
			      .collect(toList());
		
		//5. Return a string of all traders’ names sorted alphabetically.
		List<String> fifth = traders.stream()
				  .map(Trader::getName)
			      .sorted(comparing(Function.identity()))
			      .collect(toList());
		
		//6. Are any traders based in Milan?
		boolean isInMilan = traders.stream().map(Trader::getCity).collect(Collectors.toList()).contains("Milan");
		
		//7. Count the number of traders in Milan.
		long numberOfTraderInMilan = traders.stream().filter(t -> t.getCity().equals("Milan")).count();
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		List<Integer> sixth = transaction.stream()
			      .filter(t -> t.getTrader().getCity().equals("Cambridge"))
			      .map(Transaction::getValue)
			      .collect(toList());
		
		//9. What’s the highest value of all the transactions?
		int highestValue = transaction.stream()
			      .map(Transaction::getValue)
			      .max(Integer::compare)
			      .get();
		//10. Find the transaction with the smallest value.
		int smallestValue = transaction.stream()
			      .map(Transaction::getValue)
			      .min(Integer::compare)
			      .get();

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
