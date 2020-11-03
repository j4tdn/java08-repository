package App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Trander;
import bean.Transaction;

public class App {

	public static void main(String[] args) {
		List<Transaction> transactions = data();
		System.out.println("Get Data: ");
		System.out.println(transactions);
		
		//1.Find all transactions in the year 2011 and sort them by value (small to high).
		System.out.println("========================================");
		System.out.println("1.");
		transactions.stream().filter(t -> t.getYear() == 2011)
							 .sorted((o1,o2) -> o1.getValue() - o2.getValue())
							.forEach(t -> System.out.println(t));
		
		
		//2. Find all transactions have value greater than 300 and sort them by trader’s city
		System.out.println("========================================");
		System.out.println("2.");
		transactions.stream().filter(t -> t.getValue() > 300)
							 .sorted((o1,o2) -> {
							 		 if (o1.getTrander().getCity().equals(o2.getTrander().getCity())) {
							 			return o1.getValue() - o2.getValue();
							 		 }
							 		return o1.getTrander().getCity().compareTo(o2.getTrander().getCity());
							 			 
								 })
							 .forEach(t -> System.out.println(t));
		
		//3.What are all the unique cities where the traders work?
		System.out.println("========================================");
		System.out.println("3.");
		transactions.stream().map(s -> s.getTrander().getCity())
							 .distinct()
							 .forEach(s -> System.out.println(s));
		//4.Find all traders from Cambridge and sort them by name desc.
		System.out.println("========================================");
		System.out.println("4.");
		transactions.stream().filter(s -> s.getTrander().getCity().equals("Cambridge"))
		 					 .sorted((o1, o2) -> o1.getTrander().getName().compareTo(o2.getTrander().getName()))
		 					 .forEach(s -> System.out.println(s));
		
		//5. Return a string of all traders’ names sorted alphabetically.
		System.out.println("========================================");
		System.out.println("5.");
		List<String> trans5 = transactions.stream()
											   .map(s -> s.getTrander().getName())
											   .distinct()
											   .sorted()
											  .collect(Collectors.toList());
		 trans5.forEach(s ->System.out.println(s));									
		
		//6. Are any traders based in Milan?
		System.out.println("========================================");
		System.out.println("6.");
		List<String> trans6 =  transactions.stream().filter(s -> s.getTrander().getCity().equals("Milan"))
		 					 .map(s -> s.getTrander().getName())
		 					 .distinct()
		 					 .sorted()
		 					 .collect(Collectors.toList());
		trans6.forEach(s ->System.out.println(s));	
		
		//7. Count the number of traders in Milan.
		System.out.println("========================================");
		System.out.println("7.");
		long countCityMilan = trans6.stream().count();
		System.out.println("Count the number of traders in Milan: "+countCityMilan);
		
		//8. Print all transactions’ values from the traders living in Cambridge.
		System.out.println("========================================");
		System.out.println("8.");
		transactions.stream().filter(s -> s.getTrander().getCity().equals("Cambridge"))
		 					 .map(s -> s.getValue())
		 					 .forEach(s -> System.out.println(s));
		
		//9. What’s the highest value of all the transactions?
		System.out.println("========================================");
		System.out.println("9.");
		Transaction transMaxValue = transactions.stream()
										   .max(Comparator.comparingInt(s -> s.getValue()))
										   .orElse(null);
		System.out.println(transMaxValue);
		
		//10. Find the transaction with the smallest value.
		System.out.println("========================================");
		System.out.println("10.");
		Transaction transMinValue = transactions.stream()
										   .min(Comparator.comparingInt(s -> s.getValue()))
										   .orElse(null);
		System.out.println(transMinValue);
		
	}
	public static List<Transaction> data(){
		
		Trander raoul = new Trander("RaoUl", "Cambridge");
		Trander mario = new Trander("Mario", "Milan");
		Trander alan = new Trander("Alan", "Cambridge");
		Trander brian = new Trander("Brian", "Cambridge");
		Trander bion = new Trander("Bion", "Manchester");
		Trander duli = new Trander("Duli", "Milan");
		
		
		List<Transaction> trans = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new	Transaction(raoul, 2012, 1000),
				new	Transaction(raoul, 2011, 400),
				new	Transaction(mario, 2012, 710),
				new	Transaction(mario, 2012, 700),
				new	Transaction(alan, 2012, 960),
				new	Transaction(bion, 2011, 200),
				new	Transaction(duli, 2011, 100)
				
				);
				
		return trans;
	}
	
}
