package execution;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {
	
	private static FileWriter fw= null;
	public static void main(String[] args) {
		File file = new File("data.txt");
		if(!file.exists()) {
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//save file
			try {
				fw.close();
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		System.out.println("Write File Successful!!!");
		
		}
	}
	private static void writeData(File file) throws IOException {
		 fw = new FileWriter(file);
		fw.write("1. Java\n");
		
		//interrupt
		fw.write(1/0);
		
		
		fw.write("2. PHP\n");
		fw.write("3. C#\n");
		
	}
}
