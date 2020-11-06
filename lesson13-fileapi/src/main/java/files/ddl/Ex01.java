package files.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		
		//.txt. properties
		
		//java07*
		boolean isFile = false;
		File file = new File("transaction\\data.txt");
		
		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdir();
		}
	//	file.delete();
		
		if (!file.exists()) {
			try {
				file.createNewFile();
				Desktop.getDesktop().open(file); //mở file vừa tạo
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("isFile: " + isFile);
		System.out.println("path: " + file.getPath() //đường dẫn tương đối
			+ "\nabsolute path: " + file.getAbsolutePath()
			+ "\ncanonical path: " + file.getCanonicalPath()
		);
		
		//java08
		//Files.createFile(Paths.get("transaction", "result.txt"));
		//Files.createFile(Paths.get("transaction\\result.txt"));
		
		Files.createDirectories(Paths.get("trader"));
	}
}
