package java08.files.dml;

import java08.bean.Trader;
import java08.bean.Transaction;

import java.awt.*;
import java.io.*;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        String path = "transaction/data.txt";
        File file = new File(path);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("============================");
            bw.newLine();
            List<Trader> traders = getTraders();
            List<Transaction> inputData = getTransactions(traders);
            for (Transaction transaction : inputData) {
                bw.write(transaction.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                close(bw);
                close(fw);
                Desktop.getDesktop().open(file);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private static List<Trader> getTraders() {
        return List.of(new Trader("Raoul", "Cambridge"),
                new Trader("Mario", "Milan"),
                new Trader("Alan", "Cambridge"),
                new Trader("Alan", "Cambridge"),
                new Trader("Brian", "Cambridge"));
    }

    private static List<Transaction> getTransactions(java.util.List<Trader> traders) {
        return List.of(new Transaction(1, traders.get(0), 2011, 300),
                new Transaction(1, traders.get(1), 2012, 1000),
                new Transaction(2, traders.get(0), 2011, 400),
                new Transaction(2, traders.get(1), 2012, 710),
                new Transaction(5, traders.get(3), 2012, 700),
                new Transaction(5, traders.get(2), 2012, 950));
    }

    private static <T extends Closeable> void close(T closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
