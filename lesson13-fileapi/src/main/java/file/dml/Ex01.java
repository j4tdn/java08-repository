package file.dml;

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
		BufferedWriter bw = null; //thay vì từng dòng, ghi vào memory rồi ghi vào file lần luôn
		try {
			fw = new FileWriter(file, true); //ghi tiep chu ko ghi đè
			bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write("=================");
			
			List<Transaction> inputData = getTransactions(getTraders());
			for (Transaction transaction: inputData) {
				bw.write(transaction.toString());
				bw.newLine();
			}
			
			bw.newLine();
			bw.write("Exit the FILE");
			
			Desktop.getDesktop().open(file);
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//			try {
//				bw.close();
//				fw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			close(bw);
			close(fw);
		}
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
	
	private static<T extends Closeable> void close(T closeble) {
		try {
			closeble.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
