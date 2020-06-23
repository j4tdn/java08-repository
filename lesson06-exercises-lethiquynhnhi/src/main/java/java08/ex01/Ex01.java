package java08.ex01;

import java.util.Scanner;

public class Ex01 {
    private static final Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        input();
    }

    private static void input() {
        do {
            try {
                System.out.print("Enter first number: ");
                int number1 = Integer.parseInt(ip.nextLine());
                System.out.print("Enter second number: ");
                int number2 = Integer.parseInt(ip.nextLine());
                double value = firstDegreeFunction(number1, number2);
                System.out.println("Value of First-Degree Function: " + value);
                break;
            } catch (ArithmeticException e1) {
                System.out.println("Divide by zero /0!!!");
            }catch (NumberFormatException e2){
                System.out.println("Numbers are invalid!!!");
            }

        } while (true);
    }

    private static double firstDegreeFunction(int a, int b) throws ArithmeticException {
        return -b /a;
    }
}
