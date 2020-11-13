package java08.files.dml;

import java08.bean.Trader;
import java08.bean.Transaction;

import java.awt.*;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class Ex03 {
    public static void main(String[] args) {
        String pathName = "transaction/data.txt";
        Path path = Paths.get(pathName);

        try {
            List<String> lines = Files.readAllLines(path);
            List<Transaction> transactions = lines.stream()
                    .map(Transaction::new)
                    .collect(Collectors.toList());
            transactions.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
