package day02;

/**
 * @author rustle
 * @date 2021-07-29 20:56
 * @Description 判断当前字符串是否以给定字符串开头结尾
 * @return
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str="thinking in java";
        System.out.println(str.startsWith("think"));
        System.out.println(str.endsWith("java"));
    }
}
