package day04;

import java.util.Arrays;

/**
 * @author rustle
 * @date 2021-08-01 9:18
 * @Description
 * @return
 */
public class Test {
    public static void main(String[] args) {
        Point p=new Point(1,2);
        System.out.println(p.toString());

        Point[] arr={new Point(3,4),new Point(5,6)};
        System.out.println(Arrays.toString(arr));

        Point p2=new Point(1,2);
        System.out.println(p.equals(p2));
    }
}
