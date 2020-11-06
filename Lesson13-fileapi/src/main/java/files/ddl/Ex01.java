package files.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		//txt, properties
		//Java 07
		boolean isFile = false;
		
		File file = new File("transaction\\data.txt");
		
		
		File parent = file.getParentFile();
		if(!parent.exists()) {
			parent.mkdir();
		}
			
			
			
		if (!file.exists()) {
			try {
				
				isFile = file.createNewFile();
				Desktop.getDesktop().open(file);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("isFile: " + isFile);
		System.out.println("path: " + file.getPath()
				+"\nabsolute path: " + file.getAbsolutePath()
				+"\ncanonical path: " + file.getCanonicalPath());
		
		
		
		//Java 08
		Files.createFile(Paths.get("transaction\\text.txt"));
		Files.createDirectories(Paths.get("trader")	);
	}
}
