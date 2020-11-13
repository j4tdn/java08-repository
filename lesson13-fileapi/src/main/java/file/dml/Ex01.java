package file.dml;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import bean.Trader;
import bean.Transaction;

public class Ex01 {
	public static void main(String[] args) {
		String path = "transaction/data.txt";
		File file = new File(path);
		
		List<Transaction> inputData = mockData();
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write("welcome to file!!");
			bw.newLine();
			Desktop.getDesktop().open(file);
			bw.write("===========================");
			bw.newLine();
			for(Transaction transaction : inputData) {
				bw.write(transaction.toString());
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				close(bw);
				close(fw);
			
		}
	}
	
	private static List<Transaction> mockData() {
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
	
	private static<T extends Closeable> void close(T closeAble) {
		if(closeAble!=null) {
			try {
				closeAble.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
