package view;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

import java.util.Arrays;import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Transactional {
	public static void main(String[] args) {
		List<Trader> traders = getTraders();
		List<Transaction> transactions = getTransactions(traders);
		
		// 1. Find all transactions in the year 2011 and sort them by value (small to high). 
		List<Transaction> first = transactions.stream()
					.filter(year -> year.getYear() == 2011)
					.sorted(comparing(Transaction::getValue))
					.collect(toList());
		
		// 2. Find all transactions have value greater than 300 and sort them by trader’s city 
				transactions.stream()
							.filter(val -> val.getValue() >300)
							.sorted(comparing(o -> o.getTrader().getCity()))
							.forEach(System.out::println);  
	
				
		// 3. What are all the unique cities where the traders work? 
		List<String> third = traders.stream()
							.map(Trader::getCity)
							.distinct()
							.collect(toList());
		
		// 3.1. ... distinct by key
		//Cách 1:
		transactions.stream()
			.collect(toMap(Transaction::getId, 
					Function.identity(), 
					(t1,t2) -> t1, 
					LinkedHashMap::new));
		//Cách 2:
		
        transactions.stream().filter(distinctByKey(Transaction::getId))
        			.collect(toList())
        			.forEach(System.out::println);
        
		
		  Supplier<Transaction> x = Transaction::new; 
		  Supplier<Trader> y =Trader::new;
		  
		   //3.2 
		/*
		 * List<Integer> numbers = Arrays.asList(1,1,2,3,3,4);
		 * numbers.stream().collect(groupingBy(Function.identity(),))
		 */
		  
		  //4
		  List<Trader> four = traders.stream().filter(t->"Cambridge".equals(t.getCity()))
		  .sorted(comparing(Trader::getName).reversed())
		  .collect(Collectors.toList());
		  
		  //5
		  String fifth = traders.stream()
		  .map(Trader::getName)
		  .sorted()
		  .collect(joining(", "));
		  System.out.println("Trader's name:" +fifth);
		  
		  //6
		 boolean isMilanBased  =  traders.stream()
		 .anyMatch(t->"Milan".equals(t.getCity()));
		 System.out.println("Milan:" + isMilanBased);
		 
		 //8
		 transactions.stream()
		 .filter(t ->"Cambridge".equals(t.getTrader().getCity()))
		.map(Transaction::getValue)
		.collect(Collectors.toList());
		 
		 //9.1
		 List<Transaction> test  = Arrays.asList();
		 Optional<Integer> optional  = test.stream()
		 .max(comparing(Transaction::getValue))
		 .map(Transaction::getValue);
		
	     System.out.println("Max: "+optional.orElse(Integer.MIN_VALUE));
		 
	     
	     //9.2
	    Integer max2 = test.stream()
	    		 .map(Transaction::getValue)
	    		 .max(comparing(Function.identity()))
	    		 .orElse(Integer.MIN_VALUE);
	    	
	    //9.3
	    // :IntStream, DoubleStrem, LongStream:Primitive Stream
	    //Stream<Integer> != IntStream
	    
	    int max3 = test.stream()
	    		 .mapToInt(Transaction::getValue)//->IntStream
	    		 .max()
	    		 .orElse(Integer.MIN_VALUE);
	    //10. Sum of Transaction value in 2011
	   System.out.println("tenth:"+ transactions.stream()
	    .filter(t ->t.getYear() == 2011)
	    .mapToInt(Transaction::getValue)
	    .sum());
	   
	   transactions.stream()
	   .mapToInt(Transaction::getValue)// StreamInteger
	  // .reduce(Integer::sum);
	   .reduce(0, Integer::sum);
	    
	            
        }

	private static <T, R> Predicate<T> distinctByKey(Function<T, R> func) {
		Set<Object> uniqueTrans = new HashSet<>();
		return t -> uniqueTrans.add(func.apply(t));
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