package files.dml;

import Bean.Trader;
import Bean.Transaction;

import java.awt.*;
import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class Ex02 {

    public static void main(String[] args) throws IOException {

        String pathname = "transactions/data.txt";

        Path path = Paths.get(pathname);

//        File file = new File(path);

        List<String> list = getTransactions().stream().map(Transaction::toString).collect(Collectors.toList());

        Files.write(path,list, StandardOpenOption.APPEND);


        Desktop.getDesktop().open(path.toFile());
    }

    private static <T extends Closeable> void close(T close){
        if(close != null ){
            try {
                close.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    private static List<Trader> getTraders(){
        return List.of(
                new Trader("Raoul","Cambridge"),
                new Trader("Mario","Milan"),
                new Trader("Alan", "Cambridge"),
                new Trader("Brian","Cambridge")
        );
    }

    private static List<Transaction> getTransactions(){

        return List.of(
                new Transaction(1, getTraders().get(3), 2011,300),
                new Transaction(2, getTraders().get(3),2012,1000),
                new Transaction(3, getTraders().get(3),2011,400),
                new Transaction(3, getTraders().get(0),2012,710),
                new Transaction(5, getTraders().get(0),2012,700),
                new Transaction(6, getTraders().get(0),2012,950)
        );
    }

}
