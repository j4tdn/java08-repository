package java08.lesson03_ungmydieu_test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	QLTV qltv = new QLTV();
    	
    	Student s1 = new Student("sv1", 21, "class1");
    	Student s2 = new Student("sv2", 21, "class2");
    	
    	Book b1 = new Book(1, "book1", "VietNam");
    	Book b2 = new Book(2, "book2", "VietNam");
    	Book b3 = new Book(3, "book3", "VietNam");
    	Book b4 = new Book(4, "book4", "VietNam");
    	
    	Card card1 = qltv.borrow(s1, b1, b2);
    	Card card2 = qltv.borrow(s2, b1, b3, b4);
    	
    	System.out.println(card1.toString());
    	System.out.println("=============");
    	System.out.println(card2.toString());
    }
}
