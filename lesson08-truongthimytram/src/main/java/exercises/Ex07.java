package exercises;


public class Ex07 {

	public static void main(String[] args) {
		String s = "aaaaaaaabbaaabbbaaaaa";
		findLongestSubString(s);
		findShortestSubString(s);
	
	}

	private static void findLongestSubString(String s) {
        int temp = 1;
        int max = 0;
        int start = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                temp++;
            } else {
                temp = 1;
            }

            if (temp > max) {
                max = temp;
                start = i - max + 1;
            }
        }
        System.out.println(s.substring(start, start + max) + " [" + start + "]");
    }

    private static void findShortestSubString(String s) {
        int temp = 1;
        int min = s.length();
        int start = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                temp++;
            } else {
                temp = 1;
            }

            if (temp < min) {
                min = temp;
                start = i - min + 1;
            }
        }
        System.out.println(s.substring(start, start + min) + " [" + start + "]");
    }
}
