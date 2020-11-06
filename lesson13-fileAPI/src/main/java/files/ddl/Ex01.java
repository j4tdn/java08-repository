package files.ddl;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 {
    public static void main(String[] args) throws IOException {
        // java07
        // txt, properties

        boolean isFile = false;

        File file = new File("transaction\\data.txt");

        File parent = file.getParentFile();
        if(!parent.exists()){
            parent.mkdirs();
        }

        if(!file.exists()){

            try {
                isFile=  file.createNewFile();
                Desktop.getDesktop().open(file);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        System.out.println("isFile" + isFile);
        System.out.println("path" + file.getPath());
        System.out.println("absolute path" + file.getAbsolutePath());
        System.out.println("Canonical path" + file.getCanonicalPath());

        //java08
        // Files
        Files.createFile(Paths.get("transaction","result.txt"));
        Files.createDirectories(Paths.get("trader"));

    }
}
