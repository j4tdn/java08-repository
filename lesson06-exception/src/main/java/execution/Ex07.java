package execution;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {
	
	private static FileWriter fw = null;
	
	public static void main(String[] args) {
		File file = new File("data.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// write data into file
		try {
			writeData(file);
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {			
			try {
				// save file
				fw.close();
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}

	private static void writeData(File file) throws IOException {
		fw = new FileWriter(file);
		fw.write("1. JAVA\n");
		
		// interrupt
		fw.write(1/0);
		
		fw.write("2. PHP\n");
		fw.write("3. C#\n");	
				
		System.out.println("Write file successfully!");
	}
	
}
