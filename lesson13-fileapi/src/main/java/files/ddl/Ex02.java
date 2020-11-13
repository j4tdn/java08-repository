package files.ddl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex02 {
	public static void main(String[] args) {
		String path = "transaction"; //đường dẫn tương đối đến thư mục
		File file = new File(path);
		
		if(!file.exists()) {
			System.out.println("File is not exist !!!");
			return;
		}
		
		//File[] files = file.listFiles();
		File[] files = file.listFiles(f -> "draft".equalsIgnoreCase((f.getName().substring(0, f.getName().lastIndexOf("."))))); //0 -> n la n -1
		printf(files);
		
		//copy
		for (File source: files) {
			//source: transaction/draft.png
			//target: trader/draft.png
			String targetPath = "trader" + File.separator + source.getName();
			Path target = Paths.get(targetPath);
			try {
				//source.renameTo(file);
				Files.copy(source.toPath(), target, StandardCopyOption.REPLACE_EXISTING);
				System.out.println(source.getName() + "is copied !");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	private static void printf(File[] files) {
		int line = 1;
		for (File file: files) {
			System.out.println(line + ": " + file.getName());
			line++;
		}
	}
}
