package files.ddl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ex02 {

    public static void main(String[] args) {
        String path = "transactions";
        File file = new File(path);
        if(!file.exists()){
            System.out.println("File is not exist ");
            return ;
        }

//        File[] files = file.listFiles(f -> "draft".equalsIgnoreCase(f.getName().substring(0,f.getName().lastIndexOf('.'))));
 File[] files = file.listFiles(filee -> "draft".equalsIgnoreCase(filee.getName().substring(0,filee.getName().lastIndexOf("."))));
//        File[] files = file.listFiles();
        printf(files);


        // copy

        for( File source : files){
            // source : transaction/ draft.png
            // target : trader/draft.png




            String targetPath = "trader" + File.separator + source.getName();
            Path target = Paths.get(targetPath);
            try {
                Files.copy(source.toPath(), target, StandardCopyOption.REPLACE_EXISTING);

                System.out.println(source.getName() + "is copied");
            }
            catch(IOException e ){
                    e.printStackTrace();
            }

        }


    }


    private static void printf(File[] files){
        int line = 1;
        for(File file : files){
            System.out.println(line + " - "+file.getName());
            line ++ ;
        }
    }


}
