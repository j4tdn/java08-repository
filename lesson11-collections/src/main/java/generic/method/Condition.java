package generic.method;

@FunctionalInterface
public interface Condition <T>{
	boolean test(T t);

}
