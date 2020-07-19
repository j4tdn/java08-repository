package java08.ex03;

import java.util.Scanner;

public class Ex03 {

    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        String email = inputEmail();
        System.out.println("Done");
    }

    private static String inputEmail() {
        String email = "";
        do {
            System.out.println("Enter email: ");
            try {
                email = ip.nextLine();
                checkEmail(email);
                return email;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
                System.out.println("========================");
            }

        } while (true);

    }

    private static boolean checkEmail(String email) throws EmailException {
        String regexEmail = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]+$";
        if (!email.matches(regexEmail)) {
            throw new EmailException("Email is invalid!!!");
        }
        return true;
    }
}
