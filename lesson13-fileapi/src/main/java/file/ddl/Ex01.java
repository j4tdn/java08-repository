package file.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		// txt, properties
		// java 07
		boolean isFile=false;
		File file=new File("transaction\\data.txt");
		
		//tao folder
		File parent=file.getParentFile();
		if(!parent.exists()) {
			parent.mkdirs();
		}
		
		if(!file.exists()) {
			try {
				isFile=file.createNewFile();
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("isFile: "+isFile);
		System.out.println(file.getPath()+"\nabsolutepath "
							+file.getAbsolutePath()+"\ncanonical path "
							+file.getCanonicalPath());
		
		
		// java 08
		
		Files.createFile(Paths.get("transaction", "result.txt"));
		Files.createDirectories(Paths.get("trader"));
		
	}

}
