package view;

import java.util.List;
import java.util.Map;
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

import java.util.Arrays;
import java.util.Comparator;
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
        Supplier<Trader> y = Trader::new;
        
        //3.2
        List<Integer> numbers = Arrays.asList(2, 1, 1, 2, 3, 3, 4);
        Map<Integer, Long> qtyMap = numbers.stream()
        									.collect(groupingBy(Function.identity(), counting())); //gom nhóm theo chính nó, key là value
        //countin: số nhóm
        System.out.println("Qtymap: " + qtyMap);
        
        //4
        List<Trader> fourth = traders.stream().filter(t -> "Cambridge".equals(t.getCity()))
		.sorted(Comparator.comparing(Trader::getName).reversed())
		.collect(Collectors.toList());
        
        //5
        String fifth = traders.stream()
        .map(Trader::getName)
        .sorted()
        .collect(joining(", ")); //return string
        
        System.out.println("Trader's names: " + fifth);
        
        //6
        boolean isMilanBased = traders.stream().anyMatch(t -> "Milan".equals(t.getCity()));
        		//.filter().(t -> "Milan".equals(t.getCity())).count();
       // System.out.println("Milan: " + (count > 0));
        
        //7
        
        //8
        transactions.stream()
        	.filter(t -> "Cambridge".equals(t.getTrader().getCity()))
        	.map(Transaction::getValue)
        	.collect(toList());
        
        //9
        List<Transaction> test = Arrays.asList();
        Integer max = test.stream()
        			.max(comparing(Transaction::getValue))
        			.map(Transaction::getValue)
        			.orElse(Integer.MIN_VALUE);
        
      //  Optional<Integer> optional = Optional<Integer>.
        		
        //9.2
        Integer max2 = test.stream()
    			.map(Transaction::getValue)
    			.max(comparing(Function.identity()))
    			.orElse(Integer.MIN_VALUE);
        
        //9.3: Stream<T>
        // 		:IntStream, DoubleStream, LongStream: Primitive Stream
        //Stream<Integer> != IntStream
        //unboxing (Obj -> nguyen thuy), boxing (nguoc lai)
        Integer max3 = test.stream()
        					.mapToInt(Transaction::getValue) //return IntStream
        					//.boxed();
        					.max()
        					.orElse(Integer.MIN_VALUE);
        
        //find sum of Transaction in year 2021
        System.out.println("tenth: " + transactions.stream()
													.filter(t -> t.getYear() == 2011) //->return 1 Stream<Transaction>
													.mapToInt(Transaction::getValue)
													.sum());
        
        transactions.stream()
        			.map(Transaction::getValue)
        			//.reduce((a, b) -> a > b ? a : b);
        			.reduce(Integer::max);
        
        transactions.stream()
        			.map(Transaction::getValue)
        			.reduce(0, Integer::sum);
	}
	
		
	
	private static <T, R> Predicate<T> distinctByKey(Function<T,R> func) {
		Set<Object> uniqueTrans= new HashSet<>();
		return t->uniqueTrans.add(func.apply(t));
	}

	private static List<Trader> getTraders() {
		return List.of(
				new Trader("Raoul", "Cambridge"), 
				new Trader("Mario", "Milan"), 
				new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));
	}

	private static List<Transaction> getTransactions(List<Trader> traders) {
		return List.of(
				new Transaction(1, traders.get(0), 2011, 300),
                new Transaction(2, traders.get(1), 2012, 1000),
                new Transaction(3, traders.get(0), 2011, 400),
                new Transaction(4, traders.get(1), 2012, 710),
                new Transaction(5, traders.get(3), 2012, 700),
                new Transaction(6, traders.get(2), 2012, 950));
		
	}
}