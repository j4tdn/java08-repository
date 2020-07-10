package java08.ex06;

public class Ex06 {
    public static void main(String[] args) {
        int n = 100;
        String s = createString(n);
        System.out.println("position 100 is number: " + getNumber(s, n));
    }

    private static int getNumber(String s, int position) {
        return Integer.parseInt(s.charAt(position) + "");
    }

    private static String createString(int number) {
        String s = "";
        for (int i = 0; i < number; i++) {
            s = s.concat(i + "");
        }
        return s;
    }
}
