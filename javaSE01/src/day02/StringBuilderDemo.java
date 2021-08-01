package day02;

/**
 * @author rustle
 * @date 2021-07-29 21:59
 * @Description 字符串增删改插
 * @return
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String line="好好学习java";
        StringBuilder stringBuilder=new StringBuilder(line);
        stringBuilder.append(",为了找个好工作");
        System.out.println(stringBuilder);

        stringBuilder.replace(9,16,"就是为了改变世界");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,8);
        System.out.println(stringBuilder);

        stringBuilder.insert(0,"活着");
        System.out.println(stringBuilder);
    }
}
