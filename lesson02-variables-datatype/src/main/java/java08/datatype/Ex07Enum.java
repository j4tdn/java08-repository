package java08.datatype;

import java08.common.CirclePosition;
import java08.common.Point;

public class Ex07Enum {
    public static void main(String[] args) {
         /* A(xA, yA)
            R: 5
            Kiem tra vi tri tuong doi cua A
            String: Trong, Tren ,Ngoai*/

        Point a = new Point(3, 4);
        Point o = new Point(0, 0);

        int r = 5;

        CirclePosition pos = getPointStatusWithCircle(a, o, r);
        System.out.println("result: " + pos.value);
    }

    public static CirclePosition getPointStatusWithCircle(Point a, Point o, int r) {
        double distance = Math.sqrt(Math.pow((a.x - o.x), 2) + Math.pow((a.y - o.y), 2));
        return (distance == r) ? CirclePosition.ONSIDE : (distance < r) ? CirclePosition.INSIDE : CirclePosition.OUTSIDE;
    }
}
