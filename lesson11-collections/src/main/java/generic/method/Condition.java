package generic.method;

@FunctionalInterface //interface co 1 method truu tuong, co the thay the bang lamda?
public interface Condition <T> {
	boolean test(T t);
}
