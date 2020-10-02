package generic;

@FunctionalInterface
public interface Conditional<E> {
	public <E> boolean test(E digit);
}
