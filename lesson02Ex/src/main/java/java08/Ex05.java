package java08;

public class Ex05 {
    //Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ cơ số 2
    public static void main(String[] args) {
        String s = changeToBinary(10);
        System.out.print("result: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    private static String changeToBinary(int number) {
        String result = "";
        while (number > 0) {
            result += (number % 2);
            number /= 2;
            System.out.println(result);
        }
        return result;
    }
}
