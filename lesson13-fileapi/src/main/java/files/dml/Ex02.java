package files.dml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Ex02 {
	public static void main(String[] args) {
		String pathname = "transactions/data.txt";
		Path path = Paths.get(pathname);

		List<Transaction> inputData = getTransactions(getTraders());

		List<String> lines = inputData.stream().map(Transaction::toString).collect(Collectors.toList());

		try {
			Files.write(path, lines, StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static List<Trader> getTraders() {
		return List.of(new Trader("Raoul", "Cambridge"), new Trader("Mario", "Milan"), new Trader("Alan", "Cambridge"),
				new Trader("Brian", "Cambridge"));
	}

	private static List<Transaction> getTransactions(List<Trader> traders) {
		return List.of(new Transaction(1, traders.get(0), 2011, 300), new Transaction(2, traders.get(1), 2012, 1000),
				new Transaction(3, traders.get(0), 2011, 400), new Transaction(4, traders.get(1), 2012, 710),
				new Transaction(3, traders.get(3), 2012, 700), new Transaction(6, traders.get(2), 2012, 950));
	}

}
