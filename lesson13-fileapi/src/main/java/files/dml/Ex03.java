package files.dml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import bean.Transaction;

public class Ex03 {

	public static void main(String[] args) {
		String pathname = "transaction/data.txt";
		Path path = Paths.get(pathname);

		try {
			List<String> lines = Files.readAllLines(path);
			List<Transaction> transactions = lines.stream()
				.map(Transaction::new)
				.collect(Collectors.toList());
			transactions.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
