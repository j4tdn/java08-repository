package java08.ex04;

import java.util.Scanner;

public class Ex04 {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.print("Nhập số: ");
            try {
                int number = Integer.parseInt(ip.nextLine());
                System.out.print("Chuyển số sang chữ là: ");
                readNumber(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Số nhập vào phải là chữ số");
            }
        } while (true);

    }

    private static String readANumber(int number) {
        String num = "";
        switch (number) {
            case 1: {
                num = "một";
                break;
            }
            case 2: {
                num = "hai";
                break;
            }
            case 3: {
                num = "ba";
                break;
            }
            case 4: {
                num = "bốn";
                break;
            }
            case 5: {
                num = "năm";
                break;
            }
            case 6: {
                num = "sáu";
                break;
            }
            case 7: {
                num = "bảy";
                break;
            }
            case 8: {
                num = "tám";
                break;
            }
            case 9: {
                num = "chín";
                break;
            }
        }
        return num;
    }

    private static void readNumber(int number) {
        int hangtram = number / 100;
        int hangchuc = (number - hangtram * 100) / 10;
        int donvi = number - hangtram * 100 - hangchuc * 10;

        if (hangtram == 0) {
            System.out.print("");
        } else {
            System.out.print(readANumber(hangtram) + " trăm");
        }

        switch (hangchuc) {
            case 0: {
                if (hangtram == 0 || (hangtram == 0 && donvi == 0)) {
                    System.out.print("");
                } else if (hangtram != 0 && donvi != 0) {
                    System.out.print(" linh");
                }
                break;
            }
            case 1: {
                System.out.print(" mười");
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                System.out.print(" " + readANumber(hangchuc) + " mươi");
                break;
            }
        }

        switch (donvi) {
            case 0: {
                if (hangtram == 0 && hangchuc == 0) {
                    System.out.print(" không");
                    break;
                }

            }
            case 1: {
                if (hangtram == 0 && hangchuc == 0) {
                    System.out.print(" " + readANumber(donvi));
                } else if (hangchuc == 1) {
                    System.out.println(" một");
                } else {
                    System.out.println(" mốt");
                }
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9: {
                System.out.print(" " + readANumber(donvi));
                break;
            }
        }
    }
}
