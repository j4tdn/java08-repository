package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class ex01 {
	public static void main(String[] args) {
		List<Transaction> transactions = getTransaction();
		
		System.out.println("Transaction in 2011 & sort by value:");
		transactions.stream().filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(e -> System.out.println(e));
		
		System.out.println("\nTransaction have value greater 300 & sort by city:");
		transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted((t1, t2) -> t1.getTrader().getCity().compareTo(t2.getTrader().getCity()))
					.forEach(e -> System.out.println(e));
		
		System.out.println("\nThe unique cities:");
		transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(t -> System.out.println(t));
		
		System.out.println("\nTraders from Cambridge & sort by name desc:");
		Comparator<Transaction> comparator = new Comparator<Transaction>() {
			public int compare(Transaction t1, Transaction t2) {
				return t1.getTrader().getName().compareTo(t2.getTrader().getName());
			};
		};
		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
							.sorted(comparator.reversed())
							.forEach(t -> System.out.println(t));
					 
		System.out.println("\nAll trader's names sorted alphabetically:");
		transactions.stream().map(t -> t.getTrader().getName())
							 .sorted().distinct()
							 .forEach(t -> System.out.println(t));
		
		System.out.println("\nAre any traders based in Milan? "
								+ transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan")));
		
		System.out.println("\nThe number of traders in Milan: "
								+ transactions.stream().map(t -> new Trader(t.getTrader().getName(), t.getTrader().getCity()))
												.distinct()
												  .filter(t -> t.getCity().equals("Milan")).count());
		
		System.out.println("\nAll transactions' values from the traders living in Cambridge:");
		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).forEach(t -> System.out.println(t));
		
		System.out.println("\nThe highest value of all the transactions: " 
									+ transactions.stream().max(Comparator.comparingInt(Transaction::getValue)).get().getValue());
		
		System.out.println("\nThe highest value of all the transactions: " 
				+ transactions.stream().min(Comparator.comparingInt(Transaction::getValue)).get());
	}
	
	public static List<Transaction> getTransaction() {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		return Arrays.asList(
					new Transaction(brian, 2011, 300),
					new Transaction(raoul, 2012, 1000),
					new Transaction(raoul, 2011, 400),
					new Transaction(mario, 2012, 710),
					new Transaction(mario, 2012, 700),
					new Transaction(alan, 2012, 950)
				);
	}
}

