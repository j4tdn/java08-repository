package execution;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex07 {
	private static FileWriter fw;

	public static void main(String[] args) {
		File file = new File("data.txt");
		try {
			if (!file.exists()) {
				file.createNewFile();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// write data into file.
		try {
			writeData(file);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				Desktop.getDesktop().open(file);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void writeData(File file) throws IOException {
		fw = new FileWriter(file);
		fw.write("Hello xin chao cac ban\n");

		// interrupt
		fw.write(1 / 0);

		fw.write("PHP\n");
		fw.write("C#\n");
		System.out.println("Write file successful");

	}
}
