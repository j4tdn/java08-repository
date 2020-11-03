package view;

import Bean.Trader;
import Bean.Transaction;

import java.util.List;

public class Transactional {
    public static void main(String[] args) {

       //1  toMap   ;





        // 2  filter   ;

        

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
                new Transaction(2, getTraders().get(0),2012,1000),
                new Transaction(3, getTraders().get(0),2011,400),
                new Transaction(4, getTraders().get(0),2012,710),
                new Transaction(5, getTraders().get(0),2012,700),
                new Transaction(6, getTraders().get(0),2012,950)
        );
    }

}
