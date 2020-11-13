package files.ddl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.acl.LastOwnerException;

public class Ex02 {
	public static void main(String[] args) {
		String path = "transaction";
		File file = new File(path);

		if (!file.exists()) {
			System.out.println("file is not exit!");
			return;
		}

		File[] files = file
				.listFiles(t -> "draft".equalsIgnoreCase(t.getName().substring(0, t.getName().lastIndexOf("."))));
		printf(files);

		// copy
		for (File source : files) {
			// source: transaction/draft.png
			// target: trader/draft.png
			String targetPath = "trader" + File.separator + source.getName();
			Path target = Paths.get(targetPath);
			try {
				Files.copy(source.toPath(), target, StandardCopyOption.REPLACE_EXISTING);
				System.out.println(source.getName() + "is copied!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void printf(File[] files) {
		int line = 1;
		for (File file : files) {
			System.out.println(line + ":" + file.getName());
			line++;
		}
	}

}
