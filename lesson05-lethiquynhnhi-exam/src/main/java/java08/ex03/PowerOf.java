package java08.ex03;

public class PowerOf {
    public static void main(String[] args) {
        System.out.println("isPowerOf: " + isPowerOf(64,4));
    }

    private static boolean isPowerOf(int a, int b){
        int c = 0;
        if(a == 1){
            return true;
        }else{
            while (a > 0){
                c = a % b;
                a = a / b;
            }
            if(c == 1){
                return  true;
            }else{
                return false;
            }
        }
    }
}
