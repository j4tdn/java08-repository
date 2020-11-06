package file.ddl;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex01 
{
    public static void main( String[] args ) throws IOException
    {
       //java7
    	File file = new File("foder\\data.txt");
    	File parent = file.getParentFile();
    	if(!parent.exists()) {
    		parent.mkdir();
    	}
    	
    	boolean isFile = false;
    	if(!file.exists()) {
    		try {
				isFile = file.createNewFile();
				Desktop.getDesktop().open(file);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    	System.out.println("path: "+ file.getPath());
    	System.out.println("Absolute path: " + file.getAbsolutePath()
    						+"\ncanonical path: "+ file.getCanonicalPath());
    	//java8
    	Files.createFile(Paths.get("foder", "result.txt"));
    	Files.createDirectories(Paths.get("trader"));
    	
    }
}
