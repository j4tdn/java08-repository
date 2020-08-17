package ex_08;

public class Ex07 {
public static void main(String[] args) {
        String setofletters = "‘aaabaaabbaaaaa’"; /* 15 */
        int output = runLongestIndex(setofletters);
        System.out.println("" + output);
    }

    public static int runLongestIndex(String setofletters) {
        int ctr = 1;
        int j = 0;
        int output = 0;

        for (int i = 0; i < setofletters.length() - 1; i++) {
            j=i;
                while (i <setofletters.length()-1 && setofletters.charAt(i)==setofletters.charAt(i+1)) {
                    i++;
                    ctr++;
                }

                if (ctr > output) {
                    output = j;
                }
               
            ctr = 1;
        }
        for(int i=0;i<output;i++) {
        	 System.out.println(setofletters.charAt(i));
        }
       
        return output;
    }
}
