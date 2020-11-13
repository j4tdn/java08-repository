package file.ddl;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
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
			return;
		}
		// nann.me.png

		File[] files = file
				.listFiles(f -> f.getName().substring(0, f.getName().lastIndexOf(".")).equalsIgnoreCase("draft"));
		printf(files);

		// copy
		for (File source : files) {
			String targetpath = "trader" + File.separator + source.getName();
			Path target = Paths.get(targetpath);
			try {
				Files.copy(source.toPath(), target, StandardCopyOption.REPLACE_EXISTING);
				System.out.println(source.getName()+"is copied !");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void printf(File[] files) {
		int line = 1;
		for (File file : files) {
			System.out.println(line + ": " + file.getName());
			line++;
		}
	}
}
