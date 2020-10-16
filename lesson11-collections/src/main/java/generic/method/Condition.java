package generic.method;

@FunctionalInterface
public interface Condition<T> {
	public boolean test(T t);
}
