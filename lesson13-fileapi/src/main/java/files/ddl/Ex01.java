package files.ddl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		boolean isFile = false;
		File file = new File("parent\\data.txt");
		File parent = file.getParentFile();

		if (!parent.exists()) {
			parent.mkdirs();
		}

		if (!file.exists()) {
			try {
				isFile = file.createNewFile();
				// Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("is File: " + isFile);
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("Canonical Path: " + file.getCanonicalPath());
	
	
		Files.createFile(Paths.get("parent","result"));
		Files.createDirectories(Paths.get("trader"));
	}
}
