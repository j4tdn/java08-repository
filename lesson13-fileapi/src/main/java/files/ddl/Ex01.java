package files.ddl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        // JAVA 07:

        // Create file
        boolean isFile = false;
        File file = new File("transaction/data.txt");

        File parent = file.getParentFile();
        if (!parent.exists()) {
            parent.mkdirs();
        }

        if (!file.exists()) {
            try {
                isFile = file.createNewFile();
//                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("isFile: " + isFile);
        System.out.println("path: " + file.getPath() + "\n absolute path: " + file.getAbsolutePath()
                + "\n canonical path: " + file.getCanonicalPath());

        // JAVA 08
//        Files.createFile(Paths.get("transaction", "result"));
        Files.createDirectories(Paths.get("trader"));
    }
}