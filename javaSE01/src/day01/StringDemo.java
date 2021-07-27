package day01;

/**
 * @author rustle
 * @date 2021-07-27 19:34
 * @Description String∑µªÿ÷µ
 * @return
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);

        s1 += "123";
        System.out.println(s1);
        System.out.println(s2);

        String s3 = new String("Hello");
        System.out.println(s1 == s3);

        System.out.println(s2.equals(s3));

        String ss = "123";
        String s4 = s2 + ss;
        System.out.println(ss == s4);

        String s5='1'+23+"abc";
        System.out.println(s5);
    }
}
