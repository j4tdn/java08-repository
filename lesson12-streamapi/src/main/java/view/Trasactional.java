package view;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import bean.Trader;
import bean.Transaction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collector.*;

public class Trasactional<R> 
{
    public static void main( String[] args )
    {
        List<Trader> traders= getTrader();
        List<Transaction> transactions = getTrasaction(traders);
        
        //1
        transactions.stream()
        .filter(t->t.getYear()==2011)
        .sorted(Comparator.comparing(Transaction::getValue))//Transaction::getValue tra ve 1 function , trong function k co ham getCity
        .collect(Collectors.toList());
        
        //2
        transactions.stream()
        .filter(v->v.getValue()>300)
        .sorted(Comparator.comparing(t->t.getTrader().getCity()))
        .collect(Collectors.toList());
        
        //3
        traders.stream().map(Trader::getCity).distinct();
        
        //3.1.1
        transactions.stream().collect(Collectors.toMap(Transaction::getId, Function.identity(), (t1,t2)->t1,LinkedHashMap::new));
        
        //3.1.2
        Set<Integer> uniqueTrans= new HashSet<>();
        transactions.stream().filter(distinByKey(Transaction::getId))
        .collect(Collectors.toList())
        .forEach(System.out::println);
        
        //3.2
//        List<Integer> numbers= Arrays.asList(1,2,3,4,1,3);
//        numbers.stream()
//        .collect(groupingBy(Function.identity(),Collectors.counting()));
//        
        List<Integer> numbers=Arrays.asList(11,2,1,2,4);
		Map<Integer, Long> qtyMap=numbers.stream()
				.collect(groupingBy(Function.identity(),Collectors.counting()));
		;
        
        
    }
   

	


	private static <T,R> Predicate <T> distinByKey(Function<T,R> function) {
    	Set<R> uniqueTrans= new HashSet<>();
    	return t->uniqueTrans.add(function.apply(t));
    }
    
    private static List<Transaction> getTrasaction(List<Trader> traders){
    	return List.of(new Transaction(1,traders.get(0), 2011, 300),
    	        new Transaction(2,traders.get(1), 2012, 1000),
    	        new Transaction(3,traders.get(0), 2011, 400),
    	        new Transaction(3,traders.get(1), 2012, 710),
    	        new Transaction(5,traders.get(3), 2012, 700),
    	        new Transaction(2,traders.get(2), 2012, 950));
    }
    private static List<Trader> getTrader(){
    	
    	return  List.of(new Trader("Raoul", "Cambridge"),
    	new Trader("Mario", "Milan"),
    	new Trader("Alan", "Cambridge"),
    	new Trader("Brian", "Cambridge"));
    }
}
