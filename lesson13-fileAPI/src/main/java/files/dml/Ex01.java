package files.dml;

import Bean.Trader;
import Bean.Transaction;

import java.awt.*;
import java.io.*;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {

        String path = "transactions/data.txt";

        File file = new File(path);

        FileWriter fw = null ;
        BufferedWriter bw = null ;

        try {
            fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);
//            bw.write("wellcome  to the FILE");

            bw.write("===================");
            bw.newLine();
//            bw.write("Exit the File");

            List<Transaction> inputData = getTransactions();

            for(Transaction transaction : inputData){
                bw.write(transaction.toString());
                bw.newLine();
            }




            Desktop.getDesktop().open(file);

        }catch(IOException e){
                e.printStackTrace();
        }finally {
//            try {
//                bw.close();
//                fw.close();
//            }catch(IOException e){
//                e.printStackTrace();;
//            }
            close(bw);
            close(fw);

        }
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

    private static java.util.List<Transaction> getTransactions(){

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
