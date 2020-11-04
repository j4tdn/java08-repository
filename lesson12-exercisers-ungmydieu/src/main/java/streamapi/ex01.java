package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class ex01 {
	public static void main(String[] args) {
		List<Trader> traders = getTrader();
		List<Transaction> transactions = getTransaction(traders);
		
		System.out.println("Transaction in 2011 & sort by value:");
		transactions.stream().filter(t -> t.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(e -> System.out.println(e));
		
		System.out.println("\nTransaction have value greater 300 & sort by city:");
		transactions.stream()
					.filter(t -> t.getValue() > 300)
					.sorted(Comparator.comparing(t -> t.getTrader().getCity()))
					.forEach(e -> System.out.println(e));
		
		System.out.println("\nThe unique cities:");
		traders.stream().map(Trader::getCity).distinct().forEach(t -> System.out.println(t));
		
		System.out.println("\nTraders from Cambridge & sort by name desc:");
		traders.stream().filter(t -> t.getCity().equals("Cambridge"))
							.sorted(Comparator.comparing(Trader::getName).reversed())
							.forEach(t -> System.out.println(t));
					 
		System.out.println("\nAll trader's names sorted alphabetically:");
		traders.stream().map(Trader::getName).sorted().distinct().forEach(t -> System.out.println(t));
		
		System.out.println("\nAre any traders based in Milan? "
								+ traders.stream().anyMatch(t -> t.getCity().equals("Milan")));
		
		System.out.println("\nThe number of traders in Milan: "
								+ traders.stream().filter(t -> t.getCity().equals("Milan")).distinct().count());
		
		System.out.println("\nAll transactions' values from the traders living in Cambridge:");
		transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).forEach(t -> System.out.println(t));
		
		System.out.println("\nThe highest value of all the transactions: " 
									+ transactions.stream().max(Comparator.comparingInt(Transaction::getValue)).get().getValue());
		
		System.out.println("\nThe transaction with the smallest value: " 
				+ transactions.stream().min(Comparator.comparingInt(Transaction::getValue)).get());
	}
	
	public static List<Trader> getTrader() {
		return List.of(
				new Trader("Raoul", "Cambridge"),
				new Trader("Mario", "Milan"),
				new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));       
	}
	
	public static List<Transaction> getTransaction(List<Trader> traders) {
		return List.of( 
		        new Transaction(1, traders.get(0), 2011, 300),
		        new Transaction(2, traders.get(1), 2012, 1000),
		        new Transaction(3, traders.get(0), 2011, 400),
		        new Transaction(4, traders.get(1), 2012, 710),
		        new Transaction(3, traders.get(3), 2012, 700),
		        new Transaction(6, traders.get(2), 2012, 950));
	}
}

