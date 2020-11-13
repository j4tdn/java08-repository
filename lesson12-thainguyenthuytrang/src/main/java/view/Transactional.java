package view;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Transactional {
	public static void main(String[] args) {
		List<Trader> traders = getTraders();
		List<Transaction> transactions = getTransactions(traders);

		// 1. Find all transactions in the year 2011 and sort them by value (small to high).		
		  transactions.stream() .filter(year -> year.getYear() == 2011)
		  .sorted(comparing(Transaction::getValue)) 
		  .forEach(System.out::println);
		  System.out.println("======================\n");
		  
		 
		  // 2. Find all transactions have value greater than 300 and sort them by trader’s city 
		 transactions.stream().filter(val -> val.getValue() > 300)
		  .sorted(comparing(o -> o.getTrader().getCity()))
		  .forEach(System.out::println);
		 System.out.println("======================\n");
		  
		 
		  // 3. What are all the unique cities where the traders work? 
		 traders.stream().map(Trader::getCity).distinct().forEach(System.out::println);
		 System.out.println("======================\n");
		 
		 
		 //4. Find all traders from Cambridge and sort them by name desc.
		 traders.stream().filter(t ->t.getCity().equals("Cambridge"))
		 .sorted(comparing(Trader::getName))
		 .forEach(System.out::println);
		 System.out.println("======================\n");
		 
		 
		 //5. Return a string of all traders’ names sorted alphabetically.
		List<String> nameOfTraders = traders.stream()
		.map(Trader::getName)
		.sorted()
		.collect(Collectors.toList());
		nameOfTraders.forEach(System.out::println);
		System.out.println("======================\n");
		
		
		//6. Are any traders based in Milan?
		List<Trader> TraMilan =  traders.stream()
		.filter(t->t.getCity()
		.equals("Milan"))
		.collect(Collectors.toList());
		System.out.println(!TraMilan.isEmpty());
		System.out.println("======================\n");
		
		
		//7. Count the number of traders in Milan.
		System.out.println(TraMilan.size());
		System.out.println("======================\n");
		
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		transactions.stream()
		.filter(t ->t.getTrader().getCity().equals("Cambridge"))
		.forEach(System.out::println);
		System.out.println("======================\n");
		
		
		//9. What’s the highest value of all the transactions?
		int max = transactions.stream()
		.map(Transaction::getValue)
		.max(Integer::compare).get();
		System.out.println(max);
		System.out.println("======================\n");
		
		
		//10. Find the transaction with the smallest value.
		int min = transactions.stream()
		.map(Transaction::getValue)
		.min(Integer::compare).get();
		System.out.println(min);
		System.out.println("======================\n");


	}

	private static List<Trader> getTraders() {
		return List.of(new Trader("Raoul", "Cambridge"), new Trader("Mario", "Milan"), new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));
	}

	private static List<Transaction> getTransactions(List<Trader> traders) {
		return List.of(new Transaction(1, traders.get(0), 2011, 300), new Transaction(2, traders.get(1), 2012, 1000),
				new Transaction(3, traders.get(0), 2011, 400), new Transaction(4, traders.get(1), 2012, 710),
				new Transaction(5, traders.get(3), 2012, 700), new Transaction(6, traders.get(2), 2012, 950));

	}
}