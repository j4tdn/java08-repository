package execution;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {
	private static FileWriter writes=null;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {// save file
				writes.close();
				// open file
				Desktop.getDesktop().open(file);
				
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}

	}

	private static void writeData(File files) throws IOException {
	    writes = new FileWriter(files);
		writes.write("Yibo x ZX\n");// xuống dòng

		// interupt: bị ngắt chương trình
		writes.write(1 / 0);
		writes.write("10-5.8-5");

		System.out.println("write file sucessful!!!");// chạy được nhưng chưa save data
		
	}
}
