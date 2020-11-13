package files.dml;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class Ex01 {
	public static void main(String[] args) {
		String path = "transaction/data.txt";
		File file = new File(path);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write("================");
			bw.newLine();
			
			List<Transaction> inputData = getTransaction(getTrader());
			for (Transaction transaction : inputData) {
				bw.write(transaction.toString());
				bw.newLine();
			}
			
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(bw);
			close(fw);
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
