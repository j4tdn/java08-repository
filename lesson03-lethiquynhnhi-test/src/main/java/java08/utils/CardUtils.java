package java08.utils;

import java08.bean.Book;
import java08.bean.Card;

public class CardUtils {
    public static void exportCard(Card... card) {
        if (card == null) {
            return;
        } else {
            for (Card cardItem : card) {
                System.out.println("======================== Information of a Card =========================");
                System.out.println("Number of Card: " + cardItem.getId());
                System.out.println("Name Card: " + cardItem.getStudent().getFullname());
                for (Book book : cardItem.getBooks()) {
                    System.out.println("Books borrowed:" + book);
                }
                System.out.println("Date From: " + cardItem.getDate());
                System.out.println("Date To: " + cardItem.getEndDate());
                System.out.println("=========================================================================");
                System.out.println();
            }

        }
    }
}
