package java08.generic;

@FunctionalInterface
public interface Condition<T> {
    boolean test(T t);
}
