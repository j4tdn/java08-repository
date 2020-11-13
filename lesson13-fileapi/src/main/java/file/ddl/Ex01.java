package file.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 
{
    public static void main( String[] args ) throws IOException
    {
    	//txt, properties
       // java 7
    	boolean isFile = false;
    	File file = new File("transaction\\Data.txt");
    	File parent = file.getParentFile();
    	if(!parent.exists()) {
    		parent.mkdirs();
    	}
    	//file.delete();
    	if(!file.exists()) {
    		try {
				isFile = file.createNewFile();
				//open file
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	System.out.println(isFile);
    	System.out.println("path: " + file.getPath()
    	                            + "\nAbsolutePath: " + file.getAbsolutePath()
    	                            + "\ncannonical path: " + file.getCanonicalPath());
    	//java 8
    	//Files.createFile(Paths.get("transaction", "result.txt"));
    	Files.createDirectories(Paths.get("trader"));
    }
}
