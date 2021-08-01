package day04;

/**
 * @author rustle
 * @date 2021-08-01 10:37
 * @Description °ü×°Àà
 * @return
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        int i = 127;
        Integer i1 = new Integer(i);
        Integer i2 = new Integer(i);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        //-128~127
        Integer i3 = Integer.valueOf(i);
        Integer i4 = Integer.valueOf(i);
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        int in=i1.intValue();
        System.out.println(in);
    }
}
