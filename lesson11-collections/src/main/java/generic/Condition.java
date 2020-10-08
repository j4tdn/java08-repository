package generic;

@FunctionalInterface
public interface Condition<T> {
	boolean test(T t);
}
