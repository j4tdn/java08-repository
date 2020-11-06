package file.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Period;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		//java07: new file: txt, properties and new folder
		boolean isFile=false;
		File file=new File("transaction\\..\\data.txt");
		File parent = file.getParentFile();
		
		if(!parent.exists()) {
			parent.mkdir();
		}
		
		file.delete();
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
		System.out.println("Path : "+file.getPath()+"\nNabsolute path: "+file.getAbsolutePath()+
				"\nCanoniacal Path: "+file.getCanonicalPath());//chính xác hơn getAbsolutePath()
		
		//Files.createFile(Paths.get("trasaction", "result.txt" ));
		Files.createDirectory(Paths.get("traders"));
		
		// java 08
		
		
		
		
		
	}
}
	
	
	


