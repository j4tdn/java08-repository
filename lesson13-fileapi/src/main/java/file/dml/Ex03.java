package file.dml;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
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

public class Ex03 {
	public static void main(String[] args) {
		
		String pathName = "transaction/data.txt";
		Path path = Paths.get(pathName);
		//File file = new File(pathName);
		
		/*
		 * FileReader fr = null; BufferedReader br = null;
		 */
		
		try {
			List<String> lines = Files.readAllLines(path);
			lines.forEach(file -> System.out.println(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
