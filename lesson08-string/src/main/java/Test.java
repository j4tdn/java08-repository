public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("hello",3434);
        System.out.println(System.identityHashCode(item1.getName()));

        item1.setName("hello");
        System.out.println(System.identityHashCode(item1.getName()));

        item1.setName(new String("hello"));
        System.out.println(System.identityHashCode(item1.getName()));

    }
}
