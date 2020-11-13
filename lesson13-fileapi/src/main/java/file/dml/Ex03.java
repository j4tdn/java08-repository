package file.dml;

import java.awt.Desktop;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import bean.Transaction;

public class Ex03 {
	public static void main(String[] args) throws IOException {	
		String pathName = "transaction/data1.txt";
		Path path = Paths.get(pathName);

		List<String> lines = Files.readAllLines(path);
		lines.forEach(System.out::println);

		List<Transaction> transactions = lines.stream().map(Transaction::new).collect(Collectors.toList());
		
		transactions.forEach(System.out::println);
		
		Desktop.getDesktop().open(path.toFile());

	}

	private static <T extends Closeable> void close(T closeable) {
		if (closeable != null) {
			try {
				closeable.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
