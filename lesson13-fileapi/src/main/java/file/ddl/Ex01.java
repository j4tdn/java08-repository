package file.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex01 
{
    public static void main( String[] args ) throws IOException {
    	// txt, properties
    	// JAVA 07
    	boolean isFile = false;
//    	File file = new File("..\\data.txt");
    	
    	File file = new File("transaction\\data.txt");
    	
    	File parent = file.getParentFile();
    	if (!parent.exists()) {
    		parent.mkdirs();
    	}
    	
    	if (!file.exists()) {
    		try {
    			isFile = file.createNewFile();
//    			Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	
    	System.out.println("isFile: " + isFile);
    	System.out.println("path: " + file.getPath() 
    							+ "\nabsolute path: " + file.getAbsolutePath()
    							+ "\ncanonical path: " + file.getCanonicalPath());		// more right to get path
    	
    	// JAVA 08
//    	Files.createFile(Paths.get("transaction", "resolve.txt"));
    	Files.createDirectories(Paths.get("trader"));
    }
}
