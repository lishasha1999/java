package day01;

/**
 * @author rustle
 * @date 2021-07-27 21:15
 * @Description String.IndexOf(str)
 * @return  查询给定字符串在当前字符串的位置,若不存在返回-1
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String str="thinking in java";
        System.out.println(str.indexOf("in" ));

        System.out.println(str.indexOf("in",3));
        System.out.println(str.lastIndexOf("in"));
    }
}
