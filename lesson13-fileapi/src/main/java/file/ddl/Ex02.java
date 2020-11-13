package file.ddl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex02 {
	public static void main(String[] args) {
		String path = "transaction";
		File file = new File(path);

		if (!file.exists()) {
			return;
		}

		File[] files = file.listFiles(f -> f.getName().startsWith("draft"));

		// copy
		for (File source : files) {
			String targetPath = "trader" + File.separator;
			Path target = Paths.get(targetPath);
			try {
				Files.copy(source.toPath(), target, StandardCopyOption.REPLACE_EXISTING);
				System.out.println(source.getName() + " is copied");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		print(files);

	}

	private static void print(File[] files) {
		int line = 1;
		for (File file : files) {
			System.out.println(line + ": " + file.getName());
			line++;
		}
	}
}
