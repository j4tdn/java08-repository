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
		if(!file.exists()) {
			return;
		}
		File[] files = file.listFiles(f -> f.getName().contains("draft"));
		
		printf(files);
		//copy
		
		
		for(File f : files) {
			String targetPath = "trader"+File.separator +f.getName();
			Path target = Paths.get(targetPath);
			try {
				Files.copy(f.toPath(), target, StandardCopyOption.COPY_ATTRIBUTES);
				System.out.println(f.getName() + "done");
				} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private static  void printf(File[] files) {
		int line = 1;
		for(File file:files) {
			System.out.println(line + ": "+file.getName());
			line++;
		}
	}

}
