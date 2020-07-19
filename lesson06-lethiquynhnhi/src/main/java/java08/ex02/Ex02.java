package java08.ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {

        String id = inputId();
        String name = inputName();
        String password = inputPassword();
        String birthday = inputBirthday();
        Trainee trainee = new Trainee(id, name, password, birthday);
        System.out.println(trainee);
        System.out.println("You registered successfully!!!!");
    }

    private static boolean checkId(String id) throws AccountException {
        if (id.length() != 3) {
            throw new AccountException("==> Length of id must have 3 characters!!!");
        } else {
            for (int i = 0; i < id.length(); i++) {
                if (!Character.isDigit(id.charAt(i))) {
                    throw new AccountException("==> Id must be a number!!!");
                }
            }
        }
        return true;
    }

    private static String inputId() {
        String charBegin = "bkit-";
        String id = "";
        do {
            System.out.println("Enter trainee's id: ");
            try {
                id = ip.nextLine();
                checkId(id);
                return (charBegin + id);
            } catch (AccountException e) {
                System.out.println(e.getMessage());
                System.out.println("==========================");
            }
        } while (true);
    }

    private static boolean checkName(String name) throws AccountException {
        if (!name.matches("[A-z]+")) {
            throw new AccountException("Name must only have string!!!");
        }
        return true;
    }

    private static String inputName() {
        String name = "";
        do {
            System.out.println("Enter trainee's name: ");
            try {
                name = ip.nextLine();
                checkName(name);
                return name;
            } catch (AccountException e) {
                System.out.println(e.getMessage());
                System.out.println("==========================");
            }
        } while (true);
    }

    private static boolean checkPassword(String password) throws AccountException {
        /**
         * ^                 # start-of-string
         * (?=.*[0-9])       # a digit must occur at least once
         * (?=.*[a-z])       # a lower case letter must occur at least once
         * (?=.*[A-Z])       # an upper case letter must occur at least once
         * (?=.*[@#$%^&+=])  # a special character must occur at least once
         * (?=\S+$)          # no whitespace allowed in the entire string
         * .{8,}             # anything, at least eight places though
         * $                 # end-of-string
         **/

        String stringRegex = "^(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,63}$";

        if (!password.matches(stringRegex)) {
            throw new AccountException("Password must have at least a uppercase letter and at least a special letter!!!");
        }

        return true;
    }

    private static String inputPassword() {
        String password = "";
        do {
            System.out.println("Enter trainee's password: ");
            try {
                password = ip.nextLine();
                checkPassword(password);
                return password;
            } catch (AccountException e) {
                System.out.println(e.getMessage());
                System.out.println("==========================");
            }
        } while (true);
    }

    private static boolean checkBirthDay(String birthday) throws AccountException {

        DateFormat df = new SimpleDateFormat(DATE_FORMAT);

        try {
            Date date = df.parse(birthday);
            Calendar c = DateUtils.toCalendar(date);
            int maxDayOfMonth = c.getActualMaximum(Calendar.MONTH);
            Year year = Year.of(Calendar.YEAR);

            if (year.isLeap()) {
                if (c.get(Calendar.MONTH) == Calendar.FEBRUARY) {
                    maxDayOfMonth = 29;
                }
            }

            if (c.get(Calendar.DAY_OF_MONTH) <= 0 || c.get(Calendar.DAY_OF_MONTH) > maxDayOfMonth) {
                throw new AccountException("Date is invalid!!!");
            }
        } catch (ParseException e) {
            throw new AccountException("Birthday is wrong format!!!\n Please input birthday has format: 'dd/MM/yyyy'!!!");
        }

        return true;
    }

    private static String inputBirthday() {
        String birthday = "";
        do {
            System.out.println("Enter trainee's birthday: ");
            try {
                birthday = ip.nextLine();
                checkBirthDay(birthday);
            } catch (AccountException e) {
                System.out.println(e.getMessage());
                System.out.println("==========================");
            }
            return birthday;
        } while (true);
    }

}