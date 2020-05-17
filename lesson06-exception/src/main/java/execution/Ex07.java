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
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

			}
		}
		// write data into file
		try {
			writedata(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// save data
			try {
				fw.close();
				System.out.println("write file successfull");
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	private static void writedata(File file) throws IOException {
		// TODO Auto-generated method stub
		fw = new FileWriter(file);
		fw.write("1. Java\n");
		// interrup
		fw.write(1 / 0);
		fw.write("2. C#\n");
		fw.write("3. PHP\n");

	}
}
