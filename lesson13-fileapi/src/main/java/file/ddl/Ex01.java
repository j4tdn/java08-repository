package file.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 {
	public static void main(String[] args) throws IOException{
		// txt, properties
		
		// JAVA07
		
		// Create file
		boolean isFile = false;
		File file = new File("transaction\\data.txt");
		
		File parent = file.getParentFile();
		if(!parent.exists()) {
			parent.mkdir();
		}
		
		if(!file.exists()) {
			try {
				isFile = file.createNewFile();
				Desktop.getDesktop().open(file);
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("is FIle" + isFile);
		
		System.out.println("path:  " + file.getPath());
		System.out.println("absolute path: " + file.getAbsolutePath());
		System.out.println("canonical path: " + file.getCanonicalPath());

		// JAVA 8
		Files.createFile(Paths.get("transaction", "result"));
		Files.createDirectories(Paths.get("Trader"));
		
	}
}
