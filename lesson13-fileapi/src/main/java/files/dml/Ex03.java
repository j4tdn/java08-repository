package files.dml;

import java.awt.Desktop;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import bean.Trader;
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

	private static <T extends Closeable> void close(T closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
