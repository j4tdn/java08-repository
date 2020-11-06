package files.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		// Java07
		boolean isfile = false;
		File file = new File("transaction\\data.txt");
		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}

		// txt, properties
		if (!file.exists()) {
			try {
				isfile = file.createNewFile();
				Desktop.getDesktop().open(file);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(isfile);
		System.out.println("path: " + file.getPath() + "\nabsolute:" + file.getAbsolutePath() + "\ncanonicalPath:"
				+ file.getCanonicalPath());
		
		

		// Java08
		Files.createFile(Paths.get("transaction", "result.txt"));
		Files.createDirectories(Paths.get("trader"));
	}

}
