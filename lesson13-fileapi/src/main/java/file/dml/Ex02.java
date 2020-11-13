package file.dml;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

public class Ex02 {
	public static void main(String[] args) {
		
		String pathName = "transaction/data.txt";
		Path path = Paths.get(pathName);
		File file = new File(pathName);
		
		
		List<Transaction> inputData = mockData();
		List<String> lines = inputData.stream().map(Transaction :: toString).collect(Collectors.toList());
		
		try {
			Files.write(path, lines,StandardOpenOption.APPEND);
		}catch(IOException e){
			e.printStackTrace();
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
