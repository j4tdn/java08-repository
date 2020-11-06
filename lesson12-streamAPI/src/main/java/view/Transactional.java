package view;

import Bean.Trader;
import Bean.Transaction;

import java.util.*;
import java.util.stream.Collectors;

public class Transactional {
    public static void main(String[] args) {


        List<Transaction> transactions = getTransactions();


       //1  toMap   ;

        Map<Integer,Transaction > uniqueTransactionsByInt= transactions.stream().collect(Collectors.toMap(t -> t.getId(), t -> t, (e1, e2) ->e1,() -> new LinkedHashMap<>()));
        Collection<Transaction> transactionList= uniqueTransactionsByInt.values();

        System.out.println(transactionList.getClass());
//        transactionList.forEach(t -> System.out.println(t));



        // 2  filter   ;

        Set<Integer> integerSet = new HashSet<>();

        List<Transaction> filteredTransactions = transactions.stream().filter(transaction -> integerSet.add(transaction.getId())).collect(Collectors.toList());
        filteredTransactions.forEach(t -> System.out.println(t));

        

        //type reference ;





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
