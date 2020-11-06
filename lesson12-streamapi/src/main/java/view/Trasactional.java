package view;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Trader;
import bean.Transaction;

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
        // kieemr tra xem cos 
		//Map<Integer, Long> qtyMap=numbers.stream()
		//		.collect(grouptingBy(Function.identity(),Collectors.counting()));
        
        //4
       traders.stream().filter(t->"Cabridge".equals(t.getCity())).sorted(Comparator.comparing(Trader::getName).reversed()).collect(Collectors.toList());
       
       //5
       //traders.stream().map(Trader::getName).sorted().collect(joining(","));
       
       //6
      boolean isMilanBased= traders.stream().anyMatch(t->t.getCity().equals("Milan"));
      System.out.println(" Live Milan"+isMilanBased);
       
       //7
      
       
       //8
      transactions.stream().filter(t->"Cambridge".equals(t.getTrader().getCity())).map(Transaction::getValue).collect(Collectors.toList());
      
      // 9
      Optional<Integer> optional= transactions.stream().max(Comparator.comparing(Transaction::getValue)).map(Transaction::getValue);
     System.out.println(optional.orElse(null));
//      if(optional.isPresent()) {
//    	  System.out.println(optional.get());
//      }
     
     //9.1
     Integer max2 = transactions.stream().map(Transaction::getValue).max(Comparator.comparing(Function.identity())).orElse(Integer.MIN_VALUE);
     
     //9.2 Stream <T>
     // InStream , DoubleStream , LongStream : Primitive Stream
     List<Integer> list= Arrays.asList();
//     Integer max3 = list.stream()
//				.mapToInt(Transaction::getValue) //->IntStream
//				.max()
//				.orElse(Integer.MIN_VALUE);
     
     //10
     System.out.println(transactions.stream().filter(t->t.getYear()==2011).mapToInt(Transaction::getValue).sum());
     
     transactions.stream().map(Transaction::getValue).reduce(Integer::sum);
     transactions.stream().map(Transaction::getValue).reduce((o1,o2)->o1+o2);
     
       
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
