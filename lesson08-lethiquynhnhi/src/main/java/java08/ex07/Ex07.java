package java08.ex07;

public class Ex07 {
    public static void main(String[] args) {
        String s = "aaabaaabbaaaaa";
        String longestSubString = getLongestSubString(s);
        System.out.println("Longest Sub String: " + longestSubString);

        String shortestSubString = getShortestSubString(s);
        System.out.println("Short Sub String: " + shortestSubString);
    }

    private static String getLongestSubString(String s) {
        int temp = 1;
        int max = 0;
        int position = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                temp++;
            } else {
                temp = 1;
            }

            if (temp > max) {
                max = temp;
                position = i - max + 2;
            }
        }
        return s.substring(position, position + max) + " [" + position + "]";
    }

    private static String getShortestSubString(String s) {
        int temp = 1;
        int min = s.length();
        int position = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                temp++;
            } else {
                temp = 1;
            }

            if (temp < min) {
                min = temp;
                position = i - min + 2;
            }
        }
        return s.substring(position, position + min) + " [" + position + "]";
    }
}
