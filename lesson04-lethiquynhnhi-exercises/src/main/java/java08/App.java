package java08;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        test("s5ssa3ah5k");
        //checkStr("ssa3ah");
    }

    private static void test(String s) {
        int indexFirstNumber = -1;
        int indexSecondNumber = -1;
        String sub = "";
        for (int i = 0; i < s.length(); i++) {
             if (Character.isDigit(s.charAt(i))) {
                sub = checkStr(s.substring(indexFirstNumber + 1, i));

                indexFirstNumber = indexSecondNumber;
                indexSecondNumber = i;
            } else if (i == s.length() - 1) {
                sub = checkStr(s.substring(indexFirstNumber + 1, i + 1));
            }

            if (sub.length() > 2) {
                System.out.println("Chuoi thoa man: " + sub);
                sub = "";
            }

        }

    }

    private static String checkStr(String subString) {
        String leftString = "";
        String rightString = "";
        String res = "";
        for (int i = 0; i < subString.length(); i++) {
            if (Character.isDigit(subString.charAt(i))) {
                leftString = subString.substring(0, i);
                rightString = subString.substring(i + 1, subString.length());
                res = subString.charAt(i) + "";
            }
        }

        System.out.println("leftString: " + leftString);
        System.out.println("rightString: " + rightString);

        int lesserLength = rightString.length() < leftString.length() ? rightString.length() : leftString.length();

        for (int i = 0; i < lesserLength; i++) {
            if (rightString.charAt(i) == leftString.charAt(leftString.length() - 1 - i)) {
                res = rightString.charAt(i) + res + rightString.charAt(i);
            }
        }
        System.out.println("res: " + res);
        return res;
    }
}
