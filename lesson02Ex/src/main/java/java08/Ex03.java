package java08;

public class Ex03 {
    //Nhập vào một số bất kỳ. Kiểm tra số đó có phải là số đối xứng hay không
    public static void main(String[] args) {
        System.out.println("result: " + checkSymmetryNumber(1331));
    }

    private static boolean checkSymmetryNumber(int number) {
        String s = number + "";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
