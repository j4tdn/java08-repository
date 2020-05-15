package java08.ex01;

import java.util.Scanner;

public class PointPositionWithCircle {
    private static Scanner ip = new Scanner(System.in);

    public static void main(String[] args) {
        Point i = new Point(0, 1);
        double r = 2;
        System.out.println("Enter coordinate of a point: ");
        Point a = new Point(Integer.parseInt(ip.nextLine()), Integer.parseInt(ip.nextLine()));
        checkDistance(i, a, r);
    }

    private static void checkDistance(Point i, Point a, double r) {
        int xt = a.getCoordinateX() - i.getCoordinateX();
        int yt = a.getCoordinateY() - i.getCoordinateY();
        double distance = Math.sqrt(xt * xt - yt * yt);
        if (distance > r) {
            System.out.println("This point lies external the circle!!!");
        } else if (distance == r) {
            System.out.println("This point lies on the circle!!!");
        } else {
            System.out.println("This point lies internal the circle!!!");
        }
    }
}
