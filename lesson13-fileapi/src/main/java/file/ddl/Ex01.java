package file.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// txt, properties
		// JAVA 07:
		boolean isFile = false;
//		File file = new File("..\\data.txt");
		File file = new File("transaction\\data.txt");
//				file.getParent()

		File parrent = file.getParentFile();
		
		if(!parrent.exists()) {
			parrent.mkdirs();
		}
		
		file.delete();

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
		System.out.println("path: " + file.getPath());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Canonical path: " + file.getCanonicalPath());

		// JAVA 08:
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
//		Files.createFile(Paths.get("transaction", "result.txt"));
//		Files.createFile(Paths.get("transaction\\result.txt"));
		Files.createDirectories(Paths.get("trader"));
	}
}
