package file.dml;

import java.awt.Desktop;
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
		String pathname = "transaction/data.txt";
		Path path = Paths.get(pathname);

		List<Transaction> inputData = getTransactions(getTraders());
		try {
			Files.write(path, inputData.stream().map(Transaction::toString).collect(Collectors.toList()), StandardOpenOption.APPEND);
	
			Desktop.getDesktop().open(path.toFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private static List<Transaction> getTransactions(List<Trader> traders) {
		return List.of(new Transaction(1, traders.get(0), 2011, 300), new Transaction(1, traders.get(1), 2012, 1000),
				new Transaction(2, traders.get(0), 2011, 400), new Transaction(2, traders.get(1), 2012, 710),
				new Transaction(5, traders.get(3), 2012, 700), new Transaction(5, traders.get(2), 2012, 950));

	}

	private static List<Trader> getTraders() {
		return List.of(new Trader("Raoul", "Cambridge"), new Trader("Mario", "Milan"), new Trader("Alan", "Cambridge"),
				new Trader("Alan", "Cambridge"), new Trader("Brian", "Cambridge"));

	}
}
